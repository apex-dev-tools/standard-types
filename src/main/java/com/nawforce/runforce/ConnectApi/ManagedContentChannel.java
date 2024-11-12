/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;

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
  public Boolean isDomainLocked;
  public Boolean isSearchable;
  public ManagedContentChannelDomainRepresentation managedContentChannelDomain;
  public Long mediaCacheControlMaxAge;
  public String name;
  public String targetId;
  public ManagedContentChannelType type;

  public ManagedContentChannel() {throw new java.lang.UnsupportedOperationException();}
}
