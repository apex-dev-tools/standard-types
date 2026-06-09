/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.CommercePayments;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_class_commercepayments_BankPaymentMethodRequest.htm
@SuppressWarnings("unused")
public class BankPaymentMethodRequest {
  public String accountHolderFirstName;
  public String accountHolderLastName;
  public String accountHolderName;
  public AccountHolderType accountHolderType;
  public String accountId;
  public String accountNumber;
  public AccountType accountType;
  public Boolean autoPay;
  public String bankCode;
  public BankType bankType;
  public String comments;
  public String email;
  public String mandate;
  public String nickName;
  public StandardEntryClassCode standardEntryClassCode;

  public BankPaymentMethodRequest() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
