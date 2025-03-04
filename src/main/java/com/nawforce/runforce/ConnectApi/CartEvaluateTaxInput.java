/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.SObject;

@SuppressWarnings("unused")
public class CartEvaluateTaxInput {
  public List<SObject> customFields;
  public CartShippingAddressInput shippingAddress;

  public CartEvaluateTaxInput() {throw new java.lang.UnsupportedOperationException();}
}
