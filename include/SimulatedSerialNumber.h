#ifndef __cplusplus
#error This is a C++ include file and cannot be used from plain C.
#endif
#ifndef SimulatedSerialNumber_h
#define SimulatedSerialNumber_h
//
// ALMA - Atacama Large Millimiter Array
// (c) Associated Universities Inc., 2010
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA
//
// $Id: SimulatedSerialNumber.h 199109 2013-12-18 18:37:52Z rmarson $
// $Source: /diskb/tmp/stefano/project2/CVS/CONTROL/Common/GenHwDevice/include/SimulatedSerialNumber.h,v $
//


#include <string>


namespace AMB
{
    namespace Utils
    {
        // Implements DJB hashing, intended for serial numbers creation in
        // simulation.
        unsigned int DJBHash(const std::string& str);

        unsigned long long getSimSerialNumber(
            const std::string& componentName,
            const std::string& assemblyName);

        unsigned long long getSimSerialNumber(
            unsigned long long hashedComponentName,
            const std::string& deviceType);
    };
}
#endif
