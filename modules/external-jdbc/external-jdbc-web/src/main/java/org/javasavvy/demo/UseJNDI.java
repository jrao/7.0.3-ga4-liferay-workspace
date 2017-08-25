package org.javasavvy.demo;

import org.javasavvy.demo.service.CountryLocalService;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

public class UseJNDI {

	public static void useJNDI() {
		System.out.println("In UseJNDI.useJNDI()!");
		
		BundleContext bundleContext = FrameworkUtil.getBundle(UseJNDI.class).getBundleContext();
		
		ServiceTracker<CountryLocalService, CountryLocalService> tracker =
				new ServiceTracker<CountryLocalService, CountryLocalService>(bundleContext, CountryLocalService.class, null);
		
		tracker.open();
		
		CountryLocalService countryLocalService = tracker.getService();
		
		try {
			countryLocalService.useJNDI();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		tracker.close();
	}

}
