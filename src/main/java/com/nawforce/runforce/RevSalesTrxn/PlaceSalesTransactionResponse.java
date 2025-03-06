/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.RevSalesTrxn;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
