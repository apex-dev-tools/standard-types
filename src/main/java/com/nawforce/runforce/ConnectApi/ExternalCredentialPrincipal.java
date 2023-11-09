/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ExternalCredentialPrincipal {
    public CredentialAuthenticationStatus authenticationStatus;
    public String id;
    public List<ExternalCredentialParameter> parameters;
    public List<ExternalCredentialPrincipalAccess> principalAccess;
    public String principalName;
    public CredentialPrincipalType principalType;
    public Integer sequenceNumber;

    public ExternalCredentialPrincipal() {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
    public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
    public Double getBuildVersion() {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
