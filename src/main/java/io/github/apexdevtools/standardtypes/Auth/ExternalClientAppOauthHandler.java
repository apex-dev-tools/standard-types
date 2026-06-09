/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Auth;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Id;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ExternalClientAppOauthHandler {

  public ExternalClientAppOauthHandler() {throw new java.lang.UnsupportedOperationException();}

  public Boolean authorize(Id userId, Id ecAppId, Boolean isAdminApproved, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
  public Map<String,String> customAttributes(Id userId, Id ecAppId, Map<String,String> formulaDefinedAttributes, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
  public void refresh(Id userId, Id ecAppId, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
}
