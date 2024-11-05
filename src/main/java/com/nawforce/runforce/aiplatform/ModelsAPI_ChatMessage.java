/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.aiplatform;

import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ModelsAPI_ChatMessage {
  public String id;
  public String role;
  public String content;
  public Long timestamp;
  public ModelsAPI_ChatMessage_parameters parameters;
  public ModelsAPI_ContentTrustRepresentation contentQuality;

  public ModelsAPI_ChatMessage() {throw new java.lang.UnsupportedOperationException();}
}
