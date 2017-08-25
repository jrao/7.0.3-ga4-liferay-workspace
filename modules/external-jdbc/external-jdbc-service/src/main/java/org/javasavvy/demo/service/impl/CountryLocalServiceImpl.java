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

package org.javasavvy.demo.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.javasavvy.demo.service.base.CountryLocalServiceBaseImpl;

import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

/**
 * The implementation of the country local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link org.javasavvy.demo.service.CountryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CountryLocalServiceBaseImpl
 * @see org.javasavvy.demo.service.CountryLocalServiceUtil
 */
public class CountryLocalServiceImpl extends CountryLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link org.javasavvy.demo.service.CountryLocalServiceUtil} to access the country local service.
	 */
	
	public void useJNDI() {
		System.out.println("In CountryLocalServiceImpl.useJNDI()!");
		
		Thread thread = Thread.currentThread();

		// Use portal class loader
		ClassLoader origLoader = thread.getContextClassLoader();
		thread.setContextClassLoader(PortalClassLoaderUtil.getClassLoader());

		try {
			// Invoke JNDI Resource
			DataSource datasource = countryPersistence.getDataSource();

			Connection connection = datasource.getConnection();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select id, name from country");

			while (resultSet.next()) {
				System.out.println("Record:");
				String id = resultSet.getString("id");
				System.out.println("ID: " + id);
				String name = resultSet.getString("name");
				System.out.println("Name: " + name);
				System.out.println();
			}
			
			connection.close();
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		finally {
			// Switch back to the original class loader
			thread.setContextClassLoader(origLoader);
		}
	}
	
}