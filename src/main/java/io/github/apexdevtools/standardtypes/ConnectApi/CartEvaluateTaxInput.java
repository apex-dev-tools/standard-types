/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class CartEvaluateTaxInput {
  public List<SObject> customFields;
  public CartShippingAddressInput shippingAddress;

  public CartEvaluateTaxInput() {throw new java.lang.UnsupportedOperationException();}
}
