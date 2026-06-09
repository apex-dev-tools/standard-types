/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.RevSalesTrxn;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class PlaceSalesTransactionResponse {
  public Object contextDetails; // undocumented
  public List<Object> errorResponse; // undocumented
  public Boolean isSuccess;
  public String salesTransactionId;
  public String statusUrl;
  public String trackerId;

  public PlaceSalesTransactionResponse() {throw new java.lang.UnsupportedOperationException();}
}
