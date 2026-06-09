/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.String;

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
