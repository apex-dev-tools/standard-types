/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.RichMessaging;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.PageReference;

@SuppressWarnings("unused")
public class AuthRequestResult {
    public Datetime expirationDateTime;
    public PageReference redirectPageReference;
    public AuthRequestResultStatus resultStatus;

    public AuthRequestResult(PageReference redirectPageReference, AuthRequestResultStatus resultStatus, Datetime expirationDateTime) {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
}
