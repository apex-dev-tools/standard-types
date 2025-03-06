/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class EstimateDeliveryDateInputRepresentation {
  public DeliveryAddressInputRepresentation deliveryAddress;
  public String locations;
  public DeliveryEstimationProductInputRepresentation products;
  public ShippingCarrierInputRepresentation shippingCarrier;

  public EstimateDeliveryDateInputRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
