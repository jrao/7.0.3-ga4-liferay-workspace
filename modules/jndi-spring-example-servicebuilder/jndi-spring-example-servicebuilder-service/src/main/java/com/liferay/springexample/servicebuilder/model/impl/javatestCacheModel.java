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

import com.liferay.springexample.servicebuilder.model.javatest;
import com.liferay.springexample.servicebuilder.service.persistence.javatestPK;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing javatest in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see javatest
 * @generated
 */
@ProviderType
public class javatestCacheModel implements CacheModel<javatest>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof javatestCacheModel)) {
			return false;
		}

		javatestCacheModel javatestCacheModel = (javatestCacheModel)obj;

		if (javatestPK.equals(javatestCacheModel.javatestPK)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, javatestPK);
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
	public javatest toEntityModel() {
		javatestImpl javatestImpl = new javatestImpl();

		javatestImpl.setId(id);

		if (foo == null) {
			javatestImpl.setFoo(StringPool.BLANK);
		}
		else {
			javatestImpl.setFoo(foo);
		}

		javatestImpl.setBar(bar);

		javatestImpl.resetOriginalValues();

		return javatestImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		foo = objectInput.readUTF();

		bar = objectInput.readLong();

		javatestPK = new javatestPK(id, foo, bar);
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
	public transient javatestPK javatestPK;
}