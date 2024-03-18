/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.Auth;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class TokenValidationResult {
  public String customErrorMsg;
  public Object data;
  public Boolean isValid;
  public String token;
  public OAuth2TokenExchangeType tokenType;
  public UserData userData;

  public String getCustomErrorMessage() {throw new java.lang.UnsupportedOperationException();}
  public Object getData() {throw new java.lang.UnsupportedOperationException();}
  public String getToken() {throw new java.lang.UnsupportedOperationException();}
  public OAuth2TokenExchangeType getTokenType() {throw new java.lang.UnsupportedOperationException();}
  public UserData getUserData() {throw new java.lang.UnsupportedOperationException();}
  public Boolean isValid() {throw new java.lang.UnsupportedOperationException();}

  public TokenValidationResult() {throw new java.lang.UnsupportedOperationException();}
  public TokenValidationResult(Boolean isValid, Object data, UserData userData, String token, OAuth2TokenExchangeType tokenType, String customErrorMsg) {throw new java.lang.UnsupportedOperationException();}
  public TokenValidationResult(Boolean valid) {throw new java.lang.UnsupportedOperationException();}
}
