/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommerceOrders;

import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class RecordWithReferenceRequest {
  public RecordResource record;
  public String referenceId;

  public RecordWithReferenceRequest() {throw new java.lang.UnsupportedOperationException();}
  public RecordWithReferenceRequest(String referenceId, RecordResource record) {throw new UnsupportedOperationException();}
}
