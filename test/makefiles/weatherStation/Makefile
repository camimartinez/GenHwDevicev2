#******************************************************************************
# @(#) $Id: Makefile 199193 2013-12-19 16:51:49Z rmarson $
#
# ALMA - Atacama Large Millimiter Array
# (c) Associated Universities Inc., 2004, 2005 
#
# This library is free software; you can redistribute it and/or
# modify it under the terms of the GNU Lesser General Public
# License as published by the Free Software Foundation; either
# version 2.1 of the License, or (at your option) any later version.
# 
# This library is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
# Lesser General Public License for more details.
# 
# You should have received a copy of the GNU Lesser General Public
# License along with this library; if not, write to the Free Software
# Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA
#
#******************************************************************************

#
# user definable C-compilation flags
#USER_CFLAGS = 

#
# additional include and library search paths
USER_INC = -I../include/gSOAP
USER_LIB = -lstdc++


#
# Generated Code Name
# --------------------
MODULE_NAME =  WeatherStation
VENDOR_CLASS = $(MODULE_NAME)Eth
DEVICE_TYPE = ETH

LIBRARIES  = gSOAP
LIBRARIES += $(VENDOR_CLASS)Sim
LIBRARIES += $(MODULE_NAME)CompSimImpl

gSOAP_OBJECTS = weatherWebService soapC stdsoap2 soapgetCurrentWeatherDataBindingProxy
gSOAP_LIBS =

$(VENDOR_CLASS)Sim_OBJECTS = $(VENDOR_CLASS)Sim
$(VENDOR_CLASS)Sim_LIBS = $(VENDOR_CLASS) logging

$(MODULE_NAME)CompSimImpl_OBJECTS = $(MODULE_NAME)CompSimImpl
$(MODULE_NAME)CompSimImpl_LIBS = $(MODULE_NAME)Impl $(VENDOR_CLASS)Sim logging SimulatedSerialNumber

# Generated classes (DO NOT TOUCH)
LIBRARIES += $(VENDOR_CLASS)
LIBRARIES += $(MODULE_NAME)Base $(MODULE_NAME)Impl

$(MODULE_NAME)Base_OBJECTS = $(MODULE_NAME)Base
$(MODULE_NAME)Base_LIBS = $(MODULE_NAME)BaseStubs TETimeUtil EthernetDevice \
	$(MODULE_NAME)Eth logging

$(VENDOR_CLASS)_OBJECTS = $(VENDOR_CLASS)
$(VENDOR_CLASS)_LIBS = logging controlXmlParser gSOAP

$(MODULE_NAME)Impl_OBJECTS = $(MODULE_NAME)Impl
$(MODULE_NAME)Impl_LIBS = $(MODULE_NAME)Stubs $(MODULE_NAME)Base


PY_PACKAGES        = CCL

CDB_SCHEMAS = $(MODULE_NAME)Base $(MODULE_NAME)

IDL_FILES  = $(MODULE_NAME)Base $(MODULE_NAME)
$(MODULE_NAME)BaseStubs_LIBS = HardwareDeviceStubs EthernetDeviceExceptions
$(MODULE_NAME)Stubs_LIBS = $(MODULE_NAME)BaseStubs
$(MODULE_NAME)CompSimStubs_LIBS = $(MODULE_NAME)Stubs

#
# other files to be installed
#----------------------------
INSTALL_FILES = ../config/TMCDBWeatherStationAdd.xml

#
# list of all possible C-sources (used to create automatic dependencies)
# ------------------------------
CSOURCENAMES = \
	$(foreach exe, $(EXECUTABLES) $(EXECUTABLES_L), $($(exe)_OBJECTS)) \
	$(foreach rtos, $(RTAI_MODULES) , $($(rtos)_OBJECTS)) \
	$(foreach lib, $(LIBRARIES) $(LIBRARIES_L), $($(lib)_OBJECTS))

#
#>>>>> END OF standard rules

#
# INCLUDE STANDARDS
# -----------------

