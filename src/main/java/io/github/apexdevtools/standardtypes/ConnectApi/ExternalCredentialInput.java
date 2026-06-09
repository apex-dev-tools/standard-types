/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ExternalCredentialInput {
  public CredentialAuthenticationProtocol authenticationProtocol;
  public CredentialAuthenticationProtocolVariant authenticationProtocolVariant;
  public List<CredentialCustomHeaderInput> customHeaders;
  public String developerName;
  public String masterLabel;
  public List<ExternalCredentialParameterInput> parameters;
  public List<ExternalCredentialPrincipalInput> principals;

  public ExternalCredentialInput() {throw new java.lang.UnsupportedOperationException();}
}
