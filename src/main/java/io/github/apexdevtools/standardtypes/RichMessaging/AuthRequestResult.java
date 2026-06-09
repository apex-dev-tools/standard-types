/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.RichMessaging;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.PageReference;

@SuppressWarnings("unused")
public class AuthRequestResult {
    public Datetime expirationDateTime;
    public PageReference redirectPageReference;
    public AuthRequestResultStatus resultStatus;

    public AuthRequestResult(PageReference redirectPageReference, AuthRequestResultStatus resultStatus, Datetime expirationDateTime) {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
}