MAKEDIRTMP := $(shell searchFile include/acsMakefile)
ifneq ($(MAKEDIRTMP),\#error\#)
   MAKEDIR := $(MAKEDIRTMP)/include
   include $(MAKEDIR)/acsMakefile
endif


# Location of Control's code generation framework.
# ------------------------------------------------
GenHwDir := /lib/ControlGenHwDevicev2
GenHwLocation := $(shell searchFile $(GenHwDir)/lib/ControlGenHwDevicev2.jar)
ifeq ($(GenHwLocation), \#error\#)
   GenHwLocation := $(INSTALL_ROOT)/lib
endif
empty:=
space:= $(empty) $(empty)
GEN_CLASSPATH = \
$(GenHwLocation)$(GenHwDir):\
$(GenHwLocation)$(GenHwDir)/lib/ControlGenHwDevicev2.jar:\
$(GenHwLocation)$(GenHwDir)/config/templates:\
$(GenHwLocation)$(GenHwDir)/config/workflow:\
$(GenHwLocation)$(GenHwDir)/lib/antlr-4.6-complete.jar:\
$(GenHwLocation)$(GenHwDir)/lib/asdmIDLTypes.jar:\
$(GenHwLocation)$(GenHwDir)/lib/asdmRuntime.jar:\
$(GenHwLocation)$(GenHwDir)/lib/commons-cli-1.3.1.jar:\
$(GenHwLocation)$(GenHwDir)/lib/commons-lang3-3.5.jar:\
$(GenHwLocation)$(GenHwDir)/lib/commons-logging-1.2.jar:\
$(GenHwLocation)$(GenHwDir)/lib/emf_v2.13.jar:\
$(GenHwLocation)$(GenHwDir)/lib/icu4j-57_1.jar:\
$(GenHwLocation)$(GenHwDir)/lib/log4j-1.2.17.jar:\
$(GenHwLocation)$(GenHwDir)/lib/maciSchemaBindings.jar:\
$(GenHwLocation)$(GenHwDir)/lib/mwe_v2.8.3.jar:\
$(GenHwLocation)$(GenHwDir)/lib/mwe2_v2.8.3.jar:\
$(GenHwLocation)$(GenHwDir)/lib/ojdbc14.jar:\
$(GenHwLocation)$(GenHwDir)/lib/xpand_v2.0.0.jar

# List of generated files and directories.
GEN_LIST = ../doc/* \
    ../config/CDB/schemas/$(MODULE_NAME)Base.xsd \
    ../idl/$(MODULE_NAME)*Base*.idl \
    ../idl/$(MODULE_NAME)Add.sql \
    ../include/$(MODULE_NAME)*Base*.h \
    $(MODULE_NAME)*Base*.cpp \
    $(MODULE_NAME)Def.py \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)ChessboardPlugin.java \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)ControlPointPresentationModel.java \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)ControlPoints.java \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)DetailsPluginFactory.java \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)DevicePlugin.java \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)DevicePresentationModel.java \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)MonitorPointPresentationModel.java \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)MonitorPoints.java \
    alma/Control/device/gui/$(MODULE_NAME)/$(MODULE_NAME)Panel.java \
    CCL/__init__.py \
    CCL/$(MODULE_NAME)*Base*.py \
    ../test/Test$(MODULE_NAME)HWSimImpl.cpp \
    ../test/Test$(MODULE_NAME)AmbDeviceInt.cpp \

# List of generated files and directories for web service
GEN_LIST_WebService = getCurrentWeatherDataBinding.getCurrentWeatherData.req.xml \
    getCurrentWeatherDataBinding.getCurrentWeatherData.res.xml \
    getCurrentWeatherDataBinding.nsmap \
    soapC.cpp \
    soapgetCurrentWeatherDataBindingProxy.cpp \
    ../include/soapgetCurrentWeatherDataBindingProxy.h \
    ../include/soapH.h \
    ../include/soapStub.h \
    ../include/weatherWebService.h


#
# TARGETS
# -------
all: gen do_all
	@echo " . . . 'all' done" 

compile: do_all
	@echo " . . . 'Compile' done"

gen:
	@echo " . . . Code generation for $(MODULE_NAME)"
	java -classpath $(subst $(space),,$(GEN_CLASSPATH)) alma.buildtime.gen.LinuxGen $(MODULE_NAME) $(DEVICE_TYPE)
	@echo " . . . Code generation done"

clean_gen:
	$(RM) $(GEN_LIST)

clean: clean_gen clean_all
	@echo " . . . clean done"

clean_dist: clean clean_all clean_dist_all 
	@echo " . . . clean_dist done"

man: do_man 
	@echo " . . . man page(s) done"

install: install_all
	@echo " . . . installation done"

gen_webService:
	@echo ".... generating webservice communication base classes with gSOAP"
	@echo "please make sure to have communication to the webservice before issuing this command"
	./wsdl2h  -o weatherWebService.h http://weather.aiv.alma.cl/ws_weather_jsonf.php?wsdl
	./soapcpp2  -i -C -I../include/gSOAP weatherWebService.h
	mv *.h ../include/

clean_gen_webService:
	$(RM) $(GEN_LIST_WebService)
