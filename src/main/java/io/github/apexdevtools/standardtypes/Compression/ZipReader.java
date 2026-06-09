/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Compression;

import io.github.apexdevtools.standardtypes.System.Blob;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.Map;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ZipReader {
  public ZipReader(Blob data) {throw new java.lang.UnsupportedOperationException();}

  public Blob extract(String name) {throw new java.lang.UnsupportedOperationException();}
  public Blob extract(ZipEntry entry) {throw new java.lang.UnsupportedOperationException();}
  public List<ZipEntry> getEntries() {throw new java.lang.UnsupportedOperationException();}
  public Map<String,ZipEntry> getEntriesMap() {throw new java.lang.UnsupportedOperationException();}
  public ZipEntry getEntry(String name) {throw new java.lang.UnsupportedOperationException();}
  public List<String> getEntryNames() {throw new java.lang.UnsupportedOperationException();}
}
