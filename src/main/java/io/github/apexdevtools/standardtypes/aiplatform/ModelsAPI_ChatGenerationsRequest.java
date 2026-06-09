/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.aiplatform;

import io.github.apexdevtools.standardtypes.System.List;

@SuppressWarnings("unused")
public class ModelsAPI_ChatGenerationsRequest {
  public List<ModelsAPI_ChatMessageRequest> messages;
  public ModelsAPI_Localization localization;
  public ModelsAPI_Tags tags;

  public ModelsAPI_ChatGenerationsRequest() {throw new java.lang.UnsupportedOperationException();}
}
