/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
