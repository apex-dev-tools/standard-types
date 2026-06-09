/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.SObject;

@SuppressWarnings("unused")
public class CartEvaluateShippingInput {
  public List<SObject> customFields;
  public CartShippingAddressInput shippingAddress;

  public CartEvaluateShippingInput() {throw new java.lang.UnsupportedOperationException();}

}
