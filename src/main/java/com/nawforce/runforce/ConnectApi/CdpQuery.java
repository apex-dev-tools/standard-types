/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CdpQuery {
  public static CdpQueryMetadataOutput getAllMetadata() {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getAllMetadata(String entityType, String entityCategory, String entityName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getInsightsMetadata() {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getInsightsMetadata(String ciName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getProfileMetadata() {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getProfileMetadata(String dataModelName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutputV2 nextBatchAnsiSqlV2(String nextBatchId) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryANSISql(CdpQueryInput input) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryANSISql(CdpQueryInput input, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutputV2 queryAnsiSqlV2(CdpQueryInput input) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryCalculatedInsights(String ciName, String dimensions, String measures, String orderby, String filters, Integer batchSize, Integer offset) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryCalculatedInsights(String ciName, String dimensions, String measures, String orderby, String filters, Integer batchSize, Integer offset, String timeGranularity) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String filters, String fields, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String id, String searchKey, String filters, String fields, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String id, String childDataModelName, String searchKey, String filters, String fields, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String id, String ciName, String searchKey, String dimensions, String measures, String filters, String fields, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String id, String ciName, String searchKey, String dimensions, String measures, String filters, String fields, Integer batchSize, Integer offset, String orderby, String timeGranularity) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryDataOutput universalIdLookupBySourceId(String entityName, String dataSourceId, String dataSourceObjectId, String sourceRecordId) {throw new java.lang.UnsupportedOperationException();}
}
