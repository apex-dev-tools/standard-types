/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.*;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class EinsteinLlmAdditionalConfigInput {
  public Map<String,WrappedValue> additionalParameters;
  public String applicationName;
  public Boolean enablePiiMasking;
  public Double frequencyPenalty;
  public Integer maxTokens;
  public String model;
  public Integer numGenerations;
  public Double presencePenalty;
  public List<String> stopSequences;
  public Double temperature;

  public EinsteinLlmAdditionalConfigInput() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
