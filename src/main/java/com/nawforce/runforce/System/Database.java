/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.System;

import com.nawforce.runforce.DataSource.AsyncDeleteCallback;
import com.nawforce.runforce.DataSource.AsyncSaveCallback;
import com.nawforce.runforce.Database.*;
import com.nawforce.runforce.Internal.RecordSet$;
import com.nawforce.runforce.Schema.SObjectField;

@SuppressWarnings("unused")
public class Database {
	public static LeadConvertResult convertLead(LeadConvert leadConvert) {throw new java.lang.UnsupportedOperationException();}
	public static LeadConvertResult convertLead(LeadConvert leadConvert, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static LeadConvertResult convertLead(LeadConvert leadConvert, DMLOptions dmlOptions) {throw new java.lang.UnsupportedOperationException();}
	public static LeadConvertResult convertLead(LeadConvert leadConvert, DMLOptions dmlOptions, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static LeadConvertResult convertLead(LeadConvert leadConvert, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static LeadConvertResult convertLead(LeadConvert leadConvert, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<LeadConvertResult> convertLead(List<LeadConvert> leadConverts) {throw new java.lang.UnsupportedOperationException();}
	public static List<LeadConvertResult> convertLead(List<LeadConvert> leadConverts, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<LeadConvertResult> convertLead(List<LeadConvert> leadConverts, DMLOptions dmlOptions) {throw new java.lang.UnsupportedOperationException();}
	public static List<LeadConvertResult> convertLead(List<LeadConvert> leadConverts, DMLOptions dmlOptions, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<LeadConvertResult> convertLead(List<LeadConvert> leadConverts, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static List<LeadConvertResult> convertLead(List<LeadConvert> leadConverts, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static Integer countQuery(String query) {throw new java.lang.UnsupportedOperationException();}
	public static Integer countQuery(String query, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static Integer countQueryWithBinds(String query, Map<String, Object> bindMap, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult delete(Id id) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult delete(Id id, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult delete(Id id, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult delete(Id id, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	// Using Object here as List<SObject> & List<Id> have same erasure
	public static List<DeleteResult> delete(List<Object> objects) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> delete(List<Object> objects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> delete(List<Object> objects, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> delete(List<Object> objects, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult delete(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult delete(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult delete(SObject sobject, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult delete(SObject sobject, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> deleteAsync(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> deleteAsync(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> deleteAsync(List<SObject> sobjects, AsyncDeleteCallback callback) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> deleteAsync(List<SObject> sobjects, AsyncDeleteCallback callback, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult deleteAsync(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult deleteAsync(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult deleteAsync(SObject sobject, AsyncDeleteCallback callback) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult deleteAsync(SObject sobject, AsyncDeleteCallback callback, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> deleteImmediate(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<DeleteResult> deleteImmediate(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult deleteImmediate(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult deleteImmediate(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	// Using Object here as List<SObject> & List<Id> have same erasure
	public static List<EmptyRecycleBinResult> emptyRecycleBin(List<Object> objects) {throw new java.lang.UnsupportedOperationException();}
	public static EmptyRecycleBinResult emptyRecycleBin(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static String executeBatch(Object batchable) {throw new java.lang.UnsupportedOperationException();}
	public static String executeBatch(Object batchable, Integer batchSize) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult getAsyncDeleteResult(DeleteResult deleteResult) {throw new java.lang.UnsupportedOperationException();}
	public static DeleteResult getAsyncDeleteResult(String asyncLocator) {throw new java.lang.UnsupportedOperationException();}
	public static String getAsyncLocator(Object result) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult getAsyncSaveResult(SaveResult saveResult) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult getAsyncSaveResult(String asyncLocator) {throw new java.lang.UnsupportedOperationException();}
	public static GetDeletedResult getDeleted(String sobjectType, Datetime startDate, Datetime endDate) {throw new java.lang.UnsupportedOperationException();}
	public static QueryLocator getQueryLocator(List<SObject> query) {throw new java.lang.UnsupportedOperationException();}
	public static QueryLocator getQueryLocator(List<SObject> query, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static QueryLocator getQueryLocator(String query) {throw new java.lang.UnsupportedOperationException();}
	public static QueryLocator getQueryLocator(String query, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static QueryLocator getQueryLocatorWithBinds(String query, Map<String, Object> bindMap, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static GetUpdatedResult getUpdated(String sobjectType, Datetime startDate, Datetime endDate) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insert(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insert(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insert(List<SObject> sobjects, DMLOptions dmlOptions) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insert(List<SObject> sobjects, DMLOptions dmlOptions, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insert(List<SObject> sobjects, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insert(List<SObject> sobjects, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insert(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insert(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insert(SObject sobject, DMLOptions dmlOptions) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insert(SObject sobject, DMLOptions dmlOptions, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insert(SObject sobject, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insert(SObject sobject, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insertAsync(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insertAsync(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insertAsync(List<SObject> sobjects, AsyncSaveCallback callback) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insertAsync(List<SObject> sobjects, AsyncSaveCallback callback, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insertAsync(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insertAsync(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insertAsync(SObject sobject, AsyncSaveCallback callback) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insertAsync(SObject sobject, AsyncSaveCallback callback, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insertImmediate(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> insertImmediate(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insertImmediate(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult insertImmediate(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static MergeResult merge(SObject primary, Id duplicate) {throw new java.lang.UnsupportedOperationException();}
	public static MergeResult merge(SObject primary, Id duplicate, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static MergeResult merge(SObject primary, Id duplicate, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static MergeResult merge(SObject primary, Id duplicate, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	// Using Object here as List<SObject> & List<Id> have same erasure
	public static List<MergeResult> merge(SObject primary, List<Object> duplicates) {throw new java.lang.UnsupportedOperationException();}
	public static List<MergeResult> merge(SObject primary, List<Object> duplicates, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<MergeResult> merge(SObject primary, List<Object> duplicates, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static List<MergeResult> merge(SObject primary, List<Object> duplicates, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static MergeResult merge(SObject primary, SObject duplicate) {throw new java.lang.UnsupportedOperationException();}
	public static MergeResult merge(SObject primary, SObject duplicate, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static MergeResult merge(SObject primary, SObject duplicate, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static MergeResult merge(SObject primary, SObject duplicate, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static RecordSet$<SObject> query(String query) {throw new java.lang.UnsupportedOperationException();}
	public static RecordSet$<SObject> query(String query, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static RecordSet$<SObject> queryWithBinds(String query, Map<String, Object> bindMap, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static void rollback(Savepoint savepoint) {throw new java.lang.UnsupportedOperationException();}
	public static Savepoint setSavepoint() {throw new java.lang.UnsupportedOperationException();}
	public static UndeleteResult undelete(Id id) {throw new java.lang.UnsupportedOperationException();}
	public static UndeleteResult undelete(Id id, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static UndeleteResult undelete(Id id, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static UndeleteResult undelete(Id id, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	// Using Object here as List<SObject> & List<Id> have same erasure
	public static List<UndeleteResult> undelete(List<Object> objects) {throw new java.lang.UnsupportedOperationException();}
	public static List<UndeleteResult> undelete(List<Object> objects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<UndeleteResult> undelete(List<Object> objects, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static List<UndeleteResult> undelete(List<Object> objects, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static UndeleteResult undelete(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static UndeleteResult undelete(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static UndeleteResult undelete(SObject sobject, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static UndeleteResult undelete(SObject sobject, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> update(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> update(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> update(List<SObject> sobjects, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> update(List<SObject> sobjects, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> update(List<SObject> sobjects, DMLOptions dmlOptions) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> update(List<SObject> sobjects, DMLOptions dmlOptions, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult update(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult update(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult update(SObject sobject, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult update(SObject sobject, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult update(SObject sobject, DMLOptions dmlOptions) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult update(SObject sobject, DMLOptions dmlOptions, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> updateAsync(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> updateAsync(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> updateAsync(List<SObject> sobjects, AsyncSaveCallback callback) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> updateAsync(List<SObject> sobjects, AsyncSaveCallback callback, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult updateAsync(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult updateAsync(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult updateAsync(SObject sobject, AsyncSaveCallback callback) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult updateAsync(SObject sobject, AsyncSaveCallback callback, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> updateImmediate(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<SaveResult> updateImmediate(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult updateImmediate(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static SaveResult updateImmediate(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<UpsertResult> upsert(List<SObject> sobjects) {throw new java.lang.UnsupportedOperationException();}
	public static List<UpsertResult> upsert(List<SObject> sobjects, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<UpsertResult> upsert(List<SObject> sobjects, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static List<UpsertResult> upsert(List<SObject> sobjects, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<UpsertResult> upsert(List<SObject> sobjects, SObjectField field) {throw new java.lang.UnsupportedOperationException();}
	public static List<UpsertResult> upsert(List<SObject> sobjects, SObjectField field, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static List<UpsertResult> upsert(List<SObject> sobjects, SObjectField field, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static List<UpsertResult> upsert(List<SObject> sobjects, SObjectField field, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static UpsertResult upsert(SObject sobject) {throw new java.lang.UnsupportedOperationException();}
	public static UpsertResult upsert(SObject sobject, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static UpsertResult upsert(SObject sobject, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static UpsertResult upsert(SObject sobject, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static UpsertResult upsert(SObject sobject, SObjectField field) {throw new java.lang.UnsupportedOperationException();}
	public static UpsertResult upsert(SObject sobject, SObjectField field, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
	public static UpsertResult upsert(SObject sobject, SObjectField field, Boolean allOrNothing) {throw new java.lang.UnsupportedOperationException();}
	public static UpsertResult upsert(SObject sobject, SObjectField field, Boolean allOrNothing, AccessLevel accessLevel) {throw new java.lang.UnsupportedOperationException();}
}
