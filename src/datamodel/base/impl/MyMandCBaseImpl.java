/**
 * ALMA - Atacama Large Millimiter Array
 * (c) European Southern Observatory, 2017
 * Copyright by ESO (in the framework of the ALMA collaboration),
 * All rights reserved
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
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, 
 * MA 02111-1307  USA
 */
package datamodel.base.impl;

import datamodel.base.ArchiveProperty;
import datamodel.base.BasePackage;
import datamodel.base.MandCBase;
import datamodel.base.MonitorPoint;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

public abstract class MyMandCBaseImpl extends MandCBaseImpl implements MandCBase, Resource {
	
	@Override	
	public void setArchive(Resource newArchive) {
		this.archive = newArchive;
		if(newArchive != null){
			if (this instanceof MonitorPoint)
				((ArchiveProperty)newArchive).setMp(this);
			else
				((ArchiveProperty)newArchive).setCp(this);
		}
		Resource oldArchive = archive;
		archive = newArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasePackage.MAND_CBASE__ARCHIVE, oldArchive, archive));
	}

	@Override
	abstract public boolean isMonitored();
	
} //MyMandCBaseImpl
