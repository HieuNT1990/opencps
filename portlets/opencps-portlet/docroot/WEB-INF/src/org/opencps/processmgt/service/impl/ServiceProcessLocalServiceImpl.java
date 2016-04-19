/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package org.opencps.processmgt.service.impl;

import java.util.List;

import org.opencps.processmgt.model.ServiceProcess;
import org.opencps.processmgt.service.base.ServiceProcessLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the service process local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.opencps.processmgt.service.ServiceProcessLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author khoavd
 * @see org.opencps.processmgt.service.base.ServiceProcessLocalServiceBaseImpl
 * @see org.opencps.processmgt.service.ServiceProcessLocalServiceUtil
 */
public class ServiceProcessLocalServiceImpl
	extends ServiceProcessLocalServiceBaseImpl {
	
	public List<ServiceProcess> getServiceProcesses(long groupId, long dossierTemplateId) 
					throws SystemException {
		return serviceProcessPersistence.findByG_T(groupId, dossierTemplateId);
	}
	
	public int countByG_T(long groupId ,long dossierTemplateId) throws SystemException {
		return serviceProcessPersistence.countByG_T(groupId, dossierTemplateId);
	}
}