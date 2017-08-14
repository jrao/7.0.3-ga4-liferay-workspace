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

package com.liferay.springexample.servicebuilder.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.liferay.springexample.servicebuilder.model.JIRAAction;
import com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing JIRAAction in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see JIRAAction
 * @generated
 */
@ProviderType
public class JIRAActionCacheModel implements CacheModel<JIRAAction>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JIRAActionCacheModel)) {
			return false;
		}

		JIRAActionCacheModel jiraActionCacheModel = (JIRAActionCacheModel)obj;

		if (jiraActionPK.equals(jiraActionCacheModel.jiraActionPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, jiraActionPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", foo=");
		sb.append(foo);
		sb.append(", bar=");
		sb.append(bar);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public JIRAAction toEntityModel() {
		JIRAActionImpl jiraActionImpl = new JIRAActionImpl();

		jiraActionImpl.setId(id);

		if (foo == null) {
			jiraActionImpl.setFoo(StringPool.BLANK);
		}
		else {
			jiraActionImpl.setFoo(foo);
		}

		jiraActionImpl.setBar(bar);

		jiraActionImpl.resetOriginalValues();

		return jiraActionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		foo = objectInput.readUTF();

		bar = objectInput.readLong();

		jiraActionPK = new JIRAActionPK(id, foo, bar);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(id);

		if (foo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(foo);
		}

		objectOutput.writeLong(bar);
	}

	public long id;
	public String foo;
	public long bar;
	public transient JIRAActionPK jiraActionPK;
}