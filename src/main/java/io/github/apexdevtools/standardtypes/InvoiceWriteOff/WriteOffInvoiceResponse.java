/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.InvoiceWriteOff;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class WriteOffInvoiceResponse {
  public WriteOffInvoiceResponse() {throw new java.lang.UnsupportedOperationException();}
  public WriteOffInvoiceResponse(WriteOffInvoiceResponseError errors, String invoiceId, String requestIdentifier, Boolean success) {throw new java.lang.UnsupportedOperationException();}

  public WriteOffInvoiceResponseError errors;
  public String invoiceId;
  public String requestIdentifier;
  public Boolean success;
}
