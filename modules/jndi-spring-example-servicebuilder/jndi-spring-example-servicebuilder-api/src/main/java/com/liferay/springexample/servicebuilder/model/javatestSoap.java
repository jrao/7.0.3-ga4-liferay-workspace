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

import com.liferay.springexample.servicebuilder.service.persistence.javatestPK;

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
public class javatestSoap implements Serializable {
	public static javatestSoap toSoapModel(javatest model) {
		javatestSoap soapModel = new javatestSoap();

		soapModel.setId(model.getId());
		soapModel.setFoo(model.getFoo());
		soapModel.setBar(model.getBar());

		return soapModel;
	}

	public static javatestSoap[] toSoapModels(javatest[] models) {
		javatestSoap[] soapModels = new javatestSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static javatestSoap[][] toSoapModels(javatest[][] models) {
		javatestSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new javatestSoap[models.length][models[0].length];
		}
		else {
			soapModels = new javatestSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static javatestSoap[] toSoapModels(List<javatest> models) {
		List<javatestSoap> soapModels = new ArrayList<javatestSoap>(models.size());

		for (javatest model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new javatestSoap[soapModels.size()]);
	}

	public javatestSoap() {
	}

	public javatestPK getPrimaryKey() {
		return new javatestPK(_id, _foo, _bar);
	}

	public void setPrimaryKey(javatestPK pk) {
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