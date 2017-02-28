#! /usr/bin/env python
#*******************************************************************************
# ALMA - Atacama Large Millimiter Array
# Copyright (c) ESO - European Southern Observatory, 2011
# (in the framework of the ALMA collaboration).
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
# "@(#) $Id: LTS2Py.xslt,v 1.4 2011/10/25 14:49:48 hsommer Exp $"
#
# who       when      what
# --------  --------  ----------------------------------------------
# nbarriga  2007-01-29  created
#
######################################################################
'''
Some form of custom documentation goes here...
'''
######################################################################
from Acspy.Common.Log import getLogger
import ACSLog
from socket import gethostname
from Acspy.Common.TimeHelper import TimeUtil
import time
from os import getpid
from traceback import extract_stack
######################################################################
class ControlPointUsed:
        def __init__(self, array=None, antenna=None):
                self.init()
                self.array=array
                self.antenna=antenna
        def init(self):
		self._members={}
		self._logger=getLogger("loggingts --")
		self.name="ControlPointUsed"
		self.audience="System Engineers"
		self.shortDescription="A control point has been invoked."
                self.priority=ACSLog.ACS_LOG_DEBUG
	def log(self):
		msg=self.shortDescription
		data=[ACSLog.NVPair("logName",self.name)]
		#data.append(ACSLog.NVPair("audience",self.audience))
		for key, value in self._members.items():
			data.append(ACSLog.NVPair(str(key),str(value)))
		cur_stack=extract_stack()
		rtCont=ACSLog.RTContext("",str(getpid()),str(gethostname()).replace("<", "").replace(">", ""),"","")
		srcInfo=ACSLog.SourceInfo(str(cur_stack[0][0]),str(cur_stack[0][2]),long(cur_stack[0][1]))
		timestamp=TimeUtil().py2epoch(time.time()).value
		self._logger.logTypeSafe(self.priority, timestamp, msg, rtCont, srcInfo, data, self.audience, self.array, self.antenna)
        def setArray(self, array):
                self.array=array
        def setAntenna(self, antenna):
                self.antenna=antenna
        def getArray(self):
                return self.array
        def getAntenna(self):
                return self.antenna

	def setComponent(self, value):
		try:
			self._members["Component"]=str(value)
		except KeyError, e:
			self._members["Component"].update(str(value))

	def setControlPoint(self, value):
		try:
			self._members["ControlPoint"]=str(value)
		except KeyError, e:
			self._members["ControlPoint"].update(str(value))

	def setNewValue(self, value):
		try:
			self._members["NewValue"]=str(value)
		except KeyError, e:
			self._members["NewValue"].update(str(value))
