/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Auth;

import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.Set;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class HeadlessUserDiscoveryResponse {
  public String customErrorMessage;
  public Set<Id> userIds;

  public HeadlessUserDiscoveryResponse(Set<Id> userIds, String customErrorMessage) {throw new UnsupportedOperationException();}
}
