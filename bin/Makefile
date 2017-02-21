#*******************************************************************************
# PPPPPPPP
#
# "@(#) $Id$"
#
# Makefile of ........
#
# who       when      what
# --------  --------  ----------------------------------------------
# almamgr  14/02/17  created
#

#*******************************************************************************
# This Makefile follows VLT Standards (see Makefile(5) for more).
#*******************************************************************************
# REMARKS
#    None
#------------------------------------------------------------------------

#
# MODULE CODE DESCRIPTION:
# ------------------------
# As a general rule:  public file are "cleaned" and "installed"  
#                     local (_L) are not "installed".

# Type-safe log code generation

ACSLOGTSDEF = ControlPointArchival

EXECUTABLES += getSimSerialNumber
# <brief description of getSimSerialNumber program>
getSimSerialNumber_OBJECTS += getSimSerialNumber
getSimSerialNumber_LIBS += SimulatedSerialNumber
getSimSerialNumber_LIBS += C++

LIBRARIES =  SimulatedSerialNumber MonitoringUtils
SimulatedSerialNumber_OBJECTS += SimulatedSerialNumber
SimulatedSerialNumber_LDFLAGS += -lstdc++
MonitoringUtils_OBJECTS += Utils
MonitoringUtils_LIBS += ControlExceptions

#
# Includes (.h) files (public only)
# ---------------------------------
INCLUDES += CANError.h
INCLUDES += CANTypes.h
INCLUDES += TypeConversion.h
INCLUDES += Utils.h
INCLUDES += Utils.i
INCLUDES += SimulatedSerialNumber.h 


# Jarfiles and their directories
#
JARFILES += ControlGenHwDevicev2
ControlGenHwDevicev2_DIRS += alma

#
# java sources in Jarfile on/off
DEBUG = on


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

#
# TARGETS
# -------
all:	do_all
	jar ufe ../lib/ControlGenHwDevicev2.jar alma.buildtime.gen.LinuxGen
	@echo " . . . 'all' done" 

clean : clean_all 
	@echo " . . . clean done"

clean_dist : clean_all clean_dist_all 
	@echo " . . . clean_dist done"

man   : do_man 
	@echo " . . . man page(s) done"

install : install_all
	test -e $(INSTALL_ROOT)/lib/ControlGenHwDevicev2 || mkdir $(INSTALL_ROOT)/lib/ControlGenHwDevicev2
	cp --recursive ../lib ../config ../idl \
		$(INSTALL_ROOT)/lib/ControlGenHwDevicev2
	cp ../include/Device.Makefile $(INSTALL_ROOT)/include
	test -e $(INSTALL_ROOT)/lib/ControlGenHwDevicev2/_null || \
		mkdir $(INSTALL_ROOT)/lib/ControlGenHwDevicev2/_null
	chmod --recursive u+w,a-x,a+rX $(INSTALL_ROOT)/lib/ControlGenHwDevicev2 \
		$(INSTALL_ROOT)/include/Device.Makefile
	@echo " . . . installation done"


#___oOo___
