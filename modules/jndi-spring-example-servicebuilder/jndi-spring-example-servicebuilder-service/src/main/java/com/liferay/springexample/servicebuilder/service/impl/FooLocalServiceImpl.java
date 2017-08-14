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

package com.liferay.springexample.servicebuilder.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.spring.jndi.JndiObjectFactoryBean;
import com.liferay.springexample.servicebuilder.service.base.FooLocalServiceBaseImpl;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.springexample.servicebuilder.service.FooLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FooLocalServiceBaseImpl
 * @see com.liferay.springexample.servicebuilder.service.FooLocalServiceUtil
 */
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.liferay.springexample.servicebuilder.service.FooLocalServiceUtil} to access the foo local service.
	 */
	
	public void useJNDI() {
		System.out.println("In FooLocalServiceImpl.useJNDI()!");
		
		Thread thread = Thread.currentThread();

		// Use portal class loader
		ClassLoader origLoader = thread.getContextClassLoader();
		thread.setContextClassLoader(PortalClassLoaderUtil.getClassLoader());

		try {
			// Invoke JNDI Resource
			DataSource datasource = fooPersistence.getDataSource();

			Connection connection = datasource.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select id, foo, bar from testdata");

			while (resultSet.next()) {
				System.out.println("Record:");
				String id = resultSet.getString("id");
				System.out.println("ID: " + id);
				String foo = resultSet.getString("foo");
				System.out.println("Foo: " + foo);
				String bar = resultSet.getString("bar");
				System.out.println("Bar: " + bar);
				System.out.println();
			}
			
			connection.close();
		}
		catch (SQLException sqle) {
			
		}
		finally {
			// Switch back to the original class loader
			thread.setContextClassLoader(origLoader);
		}
	}

}