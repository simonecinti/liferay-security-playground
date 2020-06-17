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

package it.scinti.lfr.secpg.xssinjection.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the Feedback service. Represents a row in the &quot;xssj_Feedback&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see FeedbackModel
 * @see it.scinti.lfr.secpg.xssinjection.model.impl.FeedbackImpl
 * @see it.scinti.lfr.secpg.xssinjection.model.impl.FeedbackModelImpl
 * @generated
 */
@ImplementationClassName("it.scinti.lfr.secpg.xssinjection.model.impl.FeedbackImpl")
@ProviderType
public interface Feedback extends FeedbackModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link it.scinti.lfr.secpg.xssinjection.model.impl.FeedbackImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Feedback, Long> FEEDBACK_ID_ACCESSOR = new Accessor<Feedback, Long>() {
			@Override
			public Long get(Feedback feedback) {
				return feedback.getFeedbackId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Feedback> getTypeClass() {
				return Feedback.class;
			}
		};
}