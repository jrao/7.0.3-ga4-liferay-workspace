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

package com.liferay.springexample.servicebuilder.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReflectionUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.liferay.springexample.servicebuilder.exception.NoSuchjavatestException;
import com.liferay.springexample.servicebuilder.model.impl.javatestImpl;
import com.liferay.springexample.servicebuilder.model.impl.javatestModelImpl;
import com.liferay.springexample.servicebuilder.model.javatest;
import com.liferay.springexample.servicebuilder.service.persistence.javatestPK;
import com.liferay.springexample.servicebuilder.service.persistence.javatestPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the javatest service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see javatestPersistence
 * @see com.liferay.springexample.servicebuilder.service.persistence.javatestUtil
 * @generated
 */
@ProviderType
public class javatestPersistenceImpl extends BasePersistenceImpl<javatest>
	implements javatestPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link javatestUtil} to access the javatest persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = javatestImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestModelImpl.FINDER_CACHE_ENABLED, javatestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestModelImpl.FINDER_CACHE_ENABLED, javatestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestModelImpl.FINDER_CACHE_ENABLED, javatestImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestModelImpl.FINDER_CACHE_ENABLED, javatestImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] { Long.class.getName() },
			javatestModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the javatests where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching javatests
	 */
	@Override
	public List<javatest> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<javatest> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
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
	@Override
	public List<javatest> findByid(long id, int start, int end,
		OrderByComparator<javatest> orderByComparator) {
		return findByid(id, start, end, orderByComparator, true);
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
	@Override
	public List<javatest> findByid(long id, int start, int end,
		OrderByComparator<javatest> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID;
			finderArgs = new Object[] { id };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ID;
			finderArgs = new Object[] { id, start, end, orderByComparator };
		}

		List<javatest> list = null;

		if (retrieveFromCache) {
			list = (List<javatest>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (javatest javatest : list) {
					if ((id != javatest.getId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_JAVATEST_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(javatestModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<javatest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<javatest>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first javatest in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching javatest
	 * @throws NoSuchjavatestException if a matching javatest could not be found
	 */
	@Override
	public javatest findByid_First(long id,
		OrderByComparator<javatest> orderByComparator)
		throws NoSuchjavatestException {
		javatest javatest = fetchByid_First(id, orderByComparator);

		if (javatest != null) {
			return javatest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchjavatestException(msg.toString());
	}

	/**
	 * Returns the first javatest in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching javatest, or <code>null</code> if a matching javatest could not be found
	 */
	@Override
	public javatest fetchByid_First(long id,
		OrderByComparator<javatest> orderByComparator) {
		List<javatest> list = findByid(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last javatest in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching javatest
	 * @throws NoSuchjavatestException if a matching javatest could not be found
	 */
	@Override
	public javatest findByid_Last(long id,
		OrderByComparator<javatest> orderByComparator)
		throws NoSuchjavatestException {
		javatest javatest = fetchByid_Last(id, orderByComparator);

		if (javatest != null) {
			return javatest;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchjavatestException(msg.toString());
	}

	/**
	 * Returns the last javatest in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching javatest, or <code>null</code> if a matching javatest could not be found
	 */
	@Override
	public javatest fetchByid_Last(long id,
		OrderByComparator<javatest> orderByComparator) {
		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<javatest> list = findByid(id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public javatest[] findByid_PrevAndNext(javatestPK javatestPK, long id,
		OrderByComparator<javatest> orderByComparator)
		throws NoSuchjavatestException {
		javatest javatest = findByPrimaryKey(javatestPK);

		Session session = null;

		try {
			session = openSession();

			javatest[] array = new javatestImpl[3];

			array[0] = getByid_PrevAndNext(session, javatest, id,
					orderByComparator, true);

			array[1] = javatest;

			array[2] = getByid_PrevAndNext(session, javatest, id,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected javatest getByid_PrevAndNext(Session session, javatest javatest,
		long id, OrderByComparator<javatest> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JAVATEST_WHERE);

		query.append(_FINDER_COLUMN_ID_ID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(javatestModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(javatest);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<javatest> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the javatests where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (javatest javatest : findByid(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(javatest);
		}
	}

	/**
	 * Returns the number of javatests where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching javatests
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JAVATEST_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ID_ID_2 = "javatest.id.id = ?";

	public javatestPersistenceImpl() {
		setModelClass(javatest.class);

		try {
			Field field = ReflectionUtil.getDeclaredField(BasePersistenceImpl.class,
					"_dbColumnNames");

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("id", "javatest");
			dbColumnNames.put("foo", "javatest");
			dbColumnNames.put("bar", "javatest");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the javatest in the entity cache if it is enabled.
	 *
	 * @param javatest the javatest
	 */
	@Override
	public void cacheResult(javatest javatest) {
		entityCache.putResult(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestImpl.class, javatest.getPrimaryKey(), javatest);

		javatest.resetOriginalValues();
	}

	/**
	 * Caches the javatests in the entity cache if it is enabled.
	 *
	 * @param javatests the javatests
	 */
	@Override
	public void cacheResult(List<javatest> javatests) {
		for (javatest javatest : javatests) {
			if (entityCache.getResult(javatestModelImpl.ENTITY_CACHE_ENABLED,
						javatestImpl.class, javatest.getPrimaryKey()) == null) {
				cacheResult(javatest);
			}
			else {
				javatest.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all javatests.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(javatestImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the javatest.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(javatest javatest) {
		entityCache.removeResult(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestImpl.class, javatest.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<javatest> javatests) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (javatest javatest : javatests) {
			entityCache.removeResult(javatestModelImpl.ENTITY_CACHE_ENABLED,
				javatestImpl.class, javatest.getPrimaryKey());
		}
	}

	/**
	 * Creates a new javatest with the primary key. Does not add the javatest to the database.
	 *
	 * @param javatestPK the primary key for the new javatest
	 * @return the new javatest
	 */
	@Override
	public javatest create(javatestPK javatestPK) {
		javatest javatest = new javatestImpl();

		javatest.setNew(true);
		javatest.setPrimaryKey(javatestPK);

		return javatest;
	}

	/**
	 * Removes the javatest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param javatestPK the primary key of the javatest
	 * @return the javatest that was removed
	 * @throws NoSuchjavatestException if a javatest with the primary key could not be found
	 */
	@Override
	public javatest remove(javatestPK javatestPK)
		throws NoSuchjavatestException {
		return remove((Serializable)javatestPK);
	}

	/**
	 * Removes the javatest with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the javatest
	 * @return the javatest that was removed
	 * @throws NoSuchjavatestException if a javatest with the primary key could not be found
	 */
	@Override
	public javatest remove(Serializable primaryKey)
		throws NoSuchjavatestException {
		Session session = null;

		try {
			session = openSession();

			javatest javatest = (javatest)session.get(javatestImpl.class,
					primaryKey);

			if (javatest == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchjavatestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(javatest);
		}
		catch (NoSuchjavatestException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected javatest removeImpl(javatest javatest) {
		javatest = toUnwrappedModel(javatest);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(javatest)) {
				javatest = (javatest)session.get(javatestImpl.class,
						javatest.getPrimaryKeyObj());
			}

			if (javatest != null) {
				session.delete(javatest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (javatest != null) {
			clearCache(javatest);
		}

		return javatest;
	}

	@Override
	public javatest updateImpl(javatest javatest) {
		javatest = toUnwrappedModel(javatest);

		boolean isNew = javatest.isNew();

		javatestModelImpl javatestModelImpl = (javatestModelImpl)javatest;

		Session session = null;

		try {
			session = openSession();

			if (javatest.isNew()) {
				session.save(javatest);

				javatest.setNew(false);
			}
			else {
				javatest = (javatest)session.merge(javatest);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!javatestModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { javatestModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((javatestModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { javatestModelImpl.getOriginalId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { javatestModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}
		}

		entityCache.putResult(javatestModelImpl.ENTITY_CACHE_ENABLED,
			javatestImpl.class, javatest.getPrimaryKey(), javatest, false);

		javatest.resetOriginalValues();

		return javatest;
	}

	protected javatest toUnwrappedModel(javatest javatest) {
		if (javatest instanceof javatestImpl) {
			return javatest;
		}

		javatestImpl javatestImpl = new javatestImpl();

		javatestImpl.setNew(javatest.isNew());
		javatestImpl.setPrimaryKey(javatest.getPrimaryKey());

		javatestImpl.setId(javatest.getId());
		javatestImpl.setFoo(javatest.getFoo());
		javatestImpl.setBar(javatest.getBar());

		return javatestImpl;
	}

	/**
	 * Returns the javatest with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the javatest
	 * @return the javatest
	 * @throws NoSuchjavatestException if a javatest with the primary key could not be found
	 */
	@Override
	public javatest findByPrimaryKey(Serializable primaryKey)
		throws NoSuchjavatestException {
		javatest javatest = fetchByPrimaryKey(primaryKey);

		if (javatest == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchjavatestException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return javatest;
	}

	/**
	 * Returns the javatest with the primary key or throws a {@link NoSuchjavatestException} if it could not be found.
	 *
	 * @param javatestPK the primary key of the javatest
	 * @return the javatest
	 * @throws NoSuchjavatestException if a javatest with the primary key could not be found
	 */
	@Override
	public javatest findByPrimaryKey(javatestPK javatestPK)
		throws NoSuchjavatestException {
		return findByPrimaryKey((Serializable)javatestPK);
	}

	/**
	 * Returns the javatest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the javatest
	 * @return the javatest, or <code>null</code> if a javatest with the primary key could not be found
	 */
	@Override
	public javatest fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(javatestModelImpl.ENTITY_CACHE_ENABLED,
				javatestImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		javatest javatest = (javatest)serializable;

		if (javatest == null) {
			Session session = null;

			try {
				session = openSession();

				javatest = (javatest)session.get(javatestImpl.class, primaryKey);

				if (javatest != null) {
					cacheResult(javatest);
				}
				else {
					entityCache.putResult(javatestModelImpl.ENTITY_CACHE_ENABLED,
						javatestImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(javatestModelImpl.ENTITY_CACHE_ENABLED,
					javatestImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return javatest;
	}

	/**
	 * Returns the javatest with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param javatestPK the primary key of the javatest
	 * @return the javatest, or <code>null</code> if a javatest with the primary key could not be found
	 */
	@Override
	public javatest fetchByPrimaryKey(javatestPK javatestPK) {
		return fetchByPrimaryKey((Serializable)javatestPK);
	}

	@Override
	public Map<Serializable, javatest> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, javatest> map = new HashMap<Serializable, javatest>();

		for (Serializable primaryKey : primaryKeys) {
			javatest javatest = fetchByPrimaryKey(primaryKey);

			if (javatest != null) {
				map.put(primaryKey, javatest);
			}
		}

		return map;
	}

	/**
	 * Returns all the javatests.
	 *
	 * @return the javatests
	 */
	@Override
	public List<javatest> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<javatest> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<javatest> findAll(int start, int end,
		OrderByComparator<javatest> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<javatest> findAll(int start, int end,
		OrderByComparator<javatest> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<javatest> list = null;

		if (retrieveFromCache) {
			list = (List<javatest>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_JAVATEST);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JAVATEST;

				if (pagination) {
					sql = sql.concat(javatestModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<javatest>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<javatest>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the javatests from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (javatest javatest : findAll()) {
			remove(javatest);
		}
	}

	/**
	 * Returns the number of javatests.
	 *
	 * @return the number of javatests
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JAVATEST);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return javatestModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the javatest persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(javatestImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_JAVATEST = "SELECT javatest FROM javatest javatest";
	private static final String _SQL_SELECT_JAVATEST_WHERE = "SELECT javatest FROM javatest javatest WHERE ";
	private static final String _SQL_COUNT_JAVATEST = "SELECT COUNT(javatest) FROM javatest javatest";
	private static final String _SQL_COUNT_JAVATEST_WHERE = "SELECT COUNT(javatest) FROM javatest javatest WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "javatest.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No javatest exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No javatest exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(javatestPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "foo", "bar"
			});
}