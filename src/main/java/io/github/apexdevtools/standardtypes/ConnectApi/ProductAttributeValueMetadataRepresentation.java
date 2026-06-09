/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

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
