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

package com.liferay.springexample.servicebuilder.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link javatest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see javatest
 * @generated
 */
@ProviderType
public class javatestWrapper implements javatest, ModelWrapper<javatest> {
	public javatestWrapper(javatest javatest) {
		_javatest = javatest;
	}

	@Override
	public Class<?> getModelClass() {
		return javatest.class;
	}

	@Override
	public String getModelClassName() {
		return javatest.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("foo", getFoo());
		attributes.put("bar", getBar());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String foo = (String)attributes.get("foo");

		if (foo != null) {
			setFoo(foo);
		}

		Long bar = (Long)attributes.get("bar");

		if (bar != null) {
			setBar(bar);
		}
	}

	@Override
	public boolean isCachedModel() {
		return _javatest.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _javatest.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _javatest.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _javatest.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<com.liferay.springexample.servicebuilder.model.javatest> toCacheModel() {
		return _javatest.toCacheModel();
	}

	@Override
	public com.liferay.springexample.servicebuilder.model.javatest toEscapedModel() {
		return new javatestWrapper(_javatest.toEscapedModel());
	}

	@Override
	public com.liferay.springexample.servicebuilder.model.javatest toUnescapedModel() {
		return new javatestWrapper(_javatest.toUnescapedModel());
	}

	/**
	* Returns the primary key of this javatest.
	*
	* @return the primary key of this javatest
	*/
	@Override
	public com.liferay.springexample.servicebuilder.service.persistence.javatestPK getPrimaryKey() {
		return _javatest.getPrimaryKey();
	}

	@Override
	public int compareTo(
		com.liferay.springexample.servicebuilder.model.javatest javatest) {
		return _javatest.compareTo(javatest);
	}

	@Override
	public int hashCode() {
		return _javatest.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _javatest.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new javatestWrapper((javatest)_javatest.clone());
	}

	/**
	* Returns the foo of this javatest.
	*
	* @return the foo of this javatest
	*/
	@Override
	public java.lang.String getFoo() {
		return _javatest.getFoo();
	}

	@Override
	public java.lang.String toString() {
		return _javatest.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _javatest.toXmlString();
	}

	/**
	* Returns the bar of this javatest.
	*
	* @return the bar of this javatest
	*/
	@Override
	public long getBar() {
		return _javatest.getBar();
	}

	/**
	* Returns the ID of this javatest.
	*
	* @return the ID of this javatest
	*/
	@Override
	public long getId() {
		return _javatest.getId();
	}

	@Override
	public void persist() {
		_javatest.persist();
	}

	/**
	* Sets the bar of this javatest.
	*
	* @param bar the bar of this javatest
	*/
	@Override
	public void setBar(long bar) {
		_javatest.setBar(bar);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_javatest.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_javatest.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_javatest.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_javatest.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the foo of this javatest.
	*
	* @param foo the foo of this javatest
	*/
	@Override
	public void setFoo(java.lang.String foo) {
		_javatest.setFoo(foo);
	}

	/**
	* Sets the ID of this javatest.
	*
	* @param id the ID of this javatest
	*/
	@Override
	public void setId(long id) {
		_javatest.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_javatest.setNew(n);
	}

	/**
	* Sets the primary key of this javatest.
	*
	* @param primaryKey the primary key of this javatest
	*/
	@Override
	public void setPrimaryKey(
		com.liferay.springexample.servicebuilder.service.persistence.javatestPK primaryKey) {
		_javatest.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_javatest.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof javatestWrapper)) {
			return false;
		}

		javatestWrapper javatestWrapper = (javatestWrapper)obj;

		if (Objects.equals(_javatest, javatestWrapper._javatest)) {
			return true;
		}

		return false;
	}

	@Override
	public javatest getWrappedModel() {
		return _javatest;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _javatest.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _javatest.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_javatest.resetOriginalValues();
	}

	private final javatest _javatest;
}