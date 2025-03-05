/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ExternalAuthIdentityProviderInput {
  public IdentityProviderAuthFlow authenticationFlow;
  public IdentityProviderAuthProtocol authenticationProtocol;
  public String authorizeUrl;
  public IdentityProviderClientAuth clientAuthentication;
  public String description;
  public String fullName;
  public String label;
  public List<ExternalAuthIdentityProviderParameterInput> parameters;
  public String standardExternalIdentityProvider;
  public String tokenUrl;
  public String userInfoUrl;

  public ExternalAuthIdentityProviderInput() {throw new java.lang.UnsupportedOperationException();}
}
