/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public enum CredentialAuthenticationStatus {
    Configured,
    NotConfigured,
    Unknown;

    public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public Integer ordinal$() {throw new java.lang.UnsupportedOperationException();}

    public CredentialAuthenticationStatus valueOf(String str) {throw new java.lang.UnsupportedOperationException();}
    public List<CredentialAuthenticationStatus> values$() {throw new java.lang.UnsupportedOperationException();}
}
