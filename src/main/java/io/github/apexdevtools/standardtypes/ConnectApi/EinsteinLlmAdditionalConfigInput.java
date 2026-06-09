/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.*;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Double;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

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
