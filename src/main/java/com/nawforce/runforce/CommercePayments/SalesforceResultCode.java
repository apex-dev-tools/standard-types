/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_enum_commercepayments_SalesforceResultCode.htm
@SuppressWarnings("unused")
public enum SalesforceResultCode {
  Decline,
  Indeterminate,
  PermanentFail,
  RequiresReview,
  Success,
  SystemError,
  ValidationError
}
