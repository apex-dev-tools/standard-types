/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ManagedContentChannelCreateRepresentation {
  public Long cacheControlMaxAge;
  public String domain;
  public Boolean isDedicatedContentDelivery;
  public Boolean isDomainLocked;
  public Boolean isSearchable;
  public Long mediaCacheControlMaxAge;
  public String name;
  public String targetId;
  public ManagedContentChannelType type;

  public ManagedContentChannelCreateRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
