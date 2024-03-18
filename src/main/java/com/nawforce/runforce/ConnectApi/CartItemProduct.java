/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CartItemProduct {
  public Map<String, String> fields;
  public String name;
  public String productId;
  public PurchaseQuantityRule purchaseQuantityRule;
  public String sku;
  public ProductMedia thumbnailImage;
  public Map<String, CartProductAttribute> variationAttributes;

  public CartItemProduct() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
