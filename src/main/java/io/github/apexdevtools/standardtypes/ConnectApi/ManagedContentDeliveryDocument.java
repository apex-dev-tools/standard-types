/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentDeliveryDocument extends AbstractManagedContentDeliveryDocument {
  public ManagedContentChannelSummary channelInfo;
  public ManagedContentDeliveryChannelSummaryRepresentation channelSummary;
  public Map<String, Object> contentBody;
  public String contentKey;
  public ManagedContentTypeSummary contentType;
  public String language;
  public String managedContentId;
  public Datetime publishedDate;
  public Map<String, AbstractManagedContentReference> references;
  public List<AbstractManagedContentReference> referencesList;
  public String title;
  public String unauthenticatedUrl;
  public String urlName;

  public ManagedContentDeliveryDocument() {throw new java.lang.UnsupportedOperationException();}
}
