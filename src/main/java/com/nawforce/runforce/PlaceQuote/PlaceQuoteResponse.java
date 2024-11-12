/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.PlaceQuote;

import com.nawforce.runforce.ConnectApi.ErrorResponse;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class PlaceQuoteResponse {
  public String quoteId;
  public String requestIdentifier;
  public List<ErrorResponse> responseError;
  public String statusURL;
  public Boolean success;

  public PlaceQuoteResponse() {throw new java.lang.UnsupportedOperationException();}
}
