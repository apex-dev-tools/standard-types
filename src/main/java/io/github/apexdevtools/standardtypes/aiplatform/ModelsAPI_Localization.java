/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.aiplatform;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ModelsAPI_Localization {
  public String defaultLocale;
  public List<ModelsAPI_ProbableLocale> inputLocales;
  public List<String> expectedLocales;

  public ModelsAPI_Localization() {throw new java.lang.UnsupportedOperationException();}
}
