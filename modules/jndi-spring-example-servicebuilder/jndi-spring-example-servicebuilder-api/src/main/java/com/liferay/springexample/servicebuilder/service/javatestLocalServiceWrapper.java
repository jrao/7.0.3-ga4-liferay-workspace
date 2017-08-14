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

package com.liferay.springexample.servicebuilder.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link javatestLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see javatestLocalService
 * @generated
 */
@ProviderType
public class javatestLocalServiceWrapper implements javatestLocalService,
	ServiceWrapper<javatestLocalService> {
	public javatestLocalServiceWrapper(
		javatestLocalService javatestLocalService) {
		_javatestLocalService = javatestLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _javatestLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _javatestLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _javatestLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _javatestLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _javatestLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the javatest to the database. Also notifies the appropriate model listeners.
	*
	* @param javatest the javatest
	* @return the javatest that was added
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.javatest addjavatest(
		com.liferay.springexample.servicebuilder.model.javatest javatest) {
		return _javatestLocalService.addjavatest(javatest);
	}

	/**
	* Creates a new javatest with the primary key. Does not add the javatest to the database.
	*
	* @param javatestPK the primary key for the new javatest
	* @return the new javatest
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.javatest createjavatest(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK) {
		return _javatestLocalService.createjavatest(javatestPK);
	}

	/**
	* Deletes the javatest from the database. Also notifies the appropriate model listeners.
	*
	* @param javatest the javatest
	* @return the javatest that was removed
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.javatest deletejavatest(
		com.liferay.springexample.servicebuilder.model.javatest javatest) {
		return _javatestLocalService.deletejavatest(javatest);
	}

	/**
	* Deletes the javatest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param javatestPK the primary key of the javatest
	* @return the javatest that was removed
	* @throws PortalException if a javatest with the primary key could not be found
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.javatest deletejavatest(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _javatestLocalService.deletejavatest(javatestPK);
	}

	@Override
	public com.liferay.springexample.servicebuilder.model.javatest fetchjavatest(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK) {
		return _javatestLocalService.fetchjavatest(javatestPK);
	}

	/**
	* Returns the javatest with the primary key.
	*
	* @param javatestPK the primary key of the javatest
	* @return the javatest
	* @throws PortalException if a javatest with the primary key could not be found
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.javatest getjavatest(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _javatestLocalService.getjavatest(javatestPK);
	}

	/**
	* Updates the javatest in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param javatest the javatest
	* @return the javatest that was updated
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.javatest updatejavatest(
		com.liferay.springexample.servicebuilder.model.javatest javatest) {
		return _javatestLocalService.updatejavatest(javatest);
	}

	/**
	* Returns the number of javatests.
	*
	* @return the number of javatests
	*/
	@Override
	public int getjavatestsCount() {
		return _javatestLocalService.getjavatestsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _javatestLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _javatestLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.springexample.servicebuilder.model.impl.javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _javatestLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.springexample.servicebuilder.model.impl.javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _javatestLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the javatests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.springexample.servicebuilder.model.impl.javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of javatests
	* @param end the upper bound of the range of javatests (not inclusive)
	* @return the range of javatests
	*/
	@Override
	public java.util.List<com.liferay.springexample.servicebuilder.model.javatest> getjavatests(
		int start, int end) {
		return _javatestLocalService.getjavatests(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _javatestLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _javatestLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public javatestLocalService getWrappedService() {
		return _javatestLocalService;
	}

	@Override
	public void setWrappedService(javatestLocalService javatestLocalService) {
		_javatestLocalService = javatestLocalService;
	}

	private javatestLocalService _javatestLocalService;
}