/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public enum CredentialPrincipalType {
    AwsStsPrincipal,
    NamedPrincipal,
    PerUserPrincipal;

    public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public Integer ordinal$() {throw new java.lang.UnsupportedOperationException();}

    public CredentialAuthenticationStatus valueOf(String str) {throw new java.lang.UnsupportedOperationException();}
    public List<CredentialAuthenticationStatus> values$() {throw new java.lang.UnsupportedOperationException();}
}
