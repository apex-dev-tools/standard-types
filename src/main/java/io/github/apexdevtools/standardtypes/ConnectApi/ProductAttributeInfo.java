/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ProductAttributeInfo {
  public List<String> allowableValues;
  public String apiName;
  public List<String> availableValues;
  public String fieldEnumOrId;
  public String label;
  public String objectName;
  public List<ProductAttributeValueMetadataRepresentation> options;
  public Integer sequence;
  public ProductAttributeViewType viewType;

  public ProductAttributeInfo() {throw new java.lang.UnsupportedOperationException();}
}
