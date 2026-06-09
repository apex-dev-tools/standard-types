/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ProductAttributeSetInfo {
  public Map<String, ProductAttributeInfo> attributeInfo;
  public String description;
  public String developerName;
  public String id;
  public String masterLabel;
  public Integer sequence;

  public ProductAttributeSetInfo() {throw new java.lang.UnsupportedOperationException();}
}
