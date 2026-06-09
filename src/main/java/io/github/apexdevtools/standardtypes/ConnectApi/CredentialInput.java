/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

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
