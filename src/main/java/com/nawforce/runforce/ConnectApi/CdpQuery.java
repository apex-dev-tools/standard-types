/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class CdpQuery {
  public static CdpQueryMetadataOutput getAllMetadata() {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getAllMetadata(String entityType, String entityCategory, String entityName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getInsightsMetadata() {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getInsightsMetadata(String ciName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getProfileMetadata() {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryMetadataOutput getProfileMetadata(String dataModelName) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryANSISql(CdpQueryInput input) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryANSISql(CdpQueryInput input, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutputV2 queryAnsiSqlV2(CdpQueryInput input) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutputV2 queryAnsiSqlV2(CdpQueryInput input, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutputV2 nextBatchAnsiSqlV2(String nextBatchId) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutputV2 nextBatchAnsiSqlV2(String nextBatchId, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlOutput querySql(QuerySqlInput input) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlOutput querySql(QuerySqlInput input, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlOutput querySql(QuerySqlInput input, String workloadName, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlPageOutput querySqlRows(String queryId, Long offset, Long rowLimit) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlPageOutput querySqlRows(String queryId, Long offset, Long rowLimit, Boolean omitSchema) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlPageOutput querySqlRows(String queryId, Long offset, Long rowLimit, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlPageOutput querySqlRows(String queryId, Long offset, Long rowLimit, Boolean omitSchema, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlPageOutput querySqlRows(String queryId, Long offset, Long rowLimit, String workloadName, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlPageOutput querySqlRows(String queryId, Long offset, Long rowLimit, Boolean omitSchema, String workloadName, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static void cancelQuerySql(String queryId) {throw new java.lang.UnsupportedOperationException();}
  public static void cancelQuerySql(String queryId, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static void cancelQuerySql(String queryId, String workloadName, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlStatus querySqlStatus(String queryId) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlStatus querySqlStatus(String queryId, Integer waitTimeMs) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlStatus querySqlStatus(String queryId, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlStatus querySqlStatus(String queryId, String dataspace, Integer waitTimeMs) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlStatus querySqlStatus(String queryId, String workloadName, String dataspace) {throw new java.lang.UnsupportedOperationException();}
  public static QuerySqlStatus querySqlStatus(String queryId, String workloadName, String dataspace, Integer waitTimeMs) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryCalculatedInsights(String ciName, String dimensions, String measures, String orderby, String filters, Integer batchSize, Integer offset) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryCalculatedInsights(String ciName, String dimensions, String measures, String orderby, String filters, Integer batchSize, Integer offset, String timeGranularity) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String filters, String fields, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String id, String searchKey, String filters, String fields, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String id, String childDataModelName, String searchKey, String filters, String fields, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String id, String ciName, String searchKey, String dimensions, String measures, String filters, String fields, Integer batchSize, Integer offset, String orderby) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryOutput queryProfileApi(String dataModelName, String id, String ciName, String searchKey, String dimensions, String measures, String filters, String fields, Integer batchSize, Integer offset, String orderby, String timeGranularity) {throw new java.lang.UnsupportedOperationException();}
  public static CdpQueryDataOutput universalIdLookupBySourceId(String entityName, String dataSourceId, String dataSourceObjectId, String sourceRecordId) {throw new java.lang.UnsupportedOperationException();}
}
