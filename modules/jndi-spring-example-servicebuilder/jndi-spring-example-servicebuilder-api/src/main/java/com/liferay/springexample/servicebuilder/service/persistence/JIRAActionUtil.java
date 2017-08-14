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

package com.liferay.springexample.servicebuilder.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.liferay.springexample.servicebuilder.model.JIRAAction;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the jira action service. This utility wraps {@link com.liferay.springexample.servicebuilder.service.persistence.impl.JIRAActionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JIRAActionPersistence
 * @see com.liferay.springexample.servicebuilder.service.persistence.impl.JIRAActionPersistenceImpl
 * @generated
 */
@ProviderType
public class JIRAActionUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(JIRAAction jiraAction) {
		getPersistence().clearCache(jiraAction);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<JIRAAction> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<JIRAAction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<JIRAAction> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<JIRAAction> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static JIRAAction update(JIRAAction jiraAction) {
		return getPersistence().update(jiraAction);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static JIRAAction update(JIRAAction jiraAction,
		ServiceContext serviceContext) {
		return getPersistence().update(jiraAction, serviceContext);
	}

	/**
	* Returns all the jira actions where id = &#63;.
	*
	* @param id the ID
	* @return the matching jira actions
	*/
	public static List<JIRAAction> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	* Returns a range of all the jira actions where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of jira actions
	* @param end the upper bound of the range of jira actions (not inclusive)
	* @return the range of matching jira actions
	*/
	public static List<JIRAAction> findByid(long id, int start, int end) {
		return getPersistence().findByid(id, start, end);
	}

	/**
	* Returns an ordered range of all the jira actions where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of jira actions
	* @param end the upper bound of the range of jira actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching jira actions
	*/
	public static List<JIRAAction> findByid(long id, int start, int end,
		OrderByComparator<JIRAAction> orderByComparator) {
		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the jira actions where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of jira actions
	* @param end the upper bound of the range of jira actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching jira actions
	*/
	public static List<JIRAAction> findByid(long id, int start, int end,
		OrderByComparator<JIRAAction> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByid(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first jira action in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jira action
	* @throws NoSuchJIRAActionException if a matching jira action could not be found
	*/
	public static JIRAAction findByid_First(long id,
		OrderByComparator<JIRAAction> orderByComparator)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchJIRAActionException {
		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	* Returns the first jira action in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jira action, or <code>null</code> if a matching jira action could not be found
	*/
	public static JIRAAction fetchByid_First(long id,
		OrderByComparator<JIRAAction> orderByComparator) {
		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	* Returns the last jira action in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jira action
	* @throws NoSuchJIRAActionException if a matching jira action could not be found
	*/
	public static JIRAAction findByid_Last(long id,
		OrderByComparator<JIRAAction> orderByComparator)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchJIRAActionException {
		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	* Returns the last jira action in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jira action, or <code>null</code> if a matching jira action could not be found
	*/
	public static JIRAAction fetchByid_Last(long id,
		OrderByComparator<JIRAAction> orderByComparator) {
		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	* Returns the jira actions before and after the current jira action in the ordered set where id = &#63;.
	*
	* @param jiraActionPK the primary key of the current jira action
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jira action
	* @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	*/
	public static JIRAAction[] findByid_PrevAndNext(JIRAActionPK jiraActionPK,
		long id, OrderByComparator<JIRAAction> orderByComparator)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchJIRAActionException {
		return getPersistence()
				   .findByid_PrevAndNext(jiraActionPK, id, orderByComparator);
	}

	/**
	* Removes all the jira actions where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	* Returns the number of jira actions where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching jira actions
	*/
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	* Caches the jira action in the entity cache if it is enabled.
	*
	* @param jiraAction the jira action
	*/
	public static void cacheResult(JIRAAction jiraAction) {
		getPersistence().cacheResult(jiraAction);
	}

	/**
	* Caches the jira actions in the entity cache if it is enabled.
	*
	* @param jiraActions the jira actions
	*/
	public static void cacheResult(List<JIRAAction> jiraActions) {
		getPersistence().cacheResult(jiraActions);
	}

	/**
	* Creates a new jira action with the primary key. Does not add the jira action to the database.
	*
	* @param jiraActionPK the primary key for the new jira action
	* @return the new jira action
	*/
	public static JIRAAction create(JIRAActionPK jiraActionPK) {
		return getPersistence().create(jiraActionPK);
	}

	/**
	* Removes the jira action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jiraActionPK the primary key of the jira action
	* @return the jira action that was removed
	* @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	*/
	public static JIRAAction remove(JIRAActionPK jiraActionPK)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchJIRAActionException {
		return getPersistence().remove(jiraActionPK);
	}

	public static JIRAAction updateImpl(JIRAAction jiraAction) {
		return getPersistence().updateImpl(jiraAction);
	}

	/**
	* Returns the jira action with the primary key or throws a {@link NoSuchJIRAActionException} if it could not be found.
	*
	* @param jiraActionPK the primary key of the jira action
	* @return the jira action
	* @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	*/
	public static JIRAAction findByPrimaryKey(JIRAActionPK jiraActionPK)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchJIRAActionException {
		return getPersistence().findByPrimaryKey(jiraActionPK);
	}

	/**
	* Returns the jira action with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jiraActionPK the primary key of the jira action
	* @return the jira action, or <code>null</code> if a jira action with the primary key could not be found
	*/
	public static JIRAAction fetchByPrimaryKey(JIRAActionPK jiraActionPK) {
		return getPersistence().fetchByPrimaryKey(jiraActionPK);
	}

	public static java.util.Map<java.io.Serializable, JIRAAction> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the jira actions.
	*
	* @return the jira actions
	*/
	public static List<JIRAAction> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the jira actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jira actions
	* @param end the upper bound of the range of jira actions (not inclusive)
	* @return the range of jira actions
	*/
	public static List<JIRAAction> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the jira actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jira actions
	* @param end the upper bound of the range of jira actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of jira actions
	*/
	public static List<JIRAAction> findAll(int start, int end,
		OrderByComparator<JIRAAction> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the jira actions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link JIRAActionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of jira actions
	* @param end the upper bound of the range of jira actions (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of jira actions
	*/
	public static List<JIRAAction> findAll(int start, int end,
		OrderByComparator<JIRAAction> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the jira actions from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of jira actions.
	*
	* @return the number of jira actions
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static JIRAActionPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<JIRAActionPersistence, JIRAActionPersistence> _serviceTracker =
		ServiceTrackerFactory.open(JIRAActionPersistence.class);
}