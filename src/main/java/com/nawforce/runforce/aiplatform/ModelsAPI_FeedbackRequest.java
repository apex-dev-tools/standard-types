/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.aiplatform;

import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ModelsAPI_FeedbackRequest {
  public String id;
  public String generationId;
  public String feedback;
  public String feedbackText;
  public String source;
  public ModelsAPI_FeedbackRequest_appFeedback appFeedback;
  public String appGenerationId;
  public String appGeneration;

  public ModelsAPI_FeedbackRequest() {throw new java.lang.UnsupportedOperationException();}
}
