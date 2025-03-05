/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ManagedContentCollectionItems {
  public ManagedContentChannelSummary channelInfo;
  public ManagedContentDeliveryChannelSummaryRepresentation channelSummary;
  public String collectionKey;
  public ManagedContentTypeSummary collectionType;
  public String currentPageUrl;
  public String id;
  public List<ManagedContentCollectionItem> items;
  public String language;
  public String nextPageUrl;
  public String previousPageUrl;
  public Datetime publishedDate;
  public String title;
  public Integer total;
  public String urlName;

  public ManagedContentCollectionItems() {throw new java.lang.UnsupportedOperationException();}
}
