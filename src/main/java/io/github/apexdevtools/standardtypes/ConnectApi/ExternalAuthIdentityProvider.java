/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ExternalAuthIdentityProvider {
  public IdentityProviderAuthFlow authenticationFlow;
  public IdentityProviderAuthProtocol authenticationProtocol;
  public String authorizeUrl;
  public String callbackUrl;
  public IdentityProviderClientAuth clientAuthentication;
  public String createdByNamespace;
  public List<ExternalAuthIdentityProviderCredential> credentials;
  public String description;
  public String fullName;
  public String id;
  public String label;
  public List<ExternalAuthIdentityProviderParameter> parameters;
  public String standardExternalIdentityProvider;
  public String tokenUrl;
  public String url;
  public String userInfoUrl;

  public ExternalAuthIdentityProvider() {throw new java.lang.UnsupportedOperationException();}
}
