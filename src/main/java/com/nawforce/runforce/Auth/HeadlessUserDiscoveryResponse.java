/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.Auth;

import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.Set;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class HeadlessUserDiscoveryResponse {
  public String customErrorMessage;
  public Set<Id> userIds;

  public HeadlessUserDiscoveryResponse(Set<Id> userIds, String customErrorMessage) {throw new UnsupportedOperationException();}
}
