/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ProductVariationInfo {
  public List<ProductAttributesToProductEntry> attributesToProductMappings;
  public Map<String, ProductAttributeInfo> variationAttributeInfo;

  public ProductVariationInfo() {throw new java.lang.UnsupportedOperationException();}
}
