/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.ConnectApi;

import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ManagedContentSpaces {
  public static ManagedContentSpace getManagedContentSpace(String contentSpaceId) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentSpaceChannelsRepresentation getManagedContentSpaceChannels(String contentSpaceId, Integer pageParam, Integer pageSize) {throw new UnsupportedOperationException();}
  public static ManagedContentSpaceCollectionRepresentation getManagedContentSpaces(Integer pageParam, Integer pageSize, String nameFragment) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentSpace patchManagedContentSpace(String contentSpaceId, ManagedContentSpaceUpdateInput ManagedContentSpaceUpdateInput) {throw new java.lang.UnsupportedOperationException();}
  public static ManagedContentSpaceChannelsRepresentation patchManagedContentSpaceChannels(String contentSpaceId, ManagedContentSpaceChannelsInputRepresentation spaceChannels) {throw new UnsupportedOperationException();}
  public static ManagedContentSpace postManagedContentSpace(ManagedContentSpaceInput ManagedContentSpaceInput) {throw new java.lang.UnsupportedOperationException();}
}
