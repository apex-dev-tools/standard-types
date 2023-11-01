/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class NamedCredentials {
    public static Credential createCredential(CredentialInput requestBody) {throw new java.lang.UnsupportedOperationException();}
    public static Credential createCredential(CredentialInput requestBody, CreateCredentialAction action) {throw new java.lang.UnsupportedOperationException();}
    public static ExternalCredential createExternalCredential(ExternalCredentialInput requestBody) {throw new java.lang.UnsupportedOperationException();}
    public static NamedCredential createNamedCredential(NamedCredentialInput requestBody) {throw new java.lang.UnsupportedOperationException();}
    public static void deleteCredential(String externalCredential, String principalName, CredentialPrincipalType principalType) {throw new java.lang.UnsupportedOperationException();}
    public static void deleteCredential(String externalCredential, String principalName, CredentialPrincipalType principalType, List<String> authenticationParameters) {throw new java.lang.UnsupportedOperationException();}
    public static Credential getCredential(String externalCredential, String principalName, CredentialPrincipalType principalType) {throw new java.lang.UnsupportedOperationException();}
    public static ExternalCredential getExternalCredential(String developerName) {throw new java.lang.UnsupportedOperationException();}
    public static ExternalCredentialList getExternalCredentials() {throw new java.lang.UnsupportedOperationException();}
    public static NamedCredential getNamedCredential(String developerName) {throw new java.lang.UnsupportedOperationException();}
    public static NamedCredentialList getNamedCredentials() {throw new java.lang.UnsupportedOperationException();}
    public static OAuthCredentialAuthUrl getOAuthCredentialAuthUrl(OAuthCredentialAuthUrlInput requestBody) {throw new java.lang.UnsupportedOperationException();}
    public static Credential patchCredential(CredentialInput requestBody) {throw new java.lang.UnsupportedOperationException();}
    public static Credential updateCredential(CredentialInput requestBody) {throw new java.lang.UnsupportedOperationException();}
}
