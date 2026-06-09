/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OrchestrationStepInstance {
  public String assignedTo;
  public String assigneeType;
  public String comments;
  public String completedBy;
  public String completionTime;
  public String description;
  public String id;
  public String label;
  public String name;
  public OrchestrationStatus status;
  public OrchestrationStepType stepType;
  public List<OrchestrationWorkItem> workItems;

  public OrchestrationStepInstance() {throw new java.lang.UnsupportedOperationException();}
}
