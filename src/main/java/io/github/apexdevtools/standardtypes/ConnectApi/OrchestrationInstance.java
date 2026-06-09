/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

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
