/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.platform.SObjects;

import com.nawforce.platform.Internal.SObjectFields$;
import com.nawforce.platform.Internal.SObjectType$;
import com.nawforce.platform.System.Boolean;
import com.nawforce.platform.System.Integer;
import com.nawforce.platform.System.String;
import com.nawforce.platform.System.*;

@SuppressWarnings("unused")
public class ConnectedApplication extends SObject {
	public static SObjectType$<ConnectedApplication> SObjectType;
	public static SObjectFields$<ConnectedApplication> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MobileSessionTimeout;
	public String MobileStartUrl;
	public String Name;
	public Boolean OptionsAllowAdminApprovedUsersOnly;
	public Boolean OptionsFullContentPushNotifications;
	public Boolean OptionsHasSessionLevelPolicy;
	public Boolean OptionsIsInternal;
	public Boolean OptionsRefreshTokenValidityMetric;
	public String PinLength;
	public Integer RefreshTokenValidityPeriod;
	public String StartUrl;
	public Datetime SystemModstamp;

	public InstalledMobileApp[] InstalledMobileApps;
	public SetupEntityAccess[] SetupEntityAccessItems;
}
