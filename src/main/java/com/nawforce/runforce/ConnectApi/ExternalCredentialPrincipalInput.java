/*
 * Copyright (c) 2023 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ExternalCredentialPrincipalInput {
  public String id;
  public List<ExternalCredentialParameterInput> parameters;
  public String principalName;
  public CredentialPrincipalType principalType;
  public Integer sequenceNumber;

  public ExternalCredentialPrincipalInput() {throw new java.lang.UnsupportedOperationException();}
}
