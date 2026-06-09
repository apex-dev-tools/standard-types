/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class CompositeCommerceProductInputRepresentation {
  public ProductAttributeSetInputRepresentation attributeSetInfo;
  public List<String> categoryIds;
  public Map<String, String> productFields;
  public ProductMedia productMedia;

  public CompositeCommerceProductInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
