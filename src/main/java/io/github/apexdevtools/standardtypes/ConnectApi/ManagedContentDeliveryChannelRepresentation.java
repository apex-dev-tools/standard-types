/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentDeliveryChannelRepresentation {
  public String domain;
  public String domainName;
  public String id;
  public Boolean isDedicatedContentDelivery;
  public Boolean isDomainLocked;
  public Boolean isSearchable;
  public String name;
  public ManagedContentChannelType type;

  public ManagedContentDeliveryChannelRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
