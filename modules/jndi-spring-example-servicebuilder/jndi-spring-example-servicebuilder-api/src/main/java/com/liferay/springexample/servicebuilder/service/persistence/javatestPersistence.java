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

import com.liferay.springexample.servicebuilder.exception.NoSuchjavatestException;
import com.liferay.springexample.servicebuilder.model.javatest;

/**
 * The persistence interface for the javatest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.liferay.springexample.servicebuilder.service.persistence.impl.javatestPersistenceImpl
 * @see javatestUtil
 * @generated
 */
@ProviderType
public interface javatestPersistence extends BasePersistence<javatest> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link javatestUtil} to access the javatest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the javatests where id = &#63;.
	*
	* @param id the ID
	* @return the matching javatests
	*/
	public java.util.List<javatest> findByid(long id);

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
	public java.util.List<javatest> findByid(long id, int start, int end);

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
	public java.util.List<javatest> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator);

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
	public java.util.List<javatest> findByid(long id, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first javatest in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching javatest
	* @throws NoSuchjavatestException if a matching javatest could not be found
	*/
	public javatest findByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator)
		throws NoSuchjavatestException;

	/**
	* Returns the first javatest in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching javatest, or <code>null</code> if a matching javatest could not be found
	*/
	public javatest fetchByid_First(long id,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator);

	/**
	* Returns the last javatest in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching javatest
	* @throws NoSuchjavatestException if a matching javatest could not be found
	*/
	public javatest findByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator)
		throws NoSuchjavatestException;

	/**
	* Returns the last javatest in the ordered set where id = &#63;.
	*
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching javatest, or <code>null</code> if a matching javatest could not be found
	*/
	public javatest fetchByid_Last(long id,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator);

	/**
	* Returns the javatests before and after the current javatest in the ordered set where id = &#63;.
	*
	* @param javatestPK the primary key of the current javatest
	* @param id the ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next javatest
	* @throws NoSuchjavatestException if a javatest with the primary key could not be found
	*/
	public javatest[] findByid_PrevAndNext(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK,
		long id,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator)
		throws NoSuchjavatestException;

	/**
	* Removes all the javatests where id = &#63; from the database.
	*
	* @param id the ID
	*/
	public void removeByid(long id);

	/**
	* Returns the number of javatests where id = &#63;.
	*
	* @param id the ID
	* @return the number of matching javatests
	*/
	public int countByid(long id);

	/**
	* Caches the javatest in the entity cache if it is enabled.
	*
	* @param javatest the javatest
	*/
	public void cacheResult(javatest javatest);

	/**
	* Caches the javatests in the entity cache if it is enabled.
	*
	* @param javatests the javatests
	*/
	public void cacheResult(java.util.List<javatest> javatests);

	/**
	* Creates a new javatest with the primary key. Does not add the javatest to the database.
	*
	* @param javatestPK the primary key for the new javatest
	* @return the new javatest
	*/
	public javatest create(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK);

	/**
	* Removes the javatest with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param javatestPK the primary key of the javatest
	* @return the javatest that was removed
	* @throws NoSuchjavatestException if a javatest with the primary key could not be found
	*/
	public javatest remove(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK)
		throws NoSuchjavatestException;

	public javatest updateImpl(javatest javatest);

	/**
	* Returns the javatest with the primary key or throws a {@link NoSuchjavatestException} if it could not be found.
	*
	* @param javatestPK the primary key of the javatest
	* @return the javatest
	* @throws NoSuchjavatestException if a javatest with the primary key could not be found
	*/
	public javatest findByPrimaryKey(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK)
		throws NoSuchjavatestException;

	/**
	* Returns the javatest with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param javatestPK the primary key of the javatest
	* @return the javatest, or <code>null</code> if a javatest with the primary key could not be found
	*/
	public javatest fetchByPrimaryKey(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK javatestPK);

	@Override
	public java.util.Map<java.io.Serializable, javatest> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the javatests.
	*
	* @return the javatests
	*/
	public java.util.List<javatest> findAll();

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
	public java.util.List<javatest> findAll(int start, int end);

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
	public java.util.List<javatest> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator);

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
	public java.util.List<javatest> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<javatest> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the javatests from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of javatests.
	*
	* @return the number of javatests
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}