/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public abstract class AbstractManagedContentDeliveryDocument {
  public String contentKey;
  public ManagedContentTypeSummary contentType;
  public String language;
  public String managedContentId;
  public Datetime publishedDate;
  public String resourceUrl;
  public String title;
  public String unauthenticatedUrl;
  public String urlName;
}
