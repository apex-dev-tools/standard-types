/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.Auth;

import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public interface HeadlessUserDiscoveryHandler {
  HeadlessUserDiscoveryResponse discoverUserFromLoginHint(Id networkId, String loginHint, VerificationAction verificationAction, String customDataJson, Map<String,String> requestAttributes);
}
