/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class NamedCredentialInput {
  public NamedCredentialCalloutOptionsInput calloutOptions;
  public String calloutUrl;
  public List<CredentialCustomHeaderInput> customHeaders;
  public String description;
  public String developerName;
  public List<ExternalCredentialInput> externalCredentials;
  public String masterLabel;
  public NetworkConnectionInput networkConnection;
  public List<NamedCredentialParameterInput> parameters;
  public NamedCredentialType type;

  public NamedCredentialInput() {throw new java.lang.UnsupportedOperationException();}
}
