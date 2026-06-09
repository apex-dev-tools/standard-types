/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ProductAttributesToProductEntry {
  public String canonicalKey;
  public String productId;
  public List<ProductAttributeSelectionInfo> selectedAttributes;
  public String urlName;

  public ProductAttributesToProductEntry() {throw new java.lang.UnsupportedOperationException();}
}
