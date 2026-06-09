/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentChannelUpdateRepresentation {
  public Long cacheControlMaxAge;
  public String domain;
  public Boolean isDedicatedContentDelivery;
  public Boolean isDomainLocked;
  public Boolean isSearchable;
  public Long mediaCacheControlMaxAge;
  public String name;
  public String targetId;

  public ManagedContentChannelUpdateRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
