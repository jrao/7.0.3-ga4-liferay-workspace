package com.liferay.example.servicebuilder.extdb.event;

import com.liferay.example.servicebuilder.extdb.service.UserLoginLocalService;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.LifecycleAction;
import com.liferay.portal.kernel.events.LifecycleEvent;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.registry.Registry;
import com.liferay.registry.RegistryUtil;
import com.liferay.registry.ServiceTracker;

import java.util.Date;

import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jrao
 */
@Component(immediate = true, property = { "key=login.events.post" }, service = LifecycleAction.class)
public class UserLoginTrackerAction implements LifecycleAction {

	/**
	 * processLifecycleEvent: Invoked when the registered event is triggered.
	 * 
	 * @param lifecycleEvent
	 * @throws ActionException
	 */
	@Override
	public void processLifecycleEvent(LifecycleEvent lifecycleEvent) throws ActionException {

		// okay, we need the user login for the event
		User user = null;

		try {
			user = PortalUtil.getUser(lifecycleEvent.getRequest());
		}
		catch (PortalException e) {
			_logger.error("Error accessing login user: " + e.getMessage(), e);
		}

		if (user == null) {
			_logger.warn("Could not find the logged in user, nothing to track.");

			return;
		}

		// we have the user, let's invoke the service
		getService().updateUserLogin(user.getUserId(), new Date());

		// alternatively we could just use the local service util:
		// UserLoginLocalServiceUtil.updateUserLogin(user.getUserId(), new
		// Date());
	}

	/**
	 * getService: Returns the user tracker service instance.
	 * 
	 * @return UserLoginLocalService The instance to use.
	 */
	public UserLoginLocalService getService() {
		ServiceTracker<UserLoginLocalService, UserLoginLocalService> userLoginLocalServiceTracker = _registry
				.trackServices(UserLoginLocalService.class);
		
		userLoginLocalServiceTracker.open();

		UserLoginLocalService userLoginLocalService = userLoginLocalServiceTracker.getService();
		
		userLoginLocalServiceTracker.close();
		
		return userLoginLocalService;
	}
	
	private Registry _registry = RegistryUtil.getRegistry();

	private static final Logger _logger = LoggerFactory.getLogger(UserLoginTrackerAction.class);

}