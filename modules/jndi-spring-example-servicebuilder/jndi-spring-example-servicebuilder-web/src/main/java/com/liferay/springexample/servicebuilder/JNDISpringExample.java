package com.liferay.springexample.servicebuilder;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import com.liferay.springexample.servicebuilder.service.FooLocalService;

public class JNDISpringExample {

	public static void useJNDI() {
		System.out.println("In JNDISpringExample.useJNDI()!");
		
		BundleContext bundleContext = FrameworkUtil.getBundle(JNDISpringExample.class).getBundleContext();
		
		ServiceTracker<FooLocalService, FooLocalService> tracker =
				new ServiceTracker<FooLocalService, FooLocalService>(bundleContext, FooLocalService.class, null);
		
		tracker.open();
		
		FooLocalService fooLocalService = tracker.getService();
		
		try {
			fooLocalService.useJNDI();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		tracker.close();
	}

}
