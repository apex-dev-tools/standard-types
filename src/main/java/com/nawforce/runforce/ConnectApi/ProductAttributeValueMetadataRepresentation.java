/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ProductAttributeValueMetadataRepresentation {
  public OrderSummaryAdjustmentAggregates adjustmentAggregates;
  public Datetime createdDate;
  public Map<String, RecordField> fields;
  public String orderNumber;
  public String orderSummaryId;
  public Datetime orderedDate;
  public String ownerId;
  public String status;
  public String totalAmount;

  public ProductAttributeValueMetadataRepresentation() {throw new java.lang.UnsupportedOperationException();}
}
