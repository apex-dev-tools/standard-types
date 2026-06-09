/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class CompositeCommerceVariationOutputRepresentation {
  public List<ErrorResponse> errors;
  public List<String> productIds;
  public Boolean success;

  public CompositeCommerceVariationOutputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
