/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommerceOrders;

import io.github.apexdevtools.standardtypes.ConnectApi.ErrorResponse;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class PlaceOrderResult {
  public String orderId;
  public String requestIdentifier;
  public List<ErrorResponse> responseError;
  public String statusURL;
  public Boolean success;

  public PlaceOrderResult() {throw new java.lang.UnsupportedOperationException();}
}
