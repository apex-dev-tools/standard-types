/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_enum_commercepayments_RequestType.htm
@SuppressWarnings("unused")
public enum RequestType {
  Authorize,
  AuthorizationReversal,
  Capture,
  PostAuth,
  ReferencedRefund,
  Sale,
  Tokenize
}
