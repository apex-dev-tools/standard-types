/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.Compression;

import com.nawforce.runforce.System.Blob;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

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
