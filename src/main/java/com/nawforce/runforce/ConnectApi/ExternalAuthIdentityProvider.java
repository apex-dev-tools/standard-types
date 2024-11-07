/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ExternalAuthIdentityProvider {
  public IdentityProviderAuthFlow authenticationFlow;
  public IdentityProviderAuthProtocol authenticationProtocol;
  public String authorizeUrl;
  public String callbackUrl;
  public String createdByNamespace;
  public List<ExternalAuthIdentityProviderCredential> credentials;
  public String description;
  public String fullName;
  public String id;
  public String label;
  public String tokenUrl;
  public String url;
  public String userInfoUrl;

  public ExternalAuthIdentityProvider() {throw new java.lang.UnsupportedOperationException();}
}
