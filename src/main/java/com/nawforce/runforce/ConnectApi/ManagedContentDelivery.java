/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class ManagedContentDelivery {
  public static ManagedContentDeliveryChannelRepresentation getChannel(String channelId) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryChannelsRepresentation getChannels(Integer pageParam, Integer pageSize) {throw new UnsupportedOperationException();}
  public static ManagedContentCollectionItems getCollectionItemsForChannel(String channelId, String collectionKeyOrId, String language) {throw new UnsupportedOperationException();}
  public static ManagedContentCollectionItems getCollectionItemsForSite(String siteId, String collectionKeyOrId, String language) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForChannel(String channelId, String contentKeyOrId, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForChannel(String channelId, String contentKeyOrId, String language, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForChannel(String channelId, String contentKeyOrId, String language, Boolean showAbsoluteUrl, Integer referenceDepth, Boolean expandReferences, Boolean referencesAsList) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForSite(String siteId, String contentKeyOrId, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForSite(String siteId, String contentKeyOrId, String language, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForSite(String siteId, String contentKeyOrId, String language, Boolean showAbsoluteUrl, Integer referenceDepth, Boolean expandReferences, Boolean referencesAsList) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocumentCollection getManagedContentsForChannel(String channelId, List<String> managedContentIds, List<String> contentKeys, String contentTypeFQN, String language, String publishStartDate, String publishEndDate, Boolean includeContentBody, Integer referenceDepth, Boolean expandReferences, Boolean referencesAsList, Integer pageParam, Integer pageSize, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocumentCollection getManagedContentsForSite(String siteId, List<String> managedContentIds, List<String> contentKeys, String contentTypeFQN, String language, String publishStartDate, String publishEndDate, Boolean includeContentBody, Integer referenceDepth, Boolean expandReferences, Boolean referencesAsList, Integer pageParam, Integer pageSize, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
}
