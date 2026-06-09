/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ProductSellingModel {
  public String description;
  public String displayName;
  public String id;
  public String name;
  public Integer pricingTerm;
  public PricingTermUnit pricingTermUnit;
  public SellingModelType sellingModelType;
  public SubscriptionTermRule subscriptionTermRule;

  public ProductSellingModel() {throw new java.lang.UnsupportedOperationException();}
}
