/*
 * Copyright (c) 2025 Salesforce, Inc. All rights reserved.
 */

package com.nawforce.runforce.CommercePayments;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_CardPaymentMethodRequest.htm
@SuppressWarnings("unused")
public class CardPaymentMethodRequest extends BasePaymentMethodRequest {
  public String accountId;
  public Boolean autoPay;
  public CardCategory cardCategory;
  public String cardHolderFirstName;
  public String cardHolderLastName;
  public String cardHolderName;
  public String cardNumber;
  public CardType cardType;
  public String cvv;
  public String email;
  public Integer expiryMonth;
  public Integer expiryYear;
  public String inputCardType;
  public Integer startMonth;
  public Integer startYear;

  public CardPaymentMethodRequest() {throw new java.lang.UnsupportedOperationException();}
  public CardPaymentMethodRequest(CardCategory cardCategory) {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
