/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ActivationDefinitionInput {
  public ActivationDefinitionInput() {throw new java.lang.UnsupportedOperationException();}

  public String activationTargetName;
  public ActivationTargetSubjectConfigInput activationTargetSubjectConfig;
  public List<AttributeLimitingExpressionInput> attributeLimitingExpressionConfig;
  public List<ActivationAdditionalAttributesConfigInput> attributesConfig;
  public List<ActivationContactPointInput> contactPointsConfig;
  public CuratedEntityInput curatedEntity;
  public ActivationPlatformCustomerFileSourceEnum customerFileSource;
  public String dataExportDefinitionId;
  public List<DataSourceNameConfigInput> dataSourcesConfig;
  public String dataSpaceName;
  public String description;
  public List<DMOFilterInput> directDmoFiltersConfig;
  public Integer limitValue;
  public String marketSegmentId;
  public String name;
  public String refreshType;
  public List<DMOFilterInput> relatedDmoFiltersConfig;
  public String segmentApiName;
  public Boolean shouldExcludeDeletes;
  public Boolean shouldExcludeUpdates;
  public List<StaticDataInput> staticDataConfig;
}
