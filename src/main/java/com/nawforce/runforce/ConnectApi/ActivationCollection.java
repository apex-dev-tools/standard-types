/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ActivationCollection {
  public ActivationCollection() {throw new java.lang.UnsupportedOperationException();}

  public List<Activation> activations;
  public Integer batchSize;
  public Integer offset;
  public String orderByExpression;
}
