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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the JIRAAction service. Represents a row in the &quot;jiraaction&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see JIRAActionModel
 * @see com.liferay.springexample.servicebuilder.model.impl.JIRAActionImpl
 * @see com.liferay.springexample.servicebuilder.model.impl.JIRAActionModelImpl
 * @generated
 */
@ImplementationClassName("com.liferay.springexample.servicebuilder.model.impl.JIRAActionImpl")
@ProviderType
public interface JIRAAction extends JIRAActionModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.springexample.servicebuilder.model.impl.JIRAActionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<JIRAAction, Long> ID_ACCESSOR = new Accessor<JIRAAction, Long>() {
			@Override
			public Long get(JIRAAction jiraAction) {
				return jiraAction.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<JIRAAction> getTypeClass() {
				return JIRAAction.class;
			}
		};

	public static final Accessor<JIRAAction, String> FOO_ACCESSOR = new Accessor<JIRAAction, String>() {
			@Override
			public String get(JIRAAction jiraAction) {
				return jiraAction.getFoo();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<JIRAAction> getTypeClass() {
				return JIRAAction.class;
			}
		};

	public static final Accessor<JIRAAction, Long> BAR_ACCESSOR = new Accessor<JIRAAction, Long>() {
			@Override
			public Long get(JIRAAction jiraAction) {
				return jiraAction.getBar();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<JIRAAction> getTypeClass() {
				return JIRAAction.class;
			}
		};
}