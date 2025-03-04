/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ManagedContent {
  public static ManagedContentDocumentClone cloneManagedContentDocument(String contentKeyOrId, ManagedContentDocumentCloneInput ManagedContentCloneInputParam) {throw new UnsupportedOperationException();}
  public static ManagedContentDocument createManagedContent(ManagedContentDocumentInput ManagedContentInputParam) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentDocument createManagedContentWithMedia(ManagedContentDocumentInput ManagedContentInputParam, BinaryInput contentData) {throw new java.lang.UnsupportedOperationException();}
  public static void deleteManagedContentVariant(String variantId) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getAllContent(String channelId, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean includeMetadata, String startDate, String endDate) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getAllContent(String channelId, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean includeMetadata, String startDate, String endDate, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentChannelCollection getAllDeliveryChannels(Integer pageParam, Integer pageSize) {throw new UnsupportedOperationException();}
  public static ManagedContentVersionCollection getAllManagedContent(String communityId, Integer pageParam, Integer pageSize, String language, String managedContentType) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getAllManagedContent(String communityId, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getContentByContentKeys(String channelId, List<String> contentKeys, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean includeMetadata, String startDate, String endDate, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getContentByIds(String channelId, List<String> managedContentIds, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean includeMetadata, String startDate, String endDate) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getContentByIds(String channelId, List<String> managedContentIds, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean includeMetadata, String startDate, String endDate, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getManagedContentByContentKeys(String communityId, List<String> contentKeys, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getManagedContentByIds(String communityId, List<String> managedContentIds, Integer pageParam, Integer pageSize, String language, String managedContentType) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getManagedContentByIds(String communityId, List<String> managedContentIds, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getManagedContentByTopics(String communityId, List<String> topics, Integer pageParam, Integer pageSize, String language, String managedContentType) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getManagedContentByTopics(String communityId, List<String> topics, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getManagedContentByTopicsAndContentKeys(String communityId, List<String> contentKeys, List<String> topics, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getManagedContentByTopicsAndIds(String communityId, List<String> managedContentIds, List<String> topics, Integer pageParam, Integer pageSize, String language, String managedContentType) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVersionCollection getManagedContentByTopicsAndIds(String communityId, List<String> managedContentIds, List<String> topics, Integer pageParam, Integer pageSize, String language, String managedContentType, Boolean showAbsoluteUrl) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentSpace getManagedContentSpace(String contentSpaceId) {throw new java.lang.UnsupportedOperationException();}
  public static MCSFolderShareCollection getMCSFolderShares(String folderId) {throw new java.lang.UnsupportedOperationException();}
  public static MCSFolderShareTargetCollection getMCSFolderShareTargets(String folderId) {throw new java.lang.UnsupportedOperationException();}
  public static MCSFolderShareCollection patchMCSFolderShares(String folderId, MCSFolderShareCollectionUpdateInput mcsFolderShareCollectionUpdateInput) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentPublishOutput publish(ManagedContentPublishInput publishInput) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVariant replaceManagedContentVariant(String variantId, ManagedContentVariantUpdateInput ManagedContentVariantInputParam) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentVariant replaceManagedContentVariantWithMedia(String variantId, ManagedContentVariantUpdateInput ManagedContentVariantInputParam, BinaryInput contentData) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentUnpublishOutput unpublish(ManagedContentUnpublishInput unpublishInput) {throw new java.lang.UnsupportedOperationException();}
}
