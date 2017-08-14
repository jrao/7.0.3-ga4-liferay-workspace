package com.liferay.example.jndi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.liferay.portal.kernel.util.PortalClassLoaderUtil;

public class JNDIExample {

	public static void sayHello() {
		System.out.println("Hello, world!");
	}

	public static void useJNDI() {
		Thread thread = Thread.currentThread();

		// Use portal class loader
		ClassLoader origLoader = thread.getContextClassLoader();
		thread.setContextClassLoader(PortalClassLoaderUtil.getClassLoader());

		try {
			// Invoke JNDI Resource
			InitialContext ctx = new InitialContext();
			DataSource datasource = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB");

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
		catch (NamingException ne) {
			ne.printStackTrace();
		}
		catch (SQLException sqle) {
			
		}
		finally {
			// Switch back to the original class loader
			thread.setContextClassLoader(origLoader);
		}
	}

}
