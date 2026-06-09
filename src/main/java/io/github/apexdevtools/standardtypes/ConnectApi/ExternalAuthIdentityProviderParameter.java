/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ExternalAuthIdentityProviderParameter {
  public String parameterName;
  public ExternalAuthIdentityProviderParameterType parameterType;
  public String parameterValue;
  public Integer sequenceNumber;

  public ExternalAuthIdentityProviderParameter() {throw new java.lang.UnsupportedOperationException();}
}
