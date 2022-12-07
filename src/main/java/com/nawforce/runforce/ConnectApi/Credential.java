/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Credential {
    public CredentialAuthenticationProtocol authenticationProtocol;
    public CredentialAuthenticationStatus authenticationStatus;
    public Map<String, CredentialValue> credentials;
    public String externalCredential;
    public String principalName;
    public CredentialPrincipalType principalType;

    public Credential() {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
    public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
    public Double getBuildVersion() {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
