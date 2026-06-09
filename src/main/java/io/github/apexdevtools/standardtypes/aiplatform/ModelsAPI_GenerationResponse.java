/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.aiplatform;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ModelsAPI_GenerationResponse {
  public String id;
  public ModelsAPI_GenerationRepresentation generation;
  public List<ModelsAPI_GenerationRepresentation> moreGenerations;
  public String prompt;
  public ModelsAPI_GenerationResponse_parameters parameters;

  public ModelsAPI_GenerationResponse() {throw new java.lang.UnsupportedOperationException();}
}
