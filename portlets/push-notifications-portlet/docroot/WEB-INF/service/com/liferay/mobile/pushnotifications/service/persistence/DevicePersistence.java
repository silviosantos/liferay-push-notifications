/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.mobile.pushnotifications.service.persistence;

import com.liferay.mobile.pushnotifications.model.Device;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the device service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Silvio Santos
 * @see DevicePersistenceImpl
 * @see DeviceUtil
 * @generated
 */
public interface DevicePersistence extends BasePersistence<Device> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DeviceUtil} to access the device persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the devices where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.mobile.pushnotifications.model.Device> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the devices where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mobile.pushnotifications.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.mobile.pushnotifications.model.Device> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the devices where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mobile.pushnotifications.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.mobile.pushnotifications.model.Device> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first device in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device
	* @throws com.liferay.mobile.pushnotifications.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.mobile.pushnotifications.NoSuchDeviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first device in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last device in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device
	* @throws com.liferay.mobile.pushnotifications.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.mobile.pushnotifications.NoSuchDeviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last device in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the devices before and after the current device in the ordered set where userId = &#63;.
	*
	* @param deviceId the primary key of the current device
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next device
	* @throws com.liferay.mobile.pushnotifications.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device[] findByUserId_PrevAndNext(
		long deviceId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.mobile.pushnotifications.NoSuchDeviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the devices where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of devices where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the device where token = &#63; or throws a {@link com.liferay.mobile.pushnotifications.NoSuchDeviceException} if it could not be found.
	*
	* @param token the token
	* @return the matching device
	* @throws com.liferay.mobile.pushnotifications.NoSuchDeviceException if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device findByToken(
		java.lang.String token)
		throws com.liferay.mobile.pushnotifications.NoSuchDeviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the device where token = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param token the token
	* @return the matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device fetchByToken(
		java.lang.String token)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the device where token = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param token the token
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching device, or <code>null</code> if a matching device could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device fetchByToken(
		java.lang.String token, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the device where token = &#63; from the database.
	*
	* @param token the token
	* @return the device that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device removeByToken(
		java.lang.String token)
		throws com.liferay.mobile.pushnotifications.NoSuchDeviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of devices where token = &#63;.
	*
	* @param token the token
	* @return the number of matching devices
	* @throws SystemException if a system exception occurred
	*/
	public int countByToken(java.lang.String token)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the device in the entity cache if it is enabled.
	*
	* @param device the device
	*/
	public void cacheResult(
		com.liferay.mobile.pushnotifications.model.Device device);

	/**
	* Caches the devices in the entity cache if it is enabled.
	*
	* @param devices the devices
	*/
	public void cacheResult(
		java.util.List<com.liferay.mobile.pushnotifications.model.Device> devices);

	/**
	* Creates a new device with the primary key. Does not add the device to the database.
	*
	* @param deviceId the primary key for the new device
	* @return the new device
	*/
	public com.liferay.mobile.pushnotifications.model.Device create(
		long deviceId);

	/**
	* Removes the device with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param deviceId the primary key of the device
	* @return the device that was removed
	* @throws com.liferay.mobile.pushnotifications.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device remove(
		long deviceId)
		throws com.liferay.mobile.pushnotifications.NoSuchDeviceException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.mobile.pushnotifications.model.Device updateImpl(
		com.liferay.mobile.pushnotifications.model.Device device)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the device with the primary key or throws a {@link com.liferay.mobile.pushnotifications.NoSuchDeviceException} if it could not be found.
	*
	* @param deviceId the primary key of the device
	* @return the device
	* @throws com.liferay.mobile.pushnotifications.NoSuchDeviceException if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device findByPrimaryKey(
		long deviceId)
		throws com.liferay.mobile.pushnotifications.NoSuchDeviceException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the device with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param deviceId the primary key of the device
	* @return the device, or <code>null</code> if a device with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.mobile.pushnotifications.model.Device fetchByPrimaryKey(
		long deviceId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the devices.
	*
	* @return the devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.mobile.pushnotifications.model.Device> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mobile.pushnotifications.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @return the range of devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.mobile.pushnotifications.model.Device> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the devices.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.mobile.pushnotifications.model.impl.DeviceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devices
	* @param end the upper bound of the range of devices (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of devices
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.mobile.pushnotifications.model.Device> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the devices from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of devices.
	*
	* @return the number of devices
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}