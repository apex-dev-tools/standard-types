/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.aiplatform;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ModelsAPI_GenerationResponse {
  public String id;
  public ModelsAPI_GenerationRepresentation generation;
  public List<ModelsAPI_GenerationRepresentation> moreGenerations;
  public String prompt;
  public ModelsAPI_GenerationResponse_parameters parameters;

  public ModelsAPI_GenerationResponse() {throw new java.lang.UnsupportedOperationException();}
}
