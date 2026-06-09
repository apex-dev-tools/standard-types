/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Auth;

import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public interface HeadlessUserDiscoveryHandler {
  HeadlessUserDiscoveryResponse discoverUserFromLoginHint(Id networkId, String loginHint, VerificationAction verificationAction, String customDataJson, Map<String,String> requestAttributes);
}
