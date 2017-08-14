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

import com.liferay.springexample.servicebuilder.model.javatest;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the javatest service. This utility wraps {@link com.liferay.springexample.servicebuilder.service.persistence.impl.javatestPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see javatestPersistence
 * @see com.liferay.springexample.servicebuilder.service.persistence.impl.javatestPersistenceImpl
 * @generated
 */
@ProviderType
public class javatestUtil {
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
	public static void clearCache(javatest javatest) {
		getPersistence().clearCache(javatest);
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
	public static List<javatest> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<javatest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<javatest> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<javatest> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static javatest update(javatest javatest) {
		return getPersistence().update(javatest);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static javatest update(javatest javatest,
		ServiceContext serviceContext) {
		return getPersistence().update(javatest, serviceContext);
	}

	/**
	* Returns all the javatests where id = &#63;.
	*
	* @param id the ID
	* @return the matching javatests
	*/
	public static List<javatest> findByid(long id) {
		return getPersistence().findByid(id);
	}

	/**
	* Returns a range of all the javatests where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of javatests
	* @param end the upper bound of the range of javatests (not inclusive)
	* @return the range of matching javatests
	*/
	public static List<javatest> findByid(long id, int start, int end) {
		return getPersistence().findByid(id, start, end);
	}

	/**
	* Returns an ordered range of all the javatests where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of javatests
	* @param end the upper bound of the range of javatests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching javatests
	*/
	public static List<javatest> findByid(long id, int start, int end,
		OrderByComparator<javatest> orderByComparator) {
		return getPersistence().findByid(id, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the javatests where id = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param id the ID
	* @param start the lower bound of the range of javatests
	* @param end the upper bound of the range of javatests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching javatests
	*/
	public static List<javatest> findByid(long id, int start, int end,
		OrderByComparator<javatest> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByid(id, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first javatest in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching javatest
	* @throws NoSuchjavatestException if a matching javatest could not be found
	*/
	public static javatest findByid_First(long id,
		OrderByComparator<javatest> orderByComparator)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchjavatestException {
		return getPersistence().findByid_First(id, orderByComparator);
	}

	/**
	* Returns the first javatest in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching javatest, or <code>null</code> if a matching javatest could not be found
	*/
	public static javatest fetchByid_First(long id,
		OrderByComparator<javatest> orderByComparator) {
		return getPersistence().fetchByid_First(id, orderByComparator);
	}

	/**
	* Returns the last javatest in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching javatest
	* @throws NoSuchjavatestException if a matching javatest could not be found
	*/
	public static javatest findByid_Last(long id,
		OrderByComparator<javatest> orderByComparator)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchjavatestException {
		return getPersistence().findByid_Last(id, orderByComparator);
	}

	/**
	* Returns the last javatest in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching javatest, or <code>null</code> if a matching javatest could not be found
	*/
	public static javatest fetchByid_Last(long id,
		OrderByComparator<javatest> orderByComparator) {
		return getPersistence().fetchByid_Last(id, orderByComparator);
	}

	/**
	* Returns the javatests before and after the current javatest in the ordered set where id = &#63;.
	*
	* @param javatestPK the primary key of the current javatest
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next javatest
	* @throws NoSuchjavatestException if a javatest with the primary key could not be found
	*/
	public static javatest[] findByid_PrevAndNext(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK,
		long id, OrderByComparator<javatest> orderByComparator)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchjavatestException {
		return getPersistence()
				   .findByid_PrevAndNext(javatestPK, id, orderByComparator);
	}

	/**
	* Removes all the javatests where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public static void removeByid(long id) {
		getPersistence().removeByid(id);
	}

	/**
	* Returns the number of javatests where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching javatests
	*/
	public static int countByid(long id) {
		return getPersistence().countByid(id);
	}

	/**
	* Caches the javatest in the entity cache if it is enabled.
	*
	* @param javatest the javatest
	*/
	public static void cacheResult(javatest javatest) {
		getPersistence().cacheResult(javatest);
	}

	/**
	* Caches the javatests in the entity cache if it is enabled.
	*
	* @param javatests the javatests
	*/
	public static void cacheResult(List<javatest> javatests) {
		getPersistence().cacheResult(javatests);
	}

	/**
	* Creates a new javatest with the primary key. Does not add the javatest to the database.
	*
	* @param javatestPK the primary key for the new javatest
	* @return the new javatest
	*/
	public static javatest create(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK) {
		return getPersistence().create(javatestPK);
	}

	/**
	* Removes the javatest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param javatestPK the primary key of the javatest
	* @return the javatest that was removed
	* @throws NoSuchjavatestException if a javatest with the primary key could not be found
	*/
	public static javatest remove(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchjavatestException {
		return getPersistence().remove(javatestPK);
	}

	public static javatest updateImpl(javatest javatest) {
		return getPersistence().updateImpl(javatest);
	}

	/**
	* Returns the javatest with the primary key or throws a {@link NoSuchjavatestException} if it could not be found.
	*
	* @param javatestPK the primary key of the javatest
	* @return the javatest
	* @throws NoSuchjavatestException if a javatest with the primary key could not be found
	*/
	public static javatest findByPrimaryKey(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK)
		throws com.liferay.springexample.servicebuilder.exception.NoSuchjavatestException {
		return getPersistence().findByPrimaryKey(javatestPK);
	}

	/**
	* Returns the javatest with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param javatestPK the primary key of the javatest
	* @return the javatest, or <code>null</code> if a javatest with the primary key could not be found
	*/
	public static javatest fetchByPrimaryKey(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK) {
		return getPersistence().fetchByPrimaryKey(javatestPK);
	}

	public static java.util.Map<java.io.Serializable, javatest> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the javatests.
	*
	* @return the javatests
	*/
	public static List<javatest> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the javatests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of javatests
	* @param end the upper bound of the range of javatests (not inclusive)
	* @return the range of javatests
	*/
	public static List<javatest> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the javatests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of javatests
	* @param end the upper bound of the range of javatests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of javatests
	*/
	public static List<javatest> findAll(int start, int end,
		OrderByComparator<javatest> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the javatests.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link javatestModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of javatests
	* @param end the upper bound of the range of javatests (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of javatests
	*/
	public static List<javatest> findAll(int start, int end,
		OrderByComparator<javatest> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the javatests from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of javatests.
	*
	* @return the number of javatests
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<java.lang.String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static javatestPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<javatestPersistence, javatestPersistence> _serviceTracker =
		ServiceTrackerFactory.open(javatestPersistence.class);
}