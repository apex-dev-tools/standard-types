/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.industriesNlpSvc;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class NlpResponse {
  public NlpSummarizationResult summarizationResult;
  public List<String> errors;

  public NlpResponse() {throw new java.lang.UnsupportedOperationException();}
}
