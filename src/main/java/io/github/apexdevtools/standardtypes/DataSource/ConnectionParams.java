/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.DataSource;

import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ConnectionParams {
  public String certificateName;
  public String endpoint;
  public String oauthToken;
  public String password;
  public IdentityType principalType;
  public AuthenticationProtocol protocol;
  public String repository;
  public String username;

  public ConnectionParams() {throw new java.lang.UnsupportedOperationException();}
}
