/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CredentialInput {
    public CredentialAuthenticationProtocol authenticationProtocol;
    public CredentialAuthenticationProtocolVariant authenticationProtocolVariant;
    public Map<String, CredentialValueInput> credentials;
    public String externalCredential;
    public String principalName;
    public CredentialPrincipalType principalType;

    public CredentialInput() {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
    public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
