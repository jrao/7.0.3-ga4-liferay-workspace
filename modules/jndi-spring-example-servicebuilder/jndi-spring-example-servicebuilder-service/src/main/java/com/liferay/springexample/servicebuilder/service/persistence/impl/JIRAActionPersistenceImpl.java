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

import com.liferay.springexample.servicebuilder.exception.NoSuchJIRAActionException;
import com.liferay.springexample.servicebuilder.model.JIRAAction;
import com.liferay.springexample.servicebuilder.model.impl.JIRAActionImpl;
import com.liferay.springexample.servicebuilder.model.impl.JIRAActionModelImpl;
import com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK;
import com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the jira action service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JIRAActionPersistence
 * @see com.liferay.springexample.servicebuilder.service.persistence.JIRAActionUtil
 * @generated
 */
@ProviderType
public class JIRAActionPersistenceImpl extends BasePersistenceImpl<JIRAAction>
	implements JIRAActionPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link JIRAActionUtil} to access the jira action persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = JIRAActionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionModelImpl.FINDER_CACHE_ENABLED, JIRAActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionModelImpl.FINDER_CACHE_ENABLED, JIRAActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ID = new FinderPath(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionModelImpl.FINDER_CACHE_ENABLED, JIRAActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByid",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID = new FinderPath(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionModelImpl.FINDER_CACHE_ENABLED, JIRAActionImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByid",
			new String[] { Long.class.getName() },
			JIRAActionModelImpl.ID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_ID = new FinderPath(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByid",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the jira actions where id = &#63;.
	 *
	 * @param id the ID
	 * @return the matching jira actions
	 */
	@Override
	public List<JIRAAction> findByid(long id) {
		return findByid(id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<JIRAAction> findByid(long id, int start, int end) {
		return findByid(id, start, end, null);
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
	@Override
	public List<JIRAAction> findByid(long id, int start, int end,
		OrderByComparator<JIRAAction> orderByComparator) {
		return findByid(id, start, end, orderByComparator, true);
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
	@Override
	public List<JIRAAction> findByid(long id, int start, int end,
		OrderByComparator<JIRAAction> orderByComparator,
		boolean retrieveFromCache) {
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

		List<JIRAAction> list = null;

		if (retrieveFromCache) {
			list = (List<JIRAAction>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JIRAAction jiraAction : list) {
					if ((id != jiraAction.getId())) {
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

			query.append(_SQL_SELECT_JIRAACTION_WHERE);

			query.append(_FINDER_COLUMN_ID_ID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(JIRAActionModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(id);

				if (!pagination) {
					list = (List<JIRAAction>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<JIRAAction>)QueryUtil.list(q, getDialect(),
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
	 * Returns the first jira action in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jira action
	 * @throws NoSuchJIRAActionException if a matching jira action could not be found
	 */
	@Override
	public JIRAAction findByid_First(long id,
		OrderByComparator<JIRAAction> orderByComparator)
		throws NoSuchJIRAActionException {
		JIRAAction jiraAction = fetchByid_First(id, orderByComparator);

		if (jiraAction != null) {
			return jiraAction;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJIRAActionException(msg.toString());
	}

	/**
	 * Returns the first jira action in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jira action, or <code>null</code> if a matching jira action could not be found
	 */
	@Override
	public JIRAAction fetchByid_First(long id,
		OrderByComparator<JIRAAction> orderByComparator) {
		List<JIRAAction> list = findByid(id, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jira action in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jira action
	 * @throws NoSuchJIRAActionException if a matching jira action could not be found
	 */
	@Override
	public JIRAAction findByid_Last(long id,
		OrderByComparator<JIRAAction> orderByComparator)
		throws NoSuchJIRAActionException {
		JIRAAction jiraAction = fetchByid_Last(id, orderByComparator);

		if (jiraAction != null) {
			return jiraAction;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("id=");
		msg.append(id);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchJIRAActionException(msg.toString());
	}

	/**
	 * Returns the last jira action in the ordered set where id = &#63;.
	 *
	 * @param id the ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jira action, or <code>null</code> if a matching jira action could not be found
	 */
	@Override
	public JIRAAction fetchByid_Last(long id,
		OrderByComparator<JIRAAction> orderByComparator) {
		int count = countByid(id);

		if (count == 0) {
			return null;
		}

		List<JIRAAction> list = findByid(id, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public JIRAAction[] findByid_PrevAndNext(JIRAActionPK jiraActionPK,
		long id, OrderByComparator<JIRAAction> orderByComparator)
		throws NoSuchJIRAActionException {
		JIRAAction jiraAction = findByPrimaryKey(jiraActionPK);

		Session session = null;

		try {
			session = openSession();

			JIRAAction[] array = new JIRAActionImpl[3];

			array[0] = getByid_PrevAndNext(session, jiraAction, id,
					orderByComparator, true);

			array[1] = jiraAction;

			array[2] = getByid_PrevAndNext(session, jiraAction, id,
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

	protected JIRAAction getByid_PrevAndNext(Session session,
		JIRAAction jiraAction, long id,
		OrderByComparator<JIRAAction> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_JIRAACTION_WHERE);

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
			query.append(JIRAActionModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(id);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(jiraAction);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<JIRAAction> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jira actions where id = &#63; from the database.
	 *
	 * @param id the ID
	 */
	@Override
	public void removeByid(long id) {
		for (JIRAAction jiraAction : findByid(id, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(jiraAction);
		}
	}

	/**
	 * Returns the number of jira actions where id = &#63;.
	 *
	 * @param id the ID
	 * @return the number of matching jira actions
	 */
	@Override
	public int countByid(long id) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_ID;

		Object[] finderArgs = new Object[] { id };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_JIRAACTION_WHERE);

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

	private static final String _FINDER_COLUMN_ID_ID_2 = "jiraAction.id.id = ?";

	public JIRAActionPersistenceImpl() {
		setModelClass(JIRAAction.class);

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
	 * Caches the jira action in the entity cache if it is enabled.
	 *
	 * @param jiraAction the jira action
	 */
	@Override
	public void cacheResult(JIRAAction jiraAction) {
		entityCache.putResult(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionImpl.class, jiraAction.getPrimaryKey(), jiraAction);

		jiraAction.resetOriginalValues();
	}

	/**
	 * Caches the jira actions in the entity cache if it is enabled.
	 *
	 * @param jiraActions the jira actions
	 */
	@Override
	public void cacheResult(List<JIRAAction> jiraActions) {
		for (JIRAAction jiraAction : jiraActions) {
			if (entityCache.getResult(
						JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
						JIRAActionImpl.class, jiraAction.getPrimaryKey()) == null) {
				cacheResult(jiraAction);
			}
			else {
				jiraAction.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all jira actions.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JIRAActionImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the jira action.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JIRAAction jiraAction) {
		entityCache.removeResult(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionImpl.class, jiraAction.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<JIRAAction> jiraActions) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (JIRAAction jiraAction : jiraActions) {
			entityCache.removeResult(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
				JIRAActionImpl.class, jiraAction.getPrimaryKey());
		}
	}

	/**
	 * Creates a new jira action with the primary key. Does not add the jira action to the database.
	 *
	 * @param jiraActionPK the primary key for the new jira action
	 * @return the new jira action
	 */
	@Override
	public JIRAAction create(JIRAActionPK jiraActionPK) {
		JIRAAction jiraAction = new JIRAActionImpl();

		jiraAction.setNew(true);
		jiraAction.setPrimaryKey(jiraActionPK);

		return jiraAction;
	}

	/**
	 * Removes the jira action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jiraActionPK the primary key of the jira action
	 * @return the jira action that was removed
	 * @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	 */
	@Override
	public JIRAAction remove(JIRAActionPK jiraActionPK)
		throws NoSuchJIRAActionException {
		return remove((Serializable)jiraActionPK);
	}

	/**
	 * Removes the jira action with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jira action
	 * @return the jira action that was removed
	 * @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	 */
	@Override
	public JIRAAction remove(Serializable primaryKey)
		throws NoSuchJIRAActionException {
		Session session = null;

		try {
			session = openSession();

			JIRAAction jiraAction = (JIRAAction)session.get(JIRAActionImpl.class,
					primaryKey);

			if (jiraAction == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJIRAActionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(jiraAction);
		}
		catch (NoSuchJIRAActionException nsee) {
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
	protected JIRAAction removeImpl(JIRAAction jiraAction) {
		jiraAction = toUnwrappedModel(jiraAction);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jiraAction)) {
				jiraAction = (JIRAAction)session.get(JIRAActionImpl.class,
						jiraAction.getPrimaryKeyObj());
			}

			if (jiraAction != null) {
				session.delete(jiraAction);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (jiraAction != null) {
			clearCache(jiraAction);
		}

		return jiraAction;
	}

	@Override
	public JIRAAction updateImpl(JIRAAction jiraAction) {
		jiraAction = toUnwrappedModel(jiraAction);

		boolean isNew = jiraAction.isNew();

		JIRAActionModelImpl jiraActionModelImpl = (JIRAActionModelImpl)jiraAction;

		Session session = null;

		try {
			session = openSession();

			if (jiraAction.isNew()) {
				session.save(jiraAction);

				jiraAction.setNew(false);
			}
			else {
				jiraAction = (JIRAAction)session.merge(jiraAction);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!JIRAActionModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { jiraActionModelImpl.getId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((jiraActionModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { jiraActionModelImpl.getOriginalId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);

				args = new Object[] { jiraActionModelImpl.getId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_ID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ID,
					args);
			}
		}

		entityCache.putResult(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
			JIRAActionImpl.class, jiraAction.getPrimaryKey(), jiraAction, false);

		jiraAction.resetOriginalValues();

		return jiraAction;
	}

	protected JIRAAction toUnwrappedModel(JIRAAction jiraAction) {
		if (jiraAction instanceof JIRAActionImpl) {
			return jiraAction;
		}

		JIRAActionImpl jiraActionImpl = new JIRAActionImpl();

		jiraActionImpl.setNew(jiraAction.isNew());
		jiraActionImpl.setPrimaryKey(jiraAction.getPrimaryKey());

		jiraActionImpl.setId(jiraAction.getId());
		jiraActionImpl.setFoo(jiraAction.getFoo());
		jiraActionImpl.setBar(jiraAction.getBar());

		return jiraActionImpl;
	}

	/**
	 * Returns the jira action with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the jira action
	 * @return the jira action
	 * @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	 */
	@Override
	public JIRAAction findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJIRAActionException {
		JIRAAction jiraAction = fetchByPrimaryKey(primaryKey);

		if (jiraAction == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJIRAActionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return jiraAction;
	}

	/**
	 * Returns the jira action with the primary key or throws a {@link NoSuchJIRAActionException} if it could not be found.
	 *
	 * @param jiraActionPK the primary key of the jira action
	 * @return the jira action
	 * @throws NoSuchJIRAActionException if a jira action with the primary key could not be found
	 */
	@Override
	public JIRAAction findByPrimaryKey(JIRAActionPK jiraActionPK)
		throws NoSuchJIRAActionException {
		return findByPrimaryKey((Serializable)jiraActionPK);
	}

	/**
	 * Returns the jira action with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jira action
	 * @return the jira action, or <code>null</code> if a jira action with the primary key could not be found
	 */
	@Override
	public JIRAAction fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
				JIRAActionImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		JIRAAction jiraAction = (JIRAAction)serializable;

		if (jiraAction == null) {
			Session session = null;

			try {
				session = openSession();

				jiraAction = (JIRAAction)session.get(JIRAActionImpl.class,
						primaryKey);

				if (jiraAction != null) {
					cacheResult(jiraAction);
				}
				else {
					entityCache.putResult(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
						JIRAActionImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(JIRAActionModelImpl.ENTITY_CACHE_ENABLED,
					JIRAActionImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return jiraAction;
	}

	/**
	 * Returns the jira action with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jiraActionPK the primary key of the jira action
	 * @return the jira action, or <code>null</code> if a jira action with the primary key could not be found
	 */
	@Override
	public JIRAAction fetchByPrimaryKey(JIRAActionPK jiraActionPK) {
		return fetchByPrimaryKey((Serializable)jiraActionPK);
	}

	@Override
	public Map<Serializable, JIRAAction> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, JIRAAction> map = new HashMap<Serializable, JIRAAction>();

		for (Serializable primaryKey : primaryKeys) {
			JIRAAction jiraAction = fetchByPrimaryKey(primaryKey);

			if (jiraAction != null) {
				map.put(primaryKey, jiraAction);
			}
		}

		return map;
	}

	/**
	 * Returns all the jira actions.
	 *
	 * @return the jira actions
	 */
	@Override
	public List<JIRAAction> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<JIRAAction> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<JIRAAction> findAll(int start, int end,
		OrderByComparator<JIRAAction> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<JIRAAction> findAll(int start, int end,
		OrderByComparator<JIRAAction> orderByComparator,
		boolean retrieveFromCache) {
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

		List<JIRAAction> list = null;

		if (retrieveFromCache) {
			list = (List<JIRAAction>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_JIRAACTION);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_JIRAACTION;

				if (pagination) {
					sql = sql.concat(JIRAActionModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<JIRAAction>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<JIRAAction>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the jira actions from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JIRAAction jiraAction : findAll()) {
			remove(jiraAction);
		}
	}

	/**
	 * Returns the number of jira actions.
	 *
	 * @return the number of jira actions
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_JIRAACTION);

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
		return JIRAActionModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jira action persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(JIRAActionImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_JIRAACTION = "SELECT jiraAction FROM JIRAAction jiraAction";
	private static final String _SQL_SELECT_JIRAACTION_WHERE = "SELECT jiraAction FROM JIRAAction jiraAction WHERE ";
	private static final String _SQL_COUNT_JIRAACTION = "SELECT COUNT(jiraAction) FROM JIRAAction jiraAction";
	private static final String _SQL_COUNT_JIRAACTION_WHERE = "SELECT COUNT(jiraAction) FROM JIRAAction jiraAction WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "jiraAction.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No JIRAAction exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No JIRAAction exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(JIRAActionPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"id", "foo", "bar"
			});
}