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

import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class JIRAActionPK implements Comparable<JIRAActionPK>, Serializable {
	public long id;
	public String foo;
	public long bar;

	public JIRAActionPK() {
	}

	public JIRAActionPK(long id, String foo, long bar) {
		this.id = id;
		this.foo = foo;
		this.bar = bar;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFoo() {
		return foo;
	}

	public void setFoo(String foo) {
		this.foo = foo;
	}

	public long getBar() {
		return bar;
	}

	public void setBar(long bar) {
		this.bar = bar;
	}

	@Override
	public int compareTo(JIRAActionPK pk) {
		if (pk == null) {
			return -1;
		}

		int value = 0;

		if (id < pk.id) {
			value = -1;
		}
		else if (id > pk.id) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		value = foo.compareTo(pk.foo);

		if (value != 0) {
			return value;
		}

		if (bar < pk.bar) {
			value = -1;
		}
		else if (bar > pk.bar) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof JIRAActionPK)) {
			return false;
		}

		JIRAActionPK pk = (JIRAActionPK)obj;

		if ((id == pk.id) && (foo.equals(pk.foo)) && (bar == pk.bar)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		int hashCode = 0;

		hashCode = HashUtil.hash(hashCode, id);
		hashCode = HashUtil.hash(hashCode, foo);
		hashCode = HashUtil.hash(hashCode, bar);

		return hashCode;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append(StringPool.OPEN_CURLY_BRACE);

		sb.append("id");
		sb.append(StringPool.EQUAL);
		sb.append(id);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("foo");
		sb.append(StringPool.EQUAL);
		sb.append(foo);

		sb.append(StringPool.COMMA);
		sb.append(StringPool.SPACE);
		sb.append("bar");
		sb.append(StringPool.EQUAL);
		sb.append(bar);

		sb.append(StringPool.CLOSE_CURLY_BRACE);

		return sb.toString();
	}
}