/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.*;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public abstract class AbstractCartItem {
  public String currencyIsoCode;
  public BillingFrequency billingFrequency;
  public String cartDeliveryGroupId;
  public String cartId;
  public String cartItemId;
  public Integer childProductCount;
  public List<SObject> customFields;
  public CartMessagesSummary messagesSummary;
  public String name;
  public String parentCartItemId;
  public CartItemProduct productDetails;
  public String productId;
  public String productSelling;
  public String quantity;
  public SellingModelType sellingModelType;
  public String subscriptionTerm;
  public CartItemType type;

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
