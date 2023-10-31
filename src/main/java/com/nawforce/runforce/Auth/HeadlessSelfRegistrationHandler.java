/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.Auth;

import com.nawforce.runforce.SObjectStubs.User;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public interface HeadlessSelfRegistrationHandler {
  User createUser(Id profileId, UserData data, String customUserDataMap, String experienceId, String password);
}
