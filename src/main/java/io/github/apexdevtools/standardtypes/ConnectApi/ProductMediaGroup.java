/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ProductMediaGroup {
  public String developerName;
  public String id;
  public List<ProductMedia> mediaItems;
  public String name;
  public ProductMediaUsageType usageType;

  public ProductMediaGroup() {throw new java.lang.UnsupportedOperationException();}
}
