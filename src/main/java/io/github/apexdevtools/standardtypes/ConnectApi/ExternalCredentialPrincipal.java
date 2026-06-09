/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

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
