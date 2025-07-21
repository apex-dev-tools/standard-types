/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Activation {
  public Activation() {throw new java.lang.UnsupportedOperationException();}

  public String activationDefinitionId;
  public ActivationPlatformCustomerFileSourceEnum activationPlatformCustomerFileSourceEnum;
  public String activationRecordSchema;
  public ActivationTarget activationTarget;
  public String activationTargetId;
  public String activationTargetName;
  public List<QueryPathConfigList> activationTargetObjectPath;
  public ActivationTargetSubject activationTargetSubject;
  public ActivationAttributeConfig attributesConfig;
  public ContactPointsConfig contactPointsConfig;
  public String curatedEntityApiName;
  public String curatedEntityId;
  public String curatedEntityName;
  public ActivationDataSources dataSourcesConfig;
  public String dataSpaceName;
  public String dataspaceId;
  public String description;
  public String developerName;
  public DmoFilterConfig directDmoFiltersConfig;
  public Boolean enabled;
  public String historyAudienceDmoApiName;
  public String historyAudienceDmoLabel;
  public Datetime lastPublishDate;
  public DataExportRunStatusEnum lastPublishStatus;
  public String lastPublishStatusErrorMsg;
  public String latestAudienceDmoApiName;
  public String latestAudienceDmoLabel;
  public Datetime latestAudienceDmoLastRunTimestamp;
  public String membershipName;
  public DataExportRefreshModeEnum refreshType;
  public DmoFilterConfig relatedDmoFiltersConfig;
  public String segmentApiName;
  public String segmentDefinitionId;
  public String segmentId;
  public Boolean shouldExcludeDeletes;
  public Boolean shouldExcludeUpdates;
  public StaticDataConfig staticDataConfig;
  public ActivationStatusEnum status;
}
