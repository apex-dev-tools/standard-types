/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public abstract class AbstractCartItem {
  public BillingFrequency billingFrequency;
  public String cartDeliveryGroupId;
  public String cartId;
  public String cartItemId;
  public List<SObject> customFields;
  public CartMessagesSummary messagesSummary;
  public String name;
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
