/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

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
