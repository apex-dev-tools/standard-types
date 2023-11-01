/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public enum CredentialAuthenticationProtocol {
    AwsSv4,
    Custom,
    Jwt,
    OAuth;

    public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public Integer ordinal$() {throw new java.lang.UnsupportedOperationException();}

    public CredentialAuthenticationProtocol valueOf(String str) {throw new java.lang.UnsupportedOperationException();}
    public List<CredentialAuthenticationProtocol> values$() {throw new java.lang.UnsupportedOperationException();}
}
