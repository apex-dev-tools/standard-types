/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.Auth;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Id;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ExternalClientAppOauthHandler {

  public ExternalClientAppOauthHandler() {throw new java.lang.UnsupportedOperationException();}

  public Boolean authorize(Id userId, Id ecAppId, Boolean isAdminApproved, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
  public Map<String,String> customAttributes(Id userId, Id ecAppId, Map<String,String> formulaDefinedAttributes, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
  public void refresh(Id userId, Id ecAppId, InvocationContext context) {throw new java.lang.UnsupportedOperationException();}
}
