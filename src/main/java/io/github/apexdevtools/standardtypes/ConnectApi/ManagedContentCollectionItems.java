/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

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
