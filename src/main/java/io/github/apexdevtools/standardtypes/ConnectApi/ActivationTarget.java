/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ActivationTarget {
  public ActivationTarget() {throw new java.lang.UnsupportedOperationException();}

  public DataConnector connector;
  public String dataSpace;
  public String description;
  public String historyAudienceDmoApiName;
  public String historyAudienceDmoLabel;
  public Boolean isCappingEnabled;
  public Boolean isEnabled;
  public String latestAudienceDmoApiName;
  public String latestAudienceDmoLabel;
  public String organizationId;
  public String platformName;
  public String platformPrivacyType;
  public DataConnectorTypeEnum platformType;
  public ActivationTargetStatusEnum status;
}
