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

package it.scinti.lfr.secpg.sqlinjection.model.impl;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import it.scinti.lfr.secpg.sqlinjection.model.Vendor;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Vendor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VendorCacheModel implements CacheModel<Vendor>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VendorCacheModel)) {
			return false;
		}

		VendorCacheModel vendorCacheModel = (VendorCacheModel)obj;

		if (vendorId == vendorCacheModel.vendorId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vendorId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", vendorId=");
		sb.append(vendorId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", hwId=");
		sb.append(hwId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", website=");
		sb.append(website);
		sb.append(", metadata=");
		sb.append(metadata);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Vendor toEntityModel() {
		VendorImpl vendorImpl = new VendorImpl();

		if (uuid == null) {
			vendorImpl.setUuid("");
		}
		else {
			vendorImpl.setUuid(uuid);
		}

		vendorImpl.setVendorId(vendorId);
		vendorImpl.setGroupId(groupId);
		vendorImpl.setCompanyId(companyId);
		vendorImpl.setUserId(userId);

		if (userName == null) {
			vendorImpl.setUserName("");
		}
		else {
			vendorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			vendorImpl.setCreateDate(null);
		}
		else {
			vendorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vendorImpl.setModifiedDate(null);
		}
		else {
			vendorImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (hwId == null) {
			vendorImpl.setHwId("");
		}
		else {
			vendorImpl.setHwId(hwId);
		}

		if (name == null) {
			vendorImpl.setName("");
		}
		else {
			vendorImpl.setName(name);
		}

		if (description == null) {
			vendorImpl.setDescription("");
		}
		else {
			vendorImpl.setDescription(description);
		}

		if (website == null) {
			vendorImpl.setWebsite("");
		}
		else {
			vendorImpl.setWebsite(website);
		}

		if (metadata == null) {
			vendorImpl.setMetadata("");
		}
		else {
			vendorImpl.setMetadata(metadata);
		}

		vendorImpl.resetOriginalValues();

		return vendorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		vendorId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		hwId = objectInput.readUTF();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		website = objectInput.readUTF();
		metadata = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(vendorId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (hwId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hwId);
		}

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (website == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(website);
		}

		if (metadata == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(metadata);
		}
	}

	public String uuid;
	public long vendorId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String hwId;
	public String name;
	public String description;
	public String website;
	public String metadata;

}