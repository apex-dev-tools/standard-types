/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.Compression;

import io.github.apexdevtools.standardtypes.System.Blob;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public class ZipWriter {
  public ZipWriter() {throw new java.lang.UnsupportedOperationException();}

  public ZipEntry addEntry(String name, Blob data) {throw new java.lang.UnsupportedOperationException();}
  public ZipEntry addEntry(ZipEntry prototype) {throw new java.lang.UnsupportedOperationException();}
  public Blob getArchive() {throw new java.lang.UnsupportedOperationException();}
  public List<ZipEntry> getEntries() {throw new java.lang.UnsupportedOperationException();}
  public ZipEntry getEntry(String name) {throw new java.lang.UnsupportedOperationException();}
  public Level getLevel() {throw new java.lang.UnsupportedOperationException();}
  public Method getMethod() {throw new java.lang.UnsupportedOperationException();}
  public void removeEntry(String name) {throw new java.lang.UnsupportedOperationException();}
  public ZipWriter setLevel(Level value) {throw new java.lang.UnsupportedOperationException();}
  public ZipWriter setMethod(Method value) {throw new java.lang.UnsupportedOperationException();}
}
