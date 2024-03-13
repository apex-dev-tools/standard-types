/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
