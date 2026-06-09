/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ExternalCredentialPrincipalInput {
  public String id;
  public List<ExternalCredentialParameterInput> parameters;
  public String principalName;
  public CredentialPrincipalType principalType;
  public Integer sequenceNumber;

  public ExternalCredentialPrincipalInput() {throw new java.lang.UnsupportedOperationException();}
}
