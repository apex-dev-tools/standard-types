/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class NamedCredential {
    public NamedCredentialCalloutOptions calloutOptions;
    public CalloutStatus calloutStatus;
    public String calloutUrl;
    public String createdByNamespace;
    public List<CredentialCustomHeader> customHeaders;
    public String description;
    public String developerName;
    public List<ExternalCredential> externalCredentials;
    public String id;
    public String masterLabel;
    public NetworkConnection networkConnection;
    public List<NamedCredentialParameter> parameters;
    public NamedCredentialType type;
    public String url;

    public NamedCredential() {throw new java.lang.UnsupportedOperationException();}
}
