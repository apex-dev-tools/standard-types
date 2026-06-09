/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Auth;

import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public interface CustomOneTimePasswordDeliveryHandler {
  CustomOneTimePasswordDeliveryResult sendOneTimePassword(Id userId, String phoneNumber, String oneTimePassword, String defaultText, Id networkId, String experienceId);
}
