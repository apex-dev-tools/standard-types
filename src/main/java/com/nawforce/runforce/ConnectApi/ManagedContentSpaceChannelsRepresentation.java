/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ManagedContentSpaceChannelsRepresentation {
  public String currentPageUrl;
  public String nextPageUrl;
  public String previousPageUrl;
  public List<ManagedContentSpaceChannelRepresentation> spaceChannels;
  public Integer totalSpaceChannels;

  public ManagedContentSpaceChannelsRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
