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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.liferay.springexample.servicebuilder.exception.NoSuchJIRAActionException;
import com.liferay.springexample.servicebuilder.model.JIRAAction;

/**
 * The persistence interface for the jira action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.springexample.servicebuilder.service.persistence.impl.JIRAActionPersistenceImpl
 * @see JIRAActionUtil
 * @generated
 */
@ProviderType
public interface JIRAActionPersistence extends BasePersistence<JIRAAction> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link JIRAActionUtil} to access the jira action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the jira actions where id = &#63;.
	*
	* @param id the ID
	* @return the matching jira actions
	*/
	public java.util.List<JIRAAction> findByid(long id);

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
	public java.util.List<JIRAAction> findByid(long id, int start, int end);

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
	public java.util.List<JIRAAction> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator);

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
	public java.util.List<JIRAAction> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first jira action in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jira action
	* @throws NoSuchJIRAActionException if a matching jira action could not be found
	*/
	public JIRAAction findByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator)
		throws NoSuchJIRAActionException;

	/**
	* Returns the first jira action in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching jira action, or <code>null</code> if a matching jira action could not be found
	*/
	public JIRAAction fetchByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator);

	/**
	* Returns the last jira action in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jira action
	* @throws NoSuchJIRAActionException if a matching jira action could not be found
	*/
	public JIRAAction findByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator)
		throws NoSuchJIRAActionException;

	/**
	* Returns the last jira action in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching jira action, or <code>null</code> if a matching jira action could not be found
	*/
	public JIRAAction fetchByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator);

	/**
	* Returns the jira actions before and after the current jira action in the ordered set where id = &#63;.
	*
	* @param jiraActionPK the primary key of the current jira action
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next jira action
	* @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	*/
	public JIRAAction[] findByid_PrevAndNext(JIRAActionPK jiraActionPK,
		long id,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator)
		throws NoSuchJIRAActionException;

	/**
	* Removes all the jira actions where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByid(long id);

	/**
	* Returns the number of jira actions where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching jira actions
	*/
	public int countByid(long id);

	/**
	* Caches the jira action in the entity cache if it is enabled.
	*
	* @param jiraAction the jira action
	*/
	public void cacheResult(JIRAAction jiraAction);

	/**
	* Caches the jira actions in the entity cache if it is enabled.
	*
	* @param jiraActions the jira actions
	*/
	public void cacheResult(java.util.List<JIRAAction> jiraActions);

	/**
	* Creates a new jira action with the primary key. Does not add the jira action to the database.
	*
	* @param jiraActionPK the primary key for the new jira action
	* @return the new jira action
	*/
	public JIRAAction create(JIRAActionPK jiraActionPK);

	/**
	* Removes the jira action with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param jiraActionPK the primary key of the jira action
	* @return the jira action that was removed
	* @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	*/
	public JIRAAction remove(JIRAActionPK jiraActionPK)
		throws NoSuchJIRAActionException;

	public JIRAAction updateImpl(JIRAAction jiraAction);

	/**
	* Returns the jira action with the primary key or throws a {@link NoSuchJIRAActionException} if it could not be found.
	*
	* @param jiraActionPK the primary key of the jira action
	* @return the jira action
	* @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	*/
	public JIRAAction findByPrimaryKey(JIRAActionPK jiraActionPK)
		throws NoSuchJIRAActionException;

	/**
	* Returns the jira action with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param jiraActionPK the primary key of the jira action
	* @return the jira action, or <code>null</code> if a jira action with the primary key could not be found
	*/
	public JIRAAction fetchByPrimaryKey(JIRAActionPK jiraActionPK);

	@Override
	public java.util.Map<java.io.Serializable, JIRAAction> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the jira actions.
	*
	* @return the jira actions
	*/
	public java.util.List<JIRAAction> findAll();

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
	public java.util.List<JIRAAction> findAll(int start, int end);

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
	public java.util.List<JIRAAction> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator);

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
	public java.util.List<JIRAAction> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<JIRAAction> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the jira actions from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of jira actions.
	*
	* @return the number of jira actions
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}