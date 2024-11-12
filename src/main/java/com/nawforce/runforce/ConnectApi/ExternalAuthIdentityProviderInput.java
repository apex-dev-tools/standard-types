/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ExternalAuthIdentityProviderInput {
  public IdentityProviderAuthFlow authenticationFlow;
  public IdentityProviderAuthProtocol authenticationProtocol;
  public String authorizeUrl;
  public String description;
  public String fullName;
  public String label;
  public String tokenUrl;
  public String userInfoUrl;

  public ExternalAuthIdentityProviderInput() {throw new java.lang.UnsupportedOperationException();}
}
