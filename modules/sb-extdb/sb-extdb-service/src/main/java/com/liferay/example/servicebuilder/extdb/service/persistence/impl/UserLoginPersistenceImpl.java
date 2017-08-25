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

package com.liferay.example.servicebuilder.extdb.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.example.servicebuilder.extdb.exception.NoSuchUserLoginException;
import com.liferay.example.servicebuilder.extdb.model.UserLogin;
import com.liferay.example.servicebuilder.extdb.model.impl.UserLoginImpl;
import com.liferay.example.servicebuilder.extdb.model.impl.UserLoginModelImpl;
import com.liferay.example.servicebuilder.extdb.service.persistence.UserLoginPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence implementation for the user login service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UserLoginPersistence
 * @see com.liferay.example.servicebuilder.extdb.service.persistence.UserLoginUtil
 * @generated
 */
@ProviderType
public class UserLoginPersistenceImpl extends BasePersistenceImpl<UserLogin>
	implements UserLoginPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UserLoginUtil} to access the user login persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UserLoginImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
			UserLoginModelImpl.FINDER_CACHE_ENABLED, UserLoginImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
			UserLoginModelImpl.FINDER_CACHE_ENABLED, UserLoginImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
			UserLoginModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UserLoginPersistenceImpl() {
		setModelClass(UserLogin.class);
	}

	/**
	 * Caches the user login in the entity cache if it is enabled.
	 *
	 * @param userLogin the user login
	 */
	@Override
	public void cacheResult(UserLogin userLogin) {
		entityCache.putResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
			UserLoginImpl.class, userLogin.getPrimaryKey(), userLogin);

		userLogin.resetOriginalValues();
	}

	/**
	 * Caches the user logins in the entity cache if it is enabled.
	 *
	 * @param userLogins the user logins
	 */
	@Override
	public void cacheResult(List<UserLogin> userLogins) {
		for (UserLogin userLogin : userLogins) {
			if (entityCache.getResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
						UserLoginImpl.class, userLogin.getPrimaryKey()) == null) {
				cacheResult(userLogin);
			}
			else {
				userLogin.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all user logins.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(UserLoginImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the user login.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(UserLogin userLogin) {
		entityCache.removeResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
			UserLoginImpl.class, userLogin.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<UserLogin> userLogins) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (UserLogin userLogin : userLogins) {
			entityCache.removeResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
				UserLoginImpl.class, userLogin.getPrimaryKey());
		}
	}

	/**
	 * Creates a new user login with the primary key. Does not add the user login to the database.
	 *
	 * @param userId the primary key for the new user login
	 * @return the new user login
	 */
	@Override
	public UserLogin create(long userId) {
		UserLogin userLogin = new UserLoginImpl();

		userLogin.setNew(true);
		userLogin.setPrimaryKey(userId);

		return userLogin;
	}

	/**
	 * Removes the user login with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userId the primary key of the user login
	 * @return the user login that was removed
	 * @throws NoSuchUserLoginException if a user login with the primary key could not be found
	 */
	@Override
	public UserLogin remove(long userId) throws NoSuchUserLoginException {
		return remove((Serializable)userId);
	}

	/**
	 * Removes the user login with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the user login
	 * @return the user login that was removed
	 * @throws NoSuchUserLoginException if a user login with the primary key could not be found
	 */
	@Override
	public UserLogin remove(Serializable primaryKey)
		throws NoSuchUserLoginException {
		Session session = null;

		try {
			session = openSession();

			UserLogin userLogin = (UserLogin)session.get(UserLoginImpl.class,
					primaryKey);

			if (userLogin == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUserLoginException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(userLogin);
		}
		catch (NoSuchUserLoginException nsee) {
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
	protected UserLogin removeImpl(UserLogin userLogin) {
		userLogin = toUnwrappedModel(userLogin);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(userLogin)) {
				userLogin = (UserLogin)session.get(UserLoginImpl.class,
						userLogin.getPrimaryKeyObj());
			}

			if (userLogin != null) {
				session.delete(userLogin);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (userLogin != null) {
			clearCache(userLogin);
		}

		return userLogin;
	}

	@Override
	public UserLogin updateImpl(UserLogin userLogin) {
		userLogin = toUnwrappedModel(userLogin);

		boolean isNew = userLogin.isNew();

		Session session = null;

		try {
			session = openSession();

			if (userLogin.isNew()) {
				session.save(userLogin);

				userLogin.setNew(false);
			}
			else {
				userLogin = (UserLogin)session.merge(userLogin);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		entityCache.putResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
			UserLoginImpl.class, userLogin.getPrimaryKey(), userLogin, false);

		userLogin.resetOriginalValues();

		return userLogin;
	}

	protected UserLogin toUnwrappedModel(UserLogin userLogin) {
		if (userLogin instanceof UserLoginImpl) {
			return userLogin;
		}

		UserLoginImpl userLoginImpl = new UserLoginImpl();

		userLoginImpl.setNew(userLogin.isNew());
		userLoginImpl.setPrimaryKey(userLogin.getPrimaryKey());

		userLoginImpl.setUserId(userLogin.getUserId());
		userLoginImpl.setLastLogin(userLogin.getLastLogin());
		userLoginImpl.setTotalLogins(userLogin.getTotalLogins());
		userLoginImpl.setLongestTimeBetweenLogins(userLogin.getLongestTimeBetweenLogins());
		userLoginImpl.setShortestTimeBetweenLogins(userLogin.getShortestTimeBetweenLogins());

		return userLoginImpl;
	}

	/**
	 * Returns the user login with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the user login
	 * @return the user login
	 * @throws NoSuchUserLoginException if a user login with the primary key could not be found
	 */
	@Override
	public UserLogin findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUserLoginException {
		UserLogin userLogin = fetchByPrimaryKey(primaryKey);

		if (userLogin == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUserLoginException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return userLogin;
	}

	/**
	 * Returns the user login with the primary key or throws a {@link NoSuchUserLoginException} if it could not be found.
	 *
	 * @param userId the primary key of the user login
	 * @return the user login
	 * @throws NoSuchUserLoginException if a user login with the primary key could not be found
	 */
	@Override
	public UserLogin findByPrimaryKey(long userId)
		throws NoSuchUserLoginException {
		return findByPrimaryKey((Serializable)userId);
	}

	/**
	 * Returns the user login with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the user login
	 * @return the user login, or <code>null</code> if a user login with the primary key could not be found
	 */
	@Override
	public UserLogin fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
				UserLoginImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		UserLogin userLogin = (UserLogin)serializable;

		if (userLogin == null) {
			Session session = null;

			try {
				session = openSession();

				userLogin = (UserLogin)session.get(UserLoginImpl.class,
						primaryKey);

				if (userLogin != null) {
					cacheResult(userLogin);
				}
				else {
					entityCache.putResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
						UserLoginImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
					UserLoginImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return userLogin;
	}

	/**
	 * Returns the user login with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userId the primary key of the user login
	 * @return the user login, or <code>null</code> if a user login with the primary key could not be found
	 */
	@Override
	public UserLogin fetchByPrimaryKey(long userId) {
		return fetchByPrimaryKey((Serializable)userId);
	}

	@Override
	public Map<Serializable, UserLogin> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, UserLogin> map = new HashMap<Serializable, UserLogin>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			UserLogin userLogin = fetchByPrimaryKey(primaryKey);

			if (userLogin != null) {
				map.put(primaryKey, userLogin);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
					UserLoginImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (UserLogin)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_USERLOGIN_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(StringPool.COMMA);
		}

		query.setIndex(query.index() - 1);

		query.append(StringPool.CLOSE_PARENTHESIS);

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (UserLogin userLogin : (List<UserLogin>)q.list()) {
				map.put(userLogin.getPrimaryKeyObj(), userLogin);

				cacheResult(userLogin);

				uncachedPrimaryKeys.remove(userLogin.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(UserLoginModelImpl.ENTITY_CACHE_ENABLED,
					UserLoginImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the user logins.
	 *
	 * @return the user logins
	 */
	@Override
	public List<UserLogin> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the user logins.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserLoginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user logins
	 * @param end the upper bound of the range of user logins (not inclusive)
	 * @return the range of user logins
	 */
	@Override
	public List<UserLogin> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the user logins.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserLoginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user logins
	 * @param end the upper bound of the range of user logins (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of user logins
	 */
	@Override
	public List<UserLogin> findAll(int start, int end,
		OrderByComparator<UserLogin> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the user logins.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link UserLoginModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of user logins
	 * @param end the upper bound of the range of user logins (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the ordered range of user logins
	 */
	@Override
	public List<UserLogin> findAll(int start, int end,
		OrderByComparator<UserLogin> orderByComparator,
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

		List<UserLogin> list = null;

		if (retrieveFromCache) {
			list = (List<UserLogin>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_USERLOGIN);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERLOGIN;

				if (pagination) {
					sql = sql.concat(UserLoginModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<UserLogin>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<UserLogin>)QueryUtil.list(q, getDialect(),
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
	 * Removes all the user logins from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (UserLogin userLogin : findAll()) {
			remove(userLogin);
		}
	}

	/**
	 * Returns the number of user logins.
	 *
	 * @return the number of user logins
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERLOGIN);

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
	protected Map<String, Integer> getTableColumnsMap() {
		return UserLoginModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the user login persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(UserLoginImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_USERLOGIN = "SELECT userLogin FROM UserLogin userLogin";
	private static final String _SQL_SELECT_USERLOGIN_WHERE_PKS_IN = "SELECT userLogin FROM UserLogin userLogin WHERE userId IN (";
	private static final String _SQL_COUNT_USERLOGIN = "SELECT COUNT(userLogin) FROM UserLogin userLogin";
	private static final String _ORDER_BY_ENTITY_ALIAS = "userLogin.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No UserLogin exists with the primary key ";
	private static final Log _log = LogFactoryUtil.getLog(UserLoginPersistenceImpl.class);
}