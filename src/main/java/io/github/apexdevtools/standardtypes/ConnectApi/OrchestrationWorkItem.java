/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Datetime;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class OrchestrationWorkItem {
  public String assigneeId;
  public Datetime createdDate;
  public String description;
  public String flowType;
  public String id;
  public String label;
  public Datetime lastModifiedDate;
  public String relatedRecordId;
  public String screenFlowDeveloperName;
  public String screenFlowId;
  public String screenFlowInputs;
  public OrchestrationWorkItemStatus status;

  public OrchestrationWorkItem() {throw new java.lang.UnsupportedOperationException();}
}
