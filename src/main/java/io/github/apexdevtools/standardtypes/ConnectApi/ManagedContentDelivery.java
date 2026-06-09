/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentDelivery {
  public static ManagedContentDeliveryChannelRepresentation getChannel(String channelId) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryChannelsRepresentation getChannels(Integer pageParam, Integer pageSize) {throw new UnsupportedOperationException();}
  public static ManagedContentCollectionItems getCollectionItemsForChannel(String channelId, String collectionKeyOrId, String language) {throw new UnsupportedOperationException();}
  public static ManagedContentCollectionItems getCollectionItemsForChannel(String channelId, String collectionKeyOrId, String language, Integer pageToken, Integer pageSize) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentCollectionItems getCollectionItemsForSite(String siteId, String collectionKeyOrId, String language) {throw new UnsupportedOperationException();}
  public static ManagedContentCollectionItems getCollectionItemsForSite(String siteId, String collectionKeyOrId, String language, Integer pageToken, Integer pageSize) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForChannel(String channelId, String contentKeyOrId, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForChannel(String channelId, String contentKeyOrId, String language, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForChannel(String channelId, String contentKeyOrId, String language, Boolean showAbsoluteUrl, Integer referenceDepth, Boolean expandReferences, Boolean referencesAsList) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForSite(String siteId, String contentKeyOrId, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForSite(String siteId, String contentKeyOrId, String language, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocument getManagedContentForSite(String siteId, String contentKeyOrId, String language, Boolean showAbsoluteUrl, Integer referenceDepth, Boolean expandReferences, Boolean referencesAsList) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocumentCollection getManagedContentsForChannel(String channelId, List<String> managedContentIds, List<String> contentKeys, String contentTypeFQN, String language, String publishStartDate, String publishEndDate, Boolean includeContentBody, Integer referenceDepth, Boolean expandReferences, Boolean referencesAsList, Integer pageParam, Integer pageSize, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
  public static ManagedContentDeliveryDocumentCollection getManagedContentsForSite(String siteId, List<String> managedContentIds, List<String> contentKeys, String contentTypeFQN, String language, String publishStartDate, String publishEndDate, Boolean includeContentBody, Integer referenceDepth, Boolean expandReferences, Boolean referencesAsList, Integer pageParam, Integer pageSize, Boolean showAbsoluteUrl) {throw new UnsupportedOperationException();}
}
