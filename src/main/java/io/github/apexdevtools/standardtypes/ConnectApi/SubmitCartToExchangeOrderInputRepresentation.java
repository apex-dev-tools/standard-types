/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class SubmitCartToExchangeOrderInputRepresentation {
  public String exchangeCartId;
  public String orderNumber;
  public String orderSummaryId;
  public List<PaymentInfoInputRepresentation> paymentInfoList;
  public String referenceId;
  public List<SharedOrderPaymentSummarySequenceInputRepresentation> sequences;
  public String data;

  public SubmitCartToExchangeOrderInputRepresentation() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
