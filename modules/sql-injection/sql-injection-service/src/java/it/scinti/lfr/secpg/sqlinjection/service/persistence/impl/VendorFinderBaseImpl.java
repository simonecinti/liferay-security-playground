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

package it.scinti.lfr.secpg.sqlinjection.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import it.scinti.lfr.secpg.sqlinjection.model.Vendor;
import it.scinti.lfr.secpg.sqlinjection.service.persistence.VendorPersistence;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VendorFinderBaseImpl extends BasePersistenceImpl<Vendor> {

	public VendorFinderBaseImpl() {
		setModelClass(Vendor.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
				"_dbColumnNames");

			field.setAccessible(true);

			field.set(this, dbColumnNames);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception, exception);
			}
		}
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getVendorPersistence().getBadColumnNames();
	}

	/**
	 * Returns the vendor persistence.
	 *
	 * @return the vendor persistence
	 */
	public VendorPersistence getVendorPersistence() {
		return vendorPersistence;
	}

	/**
	 * Sets the vendor persistence.
	 *
	 * @param vendorPersistence the vendor persistence
	 */
	public void setVendorPersistence(VendorPersistence vendorPersistence) {
		this.vendorPersistence = vendorPersistence;
	}

	@BeanReference(type = VendorPersistence.class)
	protected VendorPersistence vendorPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		VendorFinderBaseImpl.class);

}