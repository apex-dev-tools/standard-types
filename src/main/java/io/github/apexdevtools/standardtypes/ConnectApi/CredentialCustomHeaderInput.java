/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class CredentialCustomHeaderInput {
  public String headerName;
  public String headerValue;
  public String id;
  public Integer sequenceNumber;

  public CredentialCustomHeaderInput() {throw new java.lang.UnsupportedOperationException();}
}
