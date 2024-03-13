/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class PreserveCart {
  public String cartId;
  public String currencyIsoCode;
  public List<CartItemBasicResult> failedCartItems;
  public Integer numberOfProducts;
  public Integer numberOfProductsWithError;
  public Integer numberOfProductsWithSuccess;
  public List<CartItemBasicResult> succeededCartItems;

  public PreserveCart() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
