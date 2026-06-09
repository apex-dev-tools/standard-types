/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class EinsteinPromptTemplateGenerationsInput {
  public EinsteinLlmAdditionalConfigInput additionalConfig;
  public String citationMode;
  public Map<String,WrappedValue> inputParams;
  public Boolean isPreview;
  public String outputLanguage;
  public WrappedValue tags;

  public EinsteinPromptTemplateGenerationsInput() {throw new java.lang.UnsupportedOperationException();}
}
