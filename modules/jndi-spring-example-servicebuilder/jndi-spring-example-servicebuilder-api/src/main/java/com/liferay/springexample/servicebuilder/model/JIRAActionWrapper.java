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
 * This class is a wrapper for {@link JIRAAction}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JIRAAction
 * @generated
 */
@ProviderType
public class JIRAActionWrapper implements JIRAAction, ModelWrapper<JIRAAction> {
	public JIRAActionWrapper(JIRAAction jiraAction) {
		_jiraAction = jiraAction;
	}

	@Override
	public Class<?> getModelClass() {
		return JIRAAction.class;
	}

	@Override
	public String getModelClassName() {
		return JIRAAction.class.getName();
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
	public JIRAAction toEscapedModel() {
		return new JIRAActionWrapper(_jiraAction.toEscapedModel());
	}

	@Override
	public JIRAAction toUnescapedModel() {
		return new JIRAActionWrapper(_jiraAction.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _jiraAction.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _jiraAction.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _jiraAction.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _jiraAction.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<JIRAAction> toCacheModel() {
		return _jiraAction.toCacheModel();
	}

	/**
	* Returns the primary key of this jira action.
	*
	* @return the primary key of this jira action
	*/
	@Override
	public com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK getPrimaryKey() {
		return _jiraAction.getPrimaryKey();
	}

	@Override
	public int compareTo(JIRAAction jiraAction) {
		return _jiraAction.compareTo(jiraAction);
	}

	@Override
	public int hashCode() {
		return _jiraAction.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _jiraAction.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new JIRAActionWrapper((JIRAAction)_jiraAction.clone());
	}

	/**
	* Returns the foo of this jira action.
	*
	* @return the foo of this jira action
	*/
	@Override
	public java.lang.String getFoo() {
		return _jiraAction.getFoo();
	}

	@Override
	public java.lang.String toString() {
		return _jiraAction.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _jiraAction.toXmlString();
	}

	/**
	* Returns the bar of this jira action.
	*
	* @return the bar of this jira action
	*/
	@Override
	public long getBar() {
		return _jiraAction.getBar();
	}

	/**
	* Returns the ID of this jira action.
	*
	* @return the ID of this jira action
	*/
	@Override
	public long getId() {
		return _jiraAction.getId();
	}

	@Override
	public void persist() {
		_jiraAction.persist();
	}

	/**
	* Sets the bar of this jira action.
	*
	* @param bar the bar of this jira action
	*/
	@Override
	public void setBar(long bar) {
		_jiraAction.setBar(bar);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_jiraAction.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_jiraAction.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_jiraAction.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_jiraAction.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the foo of this jira action.
	*
	* @param foo the foo of this jira action
	*/
	@Override
	public void setFoo(java.lang.String foo) {
		_jiraAction.setFoo(foo);
	}

	/**
	* Sets the ID of this jira action.
	*
	* @param id the ID of this jira action
	*/
	@Override
	public void setId(long id) {
		_jiraAction.setId(id);
	}

	@Override
	public void setNew(boolean n) {
		_jiraAction.setNew(n);
	}

	/**
	* Sets the primary key of this jira action.
	*
	* @param primaryKey the primary key of this jira action
	*/
	@Override
	public void setPrimaryKey(
		com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK primaryKey) {
		_jiraAction.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_jiraAction.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JIRAActionWrapper)) {
			return false;
		}

		JIRAActionWrapper jiraActionWrapper = (JIRAActionWrapper)obj;

		if (Objects.equals(_jiraAction, jiraActionWrapper._jiraAction)) {
			return true;
		}

		return false;
	}

	@Override
	public JIRAAction getWrappedModel() {
		return _jiraAction;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _jiraAction.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _jiraAction.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_jiraAction.resetOriginalValues();
	}

	private final JIRAAction _jiraAction;
}