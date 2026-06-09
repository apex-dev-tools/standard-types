/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ExternalAuthIdentityProviderCredential {
  public String credentialName;
  public String credentialValue;
  public Boolean encrypted;

  public ExternalAuthIdentityProviderCredential() {throw new java.lang.UnsupportedOperationException();}
}
