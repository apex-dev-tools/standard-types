/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

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
