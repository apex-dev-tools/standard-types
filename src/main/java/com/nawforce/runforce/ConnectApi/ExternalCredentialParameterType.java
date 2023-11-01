/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

@SuppressWarnings("unused")
public enum ExternalCredentialParameterType {
  AuthParameter,
  AuthProvider,
  AuthProviderUrl,
  AuthProviderUrlQueryParameter,
  JwtBodyClaim,
  JwtHeaderClaim,
  SigningCertificate
}