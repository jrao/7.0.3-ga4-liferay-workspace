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
 * Provides a wrapper for {@link JIRAActionLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see JIRAActionLocalService
 * @generated
 */
@ProviderType
public class JIRAActionLocalServiceWrapper implements JIRAActionLocalService,
	ServiceWrapper<JIRAActionLocalService> {
	public JIRAActionLocalServiceWrapper(
		JIRAActionLocalService jiraActionLocalService) {
		_jiraActionLocalService = jiraActionLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _jiraActionLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _jiraActionLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _jiraActionLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jiraActionLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jiraActionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the jira action to the database. Also notifies the appropriate model listeners.
	*
	* @param jiraAction the jira action
	* @return the jira action that was added
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.JIRAAction addJIRAAction(
		com.liferay.springexample.servicebuilder.model.JIRAAction jiraAction) {
		return _jiraActionLocalService.addJIRAAction(jiraAction);
	}

	/**
	* Creates a new jira action with the primary key. Does not add the jira action to the database.
	*
	* @param jiraActionPK the primary key for the new jira action
	* @return the new jira action
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.JIRAAction createJIRAAction(
		com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK jiraActionPK) {
		return _jiraActionLocalService.createJIRAAction(jiraActionPK);
	}

	/**
	* Deletes the jira action from the database. Also notifies the appropriate model listeners.
	*
	* @param jiraAction the jira action
	* @return the jira action that was removed
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.JIRAAction deleteJIRAAction(
		com.liferay.springexample.servicebuilder.model.JIRAAction jiraAction) {
		return _jiraActionLocalService.deleteJIRAAction(jiraAction);
	}

	/**
	* Deletes the jira action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jiraActionPK the primary key of the jira action
	* @return the jira action that was removed
	* @throws PortalException if a jira action with the primary key could not be found
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.JIRAAction deleteJIRAAction(
		com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK jiraActionPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jiraActionLocalService.deleteJIRAAction(jiraActionPK);
	}

	@Override
	public com.liferay.springexample.servicebuilder.model.JIRAAction fetchJIRAAction(
		com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK jiraActionPK) {
		return _jiraActionLocalService.fetchJIRAAction(jiraActionPK);
	}

	/**
	* Returns the jira action with the primary key.
	*
	* @param jiraActionPK the primary key of the jira action
	* @return the jira action
	* @throws PortalException if a jira action with the primary key could not be found
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.JIRAAction getJIRAAction(
		com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK jiraActionPK)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _jiraActionLocalService.getJIRAAction(jiraActionPK);
	}

	/**
	* Updates the jira action in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param jiraAction the jira action
	* @return the jira action that was updated
	*/
	@Override
	public com.liferay.springexample.servicebuilder.model.JIRAAction updateJIRAAction(
		com.liferay.springexample.servicebuilder.model.JIRAAction jiraAction) {
		return _jiraActionLocalService.updateJIRAAction(jiraAction);
	}

	/**
	* Returns the number of jira actions.
	*
	* @return the number of jira actions
	*/
	@Override
	public int getJIRAActionsCount() {
		return _jiraActionLocalService.getJIRAActionsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _jiraActionLocalService.getOSGiServiceIdentifier();
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
		return _jiraActionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.springexample.servicebuilder.model.impl.JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jiraActionLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.springexample.servicebuilder.model.impl.JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return _jiraActionLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns a range of all the jira actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.springexample.servicebuilder.model.impl.JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jira actions
	* @param end the upper bound of the range of jira actions (not inclusive)
	* @return the range of jira actions
	*/
	@Override
	public java.util.List<com.liferay.springexample.servicebuilder.model.JIRAAction> getJIRAActions(
		int start, int end) {
		return _jiraActionLocalService.getJIRAActions(start, end);
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
		return _jiraActionLocalService.dynamicQueryCount(dynamicQuery);
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
		return _jiraActionLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public JIRAActionLocalService getWrappedService() {
		return _jiraActionLocalService;
	}

	@Override
	public void setWrappedService(JIRAActionLocalService jiraActionLocalService) {
		_jiraActionLocalService = jiraActionLocalService;
	}

	private JIRAActionLocalService _jiraActionLocalService;
}