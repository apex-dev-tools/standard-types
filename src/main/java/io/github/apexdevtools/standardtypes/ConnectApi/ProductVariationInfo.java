/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ProductVariationInfo {
  public List<ProductAttributesToProductEntry> attributesToProductMappings;
  public Map<String, ProductAttributeInfo> variationAttributeInfo;

  public ProductVariationInfo() {throw new java.lang.UnsupportedOperationException();}
}
