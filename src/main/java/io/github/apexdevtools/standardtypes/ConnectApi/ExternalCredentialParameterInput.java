/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ExternalCredentialParameterInput {
  public String id;
  public String parameterDescription;
  public String parameterName;
  public ExternalCredentialParameterType parameterType;
  public String parameterValue;

  public ExternalCredentialParameterInput() {throw new java.lang.UnsupportedOperationException();}
}
