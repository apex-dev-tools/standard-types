/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class OrchestrationStageInstance {
  public String completionTime;
  public String id;
  public String label;
  public String name;
  public OrchestrationStatus status;
  public List<OrchestrationStepInstance> stepInstances;

  public OrchestrationStageInstance() {throw new java.lang.UnsupportedOperationException();}
}
