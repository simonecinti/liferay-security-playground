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

package it.scinti.lfr.secpg.xssinjection.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import it.scinti.lfr.secpg.xssinjection.exception.NoSuchFeedbackException;
import it.scinti.lfr.secpg.xssinjection.model.Feedback;

import java.util.Date;

/**
 * The persistence interface for the feedback service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see it.scinti.lfr.secpg.xssinjection.service.persistence.impl.FeedbackPersistenceImpl
 * @see FeedbackUtil
 * @generated
 */
@ProviderType
public interface FeedbackPersistence extends BasePersistence<Feedback> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FeedbackUtil} to access the feedback persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the feedbacks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid(String uuid);

	/**
	* Returns a range of all the feedbacks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findByUuid_PrevAndNext(long feedbackId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of feedbacks where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching feedbacks
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchFeedbackException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUUID_G(String uuid, long groupId)
		throws NoSuchFeedbackException;

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the feedback where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the feedback where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the feedback that was removed
	*/
	public Feedback removeByUUID_G(String uuid, long groupId)
		throws NoSuchFeedbackException;

	/**
	* Returns the number of feedbacks where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching feedbacks
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns an ordered range of all the feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findByUuid_C_PrevAndNext(long feedbackId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of feedbacks where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching feedbacks
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the feedbacks where email = &#63;.
	*
	* @param email the email
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findByemail(String email);

	/**
	* Returns a range of all the feedbacks where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public java.util.List<Feedback> findByemail(String email, int start, int end);

	/**
	* Returns an ordered range of all the feedbacks where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findByemail(String email, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns an ordered range of all the feedbacks where email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param email the email
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findByemail(String email, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByemail_First(String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByemail_First(String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findByemail_Last(String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where email = &#63;.
	*
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchByemail_Last(String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where email = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findByemail_PrevAndNext(long feedbackId, String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where email = &#63; from the database.
	*
	* @param email the email
	*/
	public void removeByemail(String email);

	/**
	* Returns the number of feedbacks where email = &#63;.
	*
	* @param email the email
	* @return the number of matching feedbacks
	*/
	public int countByemail(String email);

	/**
	* Returns all the feedbacks where lastName = &#63;.
	*
	* @param lastName the last name
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findBylastName(String lastName);

	/**
	* Returns a range of all the feedbacks where lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lastName the last name
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public java.util.List<Feedback> findBylastName(String lastName, int start,
		int end);

	/**
	* Returns an ordered range of all the feedbacks where lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lastName the last name
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findBylastName(String lastName, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns an ordered range of all the feedbacks where lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param lastName the last name
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findBylastName(String lastName, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where lastName = &#63;.
	*
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findBylastName_First(String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where lastName = &#63;.
	*
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchBylastName_First(String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where lastName = &#63;.
	*
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findBylastName_Last(String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where lastName = &#63;.
	*
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchBylastName_Last(String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where lastName = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findBylastName_PrevAndNext(long feedbackId,
		String lastName,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where lastName = &#63; from the database.
	*
	* @param lastName the last name
	*/
	public void removeBylastName(String lastName);

	/**
	* Returns the number of feedbacks where lastName = &#63;.
	*
	* @param lastName the last name
	* @return the number of matching feedbacks
	*/
	public int countBylastName(String lastName);

	/**
	* Returns all the feedbacks where description = &#63;.
	*
	* @param description the description
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findBydescription(String description);

	/**
	* Returns a range of all the feedbacks where description = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param description the description
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public java.util.List<Feedback> findBydescription(String description,
		int start, int end);

	/**
	* Returns an ordered range of all the feedbacks where description = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param description the description
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findBydescription(String description,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns an ordered range of all the feedbacks where description = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param description the description
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findBydescription(String description,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findBydescription_First(String description,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchBydescription_First(String description,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findBydescription_Last(String description,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where description = &#63;.
	*
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchBydescription_Last(String description,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where description = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param description the description
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findBydescription_PrevAndNext(long feedbackId,
		String description,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where description = &#63; from the database.
	*
	* @param description the description
	*/
	public void removeBydescription(String description);

	/**
	* Returns the number of feedbacks where description = &#63;.
	*
	* @param description the description
	* @return the number of matching feedbacks
	*/
	public int countBydescription(String description);

	/**
	* Returns all the feedbacks where createDate = &#63;.
	*
	* @param createDate the create date
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findBycreateDate(Date createDate);

	/**
	* Returns a range of all the feedbacks where createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createDate the create date
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public java.util.List<Feedback> findBycreateDate(Date createDate,
		int start, int end);

	/**
	* Returns an ordered range of all the feedbacks where createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createDate the create date
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findBycreateDate(Date createDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns an ordered range of all the feedbacks where createDate = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createDate the create date
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findBycreateDate(Date createDate,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where createDate = &#63;.
	*
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findBycreateDate_First(Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where createDate = &#63;.
	*
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchBycreateDate_First(Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where createDate = &#63;.
	*
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findBycreateDate_Last(Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where createDate = &#63;.
	*
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchBycreateDate_Last(Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where createDate = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param createDate the create date
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findBycreateDate_PrevAndNext(long feedbackId,
		Date createDate,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where createDate = &#63; from the database.
	*
	* @param createDate the create date
	*/
	public void removeBycreateDate(Date createDate);

	/**
	* Returns the number of feedbacks where createDate = &#63;.
	*
	* @param createDate the create date
	* @return the number of matching feedbacks
	*/
	public int countBycreateDate(Date createDate);

	/**
	* Returns all the feedbacks where createDate = &#63; and email = &#63;.
	*
	* @param createDate the create date
	* @param email the email
	* @return the matching feedbacks
	*/
	public java.util.List<Feedback> findBycreateDateAndEmail(Date createDate,
		String email);

	/**
	* Returns a range of all the feedbacks where createDate = &#63; and email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createDate the create date
	* @param email the email
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of matching feedbacks
	*/
	public java.util.List<Feedback> findBycreateDateAndEmail(Date createDate,
		String email, int start, int end);

	/**
	* Returns an ordered range of all the feedbacks where createDate = &#63; and email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createDate the create date
	* @param email the email
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findBycreateDateAndEmail(Date createDate,
		String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns an ordered range of all the feedbacks where createDate = &#63; and email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param createDate the create date
	* @param email the email
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching feedbacks
	*/
	public java.util.List<Feedback> findBycreateDateAndEmail(Date createDate,
		String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first feedback in the ordered set where createDate = &#63; and email = &#63;.
	*
	* @param createDate the create date
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findBycreateDateAndEmail_First(Date createDate,
		String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the first feedback in the ordered set where createDate = &#63; and email = &#63;.
	*
	* @param createDate the create date
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchBycreateDateAndEmail_First(Date createDate,
		String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the last feedback in the ordered set where createDate = &#63; and email = &#63;.
	*
	* @param createDate the create date
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback
	* @throws NoSuchFeedbackException if a matching feedback could not be found
	*/
	public Feedback findBycreateDateAndEmail_Last(Date createDate,
		String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Returns the last feedback in the ordered set where createDate = &#63; and email = &#63;.
	*
	* @param createDate the create date
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching feedback, or <code>null</code> if a matching feedback could not be found
	*/
	public Feedback fetchBycreateDateAndEmail_Last(Date createDate,
		String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns the feedbacks before and after the current feedback in the ordered set where createDate = &#63; and email = &#63;.
	*
	* @param feedbackId the primary key of the current feedback
	* @param createDate the create date
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback[] findBycreateDateAndEmail_PrevAndNext(long feedbackId,
		Date createDate, String email,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator)
		throws NoSuchFeedbackException;

	/**
	* Removes all the feedbacks where createDate = &#63; and email = &#63; from the database.
	*
	* @param createDate the create date
	* @param email the email
	*/
	public void removeBycreateDateAndEmail(Date createDate, String email);

	/**
	* Returns the number of feedbacks where createDate = &#63; and email = &#63;.
	*
	* @param createDate the create date
	* @param email the email
	* @return the number of matching feedbacks
	*/
	public int countBycreateDateAndEmail(Date createDate, String email);

	/**
	* Caches the feedback in the entity cache if it is enabled.
	*
	* @param feedback the feedback
	*/
	public void cacheResult(Feedback feedback);

	/**
	* Caches the feedbacks in the entity cache if it is enabled.
	*
	* @param feedbacks the feedbacks
	*/
	public void cacheResult(java.util.List<Feedback> feedbacks);

	/**
	* Creates a new feedback with the primary key. Does not add the feedback to the database.
	*
	* @param feedbackId the primary key for the new feedback
	* @return the new feedback
	*/
	public Feedback create(long feedbackId);

	/**
	* Removes the feedback with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback that was removed
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback remove(long feedbackId) throws NoSuchFeedbackException;

	public Feedback updateImpl(Feedback feedback);

	/**
	* Returns the feedback with the primary key or throws a {@link NoSuchFeedbackException} if it could not be found.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback
	* @throws NoSuchFeedbackException if a feedback with the primary key could not be found
	*/
	public Feedback findByPrimaryKey(long feedbackId)
		throws NoSuchFeedbackException;

	/**
	* Returns the feedback with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param feedbackId the primary key of the feedback
	* @return the feedback, or <code>null</code> if a feedback with the primary key could not be found
	*/
	public Feedback fetchByPrimaryKey(long feedbackId);

	@Override
	public java.util.Map<java.io.Serializable, Feedback> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the feedbacks.
	*
	* @return the feedbacks
	*/
	public java.util.List<Feedback> findAll();

	/**
	* Returns a range of all the feedbacks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @return the range of feedbacks
	*/
	public java.util.List<Feedback> findAll(int start, int end);

	/**
	* Returns an ordered range of all the feedbacks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of feedbacks
	*/
	public java.util.List<Feedback> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator);

	/**
	* Returns an ordered range of all the feedbacks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link FeedbackModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of feedbacks
	* @param end the upper bound of the range of feedbacks (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of feedbacks
	*/
	public java.util.List<Feedback> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Feedback> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the feedbacks from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of feedbacks.
	*
	* @return the number of feedbacks
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}