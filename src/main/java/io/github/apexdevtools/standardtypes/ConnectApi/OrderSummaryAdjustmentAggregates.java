/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OrderSummaryAdjustmentAggregates {
  public Boolean available;
  public OrderSummaryAdjustmentAggregatesStatus status;
  public String totalDeliveryPromotionDistAmount;
  public String totalDeliveryPromotionLineAmount;
  public String totalDeliveryPromotionTotalAmount;
  public String totalProductPromotionDistAmount;
  public String totalProductPromotionLineAmount;
  public String totalProductPromotionTotalAmount;

  public OrderSummaryAdjustmentAggregates() {throw new java.lang.UnsupportedOperationException();}
}
