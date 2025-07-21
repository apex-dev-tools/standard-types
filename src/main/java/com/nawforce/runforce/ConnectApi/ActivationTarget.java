/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;

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
