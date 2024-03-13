/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CartItemCollection {
  public CartCouponCollection cartCoupons;
  public CartItemResult cartItems;
  public CartPromotionCollection cartPromotions;
  public CartSummary cartSummary;
  public Integer currentPage;
  public String currentPageToken;
  public String currentPageUrl;
  public Boolean hasErrors;
  public String nextPageToken;
  public String nextPageUrl;
  public String previousPageToken;
  public String previousPageUrl;
  public Integer totalItemCount;
  public Integer totalNumberOfPages;

  public CartItemCollection() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
