/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentChannelCollection {
  public List<ManagedContentChannel> channels;
  public String currentPageUrl;
  public String nextPageUrl;
  public String previousPageUrl;
  public Integer totalChannels;

  public ManagedContentChannelCollection() {throw new java.lang.UnsupportedOperationException();}
}
