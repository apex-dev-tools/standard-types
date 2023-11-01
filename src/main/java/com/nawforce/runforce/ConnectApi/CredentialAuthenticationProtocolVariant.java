/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

@SuppressWarnings("unused")
public enum CredentialAuthenticationProtocolVariant {
  AwsSv4_STS,
  ClientCredentialsClientSecret,
  ClientCredentialsJwtAssertion,
  JwtBearer,
  NoAuthentication,
  RolesAnywhere
}
