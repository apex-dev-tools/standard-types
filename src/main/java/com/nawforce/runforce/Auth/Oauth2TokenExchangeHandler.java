/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.Auth;

import com.nawforce.runforce.SObjectStubs.User;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Oauth2TokenExchangeHandler {
  public User getUserForTokenSubject(Id networkId, TokenValidationResult result, Boolean canCreateUser, String appDeveloperName, IntegratingAppType appType) {throw new java.lang.UnsupportedOperationException();}
  public TokenValidationResult validateIncomingToken(String appDeveloperName, IntegratingAppType appType, String incomingToken, OAuth2TokenExchangeType tokenType) {throw new java.lang.UnsupportedOperationException();}

  public Oauth2TokenExchangeHandler() {throw new java.lang.UnsupportedOperationException();}
}
