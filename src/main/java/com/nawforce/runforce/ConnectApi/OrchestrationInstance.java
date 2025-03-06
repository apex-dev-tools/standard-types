/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OrchestrationInstance {
  public String flowDefinitionDeveloperName;
  public String flowDefinitionId;
  public String flowDefinitionName;
  public String id;
  public String interviewId;
  public List<OrchestrationStageInstance> stageInstances;
  public OrchestrationStatus status;

  public OrchestrationInstance() {throw new java.lang.UnsupportedOperationException();}
}
