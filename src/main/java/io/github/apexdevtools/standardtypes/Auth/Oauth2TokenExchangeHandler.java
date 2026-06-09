/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Auth;

import io.github.apexdevtools.standardtypes.SObjectStubs.User;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class Oauth2TokenExchangeHandler {
  public User getUserForTokenSubject(Id networkId, TokenValidationResult result, Boolean canCreateUser, String appDeveloperName, IntegratingAppType appType) {throw new java.lang.UnsupportedOperationException();}
  public TokenValidationResult validateIncomingToken(String appDeveloperName, IntegratingAppType appType, String incomingToken, OAuth2TokenExchangeType tokenType) {throw new java.lang.UnsupportedOperationException();}

  public Oauth2TokenExchangeHandler() {throw new java.lang.UnsupportedOperationException();}
}
