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

import com.liferay.springexample.servicebuilder.service.persistence.JIRAActionPK;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class JIRAActionSoap implements Serializable {
	public static JIRAActionSoap toSoapModel(JIRAAction model) {
		JIRAActionSoap soapModel = new JIRAActionSoap();

		soapModel.setId(model.getId());
		soapModel.setFoo(model.getFoo());
		soapModel.setBar(model.getBar());

		return soapModel;
	}

	public static JIRAActionSoap[] toSoapModels(JIRAAction[] models) {
		JIRAActionSoap[] soapModels = new JIRAActionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static JIRAActionSoap[][] toSoapModels(JIRAAction[][] models) {
		JIRAActionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new JIRAActionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new JIRAActionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static JIRAActionSoap[] toSoapModels(List<JIRAAction> models) {
		List<JIRAActionSoap> soapModels = new ArrayList<JIRAActionSoap>(models.size());

		for (JIRAAction model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new JIRAActionSoap[soapModels.size()]);
	}

	public JIRAActionSoap() {
	}

	public JIRAActionPK getPrimaryKey() {
		return new JIRAActionPK(_id, _foo, _bar);
	}

	public void setPrimaryKey(JIRAActionPK pk) {
		setId(pk.id);
		setFoo(pk.foo);
		setBar(pk.bar);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getFoo() {
		return _foo;
	}

	public void setFoo(String foo) {
		_foo = foo;
	}

	public long getBar() {
		return _bar;
	}

	public void setBar(long bar) {
		_bar = bar;
	}

	private long _id;
	private String _foo;
	private long _bar;
}