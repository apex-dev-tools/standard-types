/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Datetime;

@SuppressWarnings("unused")
public class ManagedContentSpaceChannelRepresentation {
  public ManagedContentChannelSummary channelSummary;
  public ManagedContentUserSummary createdBy;
  public Datetime createdDate;
  public ManagedContentSpaceChannelStatus status;

  public ManagedContentSpaceChannelRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
