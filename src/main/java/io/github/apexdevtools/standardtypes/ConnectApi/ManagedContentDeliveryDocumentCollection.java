/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentDeliveryDocumentCollection {
  public ManagedContentChannelSummary channelInfo;
  public ManagedContentDeliveryChannelSummaryRepresentation channelSummary;
  public List<AbstractManagedContentDeliveryDocument> contents;
  public String currentPageUrl;
  public String nextPageUrl;
  public String previousPageUrl;
  public Map<String, AbstractManagedContentReference> references;
  public List<AbstractManagedContentReference> referencesList;

  public ManagedContentDeliveryDocumentCollection() {throw new java.lang.UnsupportedOperationException();}
}
