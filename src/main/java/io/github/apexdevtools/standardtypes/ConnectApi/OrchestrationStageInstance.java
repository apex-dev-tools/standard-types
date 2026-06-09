/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

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
