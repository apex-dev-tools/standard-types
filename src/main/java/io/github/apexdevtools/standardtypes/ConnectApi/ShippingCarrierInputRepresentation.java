/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ShippingCarrierInputRepresentation {
  public String externalReference;
  public List<ShippingCarrierMethodInputRepresentation> shippingCarrierMethods;

  public ShippingCarrierInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
