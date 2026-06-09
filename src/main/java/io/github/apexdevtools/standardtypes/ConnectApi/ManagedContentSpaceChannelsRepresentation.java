/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentSpaceChannelsRepresentation {
  public String currentPageUrl;
  public String nextPageUrl;
  public String previousPageUrl;
  public List<ManagedContentSpaceChannelRepresentation> spaceChannels;
  public Integer totalSpaceChannels;

  public ManagedContentSpaceChannelsRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
