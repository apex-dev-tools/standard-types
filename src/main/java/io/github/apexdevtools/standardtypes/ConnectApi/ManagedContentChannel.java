/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Long;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentChannel extends AbstractManagedContentChannelRepresentation {
  public Long cacheControlMaxAge;
  public String channelId;
  public String channelName;
  public ManagedContentChannelType channelType;
  public String domain;
  public String domainId;
  public String domainName;
  public String id;
  public Boolean isChannelSearchable;
  public Boolean isDedicatedContentDelivery;
  public Boolean isDomainLocked;
  public Boolean isSearchable;
  public ManagedContentChannelDomainRepresentation managedContentChannelDomain;
  public Long mediaCacheControlMaxAge;
  public String name;
  public String targetId;
  public ManagedContentChannelType type;

  public ManagedContentChannel() {throw new java.lang.UnsupportedOperationException();}
}
