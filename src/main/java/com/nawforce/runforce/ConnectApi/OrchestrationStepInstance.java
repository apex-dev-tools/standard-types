/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

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
