/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Auth;

@SuppressWarnings("unused")
public enum CustomOneTimePasswordDeliveryResult {
  COUNTRY_BLOCK,
  EXCEPTION,
  INVALID_PHONE_NUMBER,
  MESSAGE_LIMIT_EXCEEDED,
  PROVIDER_ERROR,
  SUCCESS
}
