#ifndef TypeConversion_h
#define TypeConversion_h
#ifndef __cplusplus
#error This is a C++ include file and cannot be used from plain C.
#endif

/*******************************************************************************
 * ALMA - Atacama Large Millimeter Array
 * (c) Associated Universities Inc., 2009
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA
 *
 * $Id: TypeConversion.h 206125 2014-06-12 18:27:55Z rmarson $
 *
 */


#include <vector>
#include <sstream>
#include <typeinfo>
#include <cstring>
#include <unistd.h>
#include <TETimeUtil.h>
#include <CANTypes.h>
#include <CANError.h>


namespace AMB
{
    /// This class provides all necessary tools to convert from normal values to
    /// CAN bus vectors, and vice versa. C++ templates are used to support all
    /// allowed data types (see ../test/TestTypeConversion.cpp).
    /// WARNING: Not tested with string types!

    class TypeConversion
    {
        public:
        /// Convert a vector of Types to a CAN::byte_t vector, specifying the
        /// required number of bytes for each CAN::byte_t.
        template< typename Type >
        static void valueToData(std::vector< CAN::byte_t >& raw,
            const std::vector< Type >& vvalue, unsigned int nbytes)
        {
            if(vvalue.size()*sizeof(Type) > 8)
            {
                throw CAN::Error("CAN data must not contain more than 8 "
                    "bytes.");
            }

            union Conversion
            {
                CAN::byte_t byte[sizeof(Type)];
                Type dataType;
            } data;

            raw.clear();
            for(unsigned int i(0U); i < vvalue.size(); ++i)
            {
                data.dataType = vvalue.at(i);
                #if __BYTE_ORDER == __LITTLE_ENDIAN
                for(int j(nbytes - 1); j >= 0; --j)
                #else
                for(int j(0); j < nbytes; ++j)
                #endif
                {
                    raw.push_back(data.byte[j]);
                }
            }
        };

        /// Convert a vector of Types to a CAN::byte_t vector. The number of
        /// bytes of the Type data type is assumed for each CAN::byte_t.
        template< typename Type >
        static void valueToData(std::vector< CAN::byte_t >& raw,
            const std::vector< Type >& vvalue)
        {
            valueToData(raw, vvalue, sizeof(Type));
        };

        /// Convert a Type value to a CAN::byte_t vector, specifying the
        /// required number of bytes for each CAN::byte_t.
        template< typename Type >
        static void valueToData(std::vector< CAN::byte_t >& raw,
            const Type& value, unsigned int nbytes)
        {
            std::vector<Type> vvalue;
            vvalue.push_back(value);

            valueToData<Type>(raw, vvalue, nbytes);
        };

        /// Convert a Type value to a CAN::byte_t vector. The number of bytes of
        /// the Type data type is assumed for each CAN::byte_t.
        template< typename Type >
        static void valueToData(std::vector< CAN::byte_t >& raw,
            const Type& value)
        {
            valueToData(raw, value, sizeof(Type));
        };

        /// Convert a CAN::byte_t vector to a vector of Types.
        template< typename Type >
        static void dataToValue(const std::vector< CAN::byte_t >& raw,
            std::vector< Type >& value)
        {
            if((raw.size() % sizeof(Type)) != 0)
            {
                throw CAN::Error("CAN data is not compatible with data type.");
            }

            union Conversion
            {
                CAN::byte_t byte[sizeof(Type)];
                Type dataType;
            } data;

            value.resize(raw.size() / sizeof(Type), 0);

            std::vector< CAN::byte_t >::const_iterator it(raw.begin());
            for(unsigned int i(0U); i < value.size(); ++i)
            {
                data.dataType = 0;
                #if __BYTE_ORDER == __LITTLE_ENDIAN
                for(int j(sizeof(Type) - 1); j >= 0; --j)
                #else
                for(int j(0); j < sizeof(Type); ++j)
                #endif
                {
                    data.byte[j] = *it;
                    ++it;
                }

                value.at(i) = data.dataType;
            }
        };

        /// Convert a CAN::byte_t vector to a vector of Type by using a
        /// particular number of raw bytes (numberOfRawBytes).
        template< typename Type >
        static void dataToValue(const std::vector< CAN::byte_t >& raw,
            std::vector< Type >& output, std::size_t numberOfRawBytes)
        {
            output.clear();
            if(numberOfRawBytes > sizeof(Type))
            {
                std::ostringstream out;
                out << "Converted CAN data does not fit into output data type. "
                    "sizeof("
                    << typeid(Type).name()
                    << ") = "
                    << sizeof(Type)
                    << ", number of bytes to convert = "
                    << numberOfRawBytes
                    << ".";
                throw CAN::Error(out.str().c_str());
            }
            else if((raw.size() % numberOfRawBytes) != 0)
            {
                std::ostringstream out;
                out << "Not all CAN data can be converted because slices are "
                    "not compatible with the target data type. Length of the "
                    "raw data vector = "
                    << raw.size()
                    << ", number of raw data bytes per target data type = "
                    << numberOfRawBytes
                    << ".";
                throw CAN::Error(out.str().c_str());
            }
            else if(raw.empty() == true)
            {
                std::ostringstream out;
                out << "CAN data vector is empty.";
                throw CAN::Error(out.str().c_str());
            }

            // Populate the byte array in the correct order and copy them then
            // to the output vector.
            output.clear();
            std::vector< u_int8_t > byteArray;

            for(int i((raw.size() / numberOfRawBytes)-1); i >= 0; --i)
            {
                byteArray.clear();
                byteArray.resize(sizeof(Type));

                // Populate the byte array in the correct order
                for(std::size_t j(0); j < numberOfRawBytes; ++j)
                {
                    #if __BYTE_ORDER == __LITTLE_ENDIAN
                    byteArray.at(j) =
                        raw.at(raw.size() - 1 - j - (numberOfRawBytes * i));
                    #else
                    byteArray.at(sizeof(Type) - numberOfRawBytes + j) =
                        raw.at(j + (numberOfRawBytes * i));
                    #endif
                }

              output.push_back(*(reinterpret_cast< Type* >(&byteArray[0])));
            }
        };

        /// Convert a CAN::byte_t vector to a Type value.
        template< typename Type >
        static void dataToValue(const std::vector< CAN::byte_t >& raw,
            Type& value)
        {
            std::vector< Type > vvalue;
            vvalue.push_back(value);

            dataToValue(raw, vvalue);
            value = vvalue.at(0);
        };

        /// Convert a CAN::byte_t vector to a Type value by using a particular
        /// number of raw bytes (size).
        template< typename Type >
        static void dataToValue(const std::vector< CAN::byte_t >& raw,
            Type& value, unsigned int size)
        {
            std::vector< Type > vvalue;
            vvalue.push_back(value);

            dataToValue(raw, vvalue, (std::size_t)size);
            value = vvalue.at(0);
        };
    };
}
#endif
