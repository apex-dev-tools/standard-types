/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class DeliveryAddressInputRepresentation {
  public String city;
  public String country;
  public Double latitude;
  public Double longitude;
  public String postalCode;
  public String state;

  public DeliveryAddressInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
