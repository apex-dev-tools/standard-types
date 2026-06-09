/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.aiplatform;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ModelsAPI_Error {
  public String errorCode;
  public String messageCode;
  public String message;
  public List<ModelsAPI_Error_targets> targets;
  public List<ModelsAPI_Error_parameters> parameters;
  public Map<String, Object> properties;

  public ModelsAPI_Error() {throw new java.lang.UnsupportedOperationException();}
}
