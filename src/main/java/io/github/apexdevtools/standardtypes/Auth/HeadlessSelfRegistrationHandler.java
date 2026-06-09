/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Auth;

import io.github.apexdevtools.standardtypes.SObjectStubs.User;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public interface HeadlessSelfRegistrationHandler {
  User createUser(Id profileId, UserData data, String customUserDataMap, String experienceId, String password);
}
