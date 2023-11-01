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
public class ExternalCredential {
    public CredentialAuthenticationProtocol authenticationProtocol;
    public CredentialAuthenticationProtocolVariant authenticationProtocolVariant;
    public CredentialAuthenticationStatus authenticationStatus;
    public String createdByNamespace;
    public List<CredentialCustomHeader> customHeaders;
    public String developerName;
    public String id;
    public String masterLabel;
    public List<ExternalCredentialParameter> parameters;
    public List<ExternalCredentialPrincipal> principals;
    public List<NamedCredential> relatedNamedCredentials;
    public String url;

    public ExternalCredential() {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
    public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
    public Double getBuildVersion() {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
