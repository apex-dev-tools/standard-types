/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Auth;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class JWTUtil {
  public static JWT parseJWTFromStringWithoutValidation(String incomingJWT) {throw new java.lang.UnsupportedOperationException();}
  public static JWT validateJWTWithCert(String incomingJWT, String certDeveloperName) {throw new java.lang.UnsupportedOperationException();}
  public static JWT validateJWTWithKey(String incomingJWT, String publicKey) {throw new java.lang.UnsupportedOperationException();}
  public static JWT validateJWTWithKeysEndpoint(String incomingJWT, String keysEndpoint, Boolean shouldUseCache) {throw new java.lang.UnsupportedOperationException();}
}
