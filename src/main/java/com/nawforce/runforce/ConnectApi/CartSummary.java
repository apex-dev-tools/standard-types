/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CartSummary {
  public String accountId;
  public String asyncOperationStatus;
  public String cartId;
  public String currencyIsoCode;
  public String firstPymtGrandTotalAmount;
  public String firstPymtTotalTaxAmount;
  public String grandTotalAmount;
  public Boolean isSecondary;
  public String name;
  public String ownerId;
  public String ownerOrderId;
  public String purchaseOrderNumber;
  public CartStatus status;
  public String taxType;
  public String totalChargeAmount;
  public String totalListPrice;
  public String totalProductAmount;
  public String totalProductAmountAfterAdjustments;
  public String totalProductCount;
  public Integer totalProductLineItemCount;
  public String totalProductListAmount;
  public String totalPromotionalAdjustmentAmount;
  public String totalSubProductCount;
  public String totalTaxAmount;
  public CartType type;
  public Integer uniqueProductCount;
  public String webstoreId;

  public CartSummary() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
