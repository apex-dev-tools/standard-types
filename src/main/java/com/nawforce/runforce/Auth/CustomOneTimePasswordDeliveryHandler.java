/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.Auth;

import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public interface CustomOneTimePasswordDeliveryHandler {
  CustomOneTimePasswordDeliveryResult sendOneTimePassword(Id userId, String phoneNumber, String oneTimePassword, String defaultText, Id networkId, String experienceId);
}
