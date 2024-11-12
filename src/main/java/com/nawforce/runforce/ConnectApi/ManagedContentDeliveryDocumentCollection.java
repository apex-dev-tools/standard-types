/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

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
