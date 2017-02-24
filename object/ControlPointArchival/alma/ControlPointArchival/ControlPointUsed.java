/*
* ALMA - Atacama Large Millimiter Array
* Copyright (c) ESO - European Southern Observatory, 2013
* (in the framework of the ALMA collaboration).
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
* Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA
*/

/**
 * @author  nbarriga
 * @version $Id: LTS2Java.xslt,v 1.9 2012/03/06 19:16:56 tstaig Exp $
 * @since
 */

package alma.ControlPointArchival;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.LinkedHashMap;
import java.util.Map;

import alma.acs.logging.AcsLogLevel;
import alma.acs.logging.AcsLogger;
import alma.acs.logging.AcsLogRecord;
import alma.acs.logging.ts.TypesafeLogBase;


/**
 * Generated class that produces a type-safe log message, as configured in ControlPointArchival.xml.
 * <p>
 * The description for this log is: A control point of a device has been invoked. The following information indicates in which component, and which control point was activated. <br>
 * The description for this group of logs is: CONTROL Subsystem uses type-safe logs for archival of control points, as there is no infrastructure to support this feature/requirement.
 */
public class ControlPointUsed extends TypesafeLogBase {
	
	public static final AcsLogLevel level = AcsLogLevel.DEBUG;
	public static final String audience = "System Engineers";
	public static final String msg = "A control point has been invoked.";
	
	public ControlPointUsed(Logger logger) {
		this(logger, null, null);
	}

	public ControlPointUsed(Logger logger, String array, String antenna) {
		super(logger, "ControlPointUsed", level, audience, msg, array, antenna);
	}
	
	/**
	 * Convenience method for compact one-line logs.
	 */
	public static void log(Logger logger, String Component, String ControlPoint, String NewValue) {
		if (logger.isLoggable(level)) {	
			ControlPointUsed instance = new ControlPointUsed(logger);
			instance.setComponent(Component);
			instance.setControlPoint(ControlPoint);
			instance.setNewValue(NewValue);
			instance.log();
		}
	}
	

	/**
	 * Sets log parameter Component.
	 * @param Component
	 *			Name of the component where the control point was invoked.
	 */
	public ControlPointUsed setComponent(String value) {
		nameValue.put("Component", value);
		return this;
	}
	/**
	 * Sets log parameter ControlPoint.
	 * @param ControlPoint
	 *			Control Point invoked.
	 */
	public ControlPointUsed setControlPoint(String value) {
		nameValue.put("ControlPoint", value);
		return this;
	}
	/**
	 * Sets log parameter NewValue.
	 * @param NewValue
	 *			The new value which was commanded to take.
	 */
	public ControlPointUsed setNewValue(String value) {
		nameValue.put("NewValue", value);
		return this;
	}
}

