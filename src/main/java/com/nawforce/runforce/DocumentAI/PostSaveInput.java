/*
 * Copyright (c) 2026 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.DocumentAI;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class PostSaveInput {
  public DuplicateRuleConfiguration duplicateRuleConfiguration;
  public ExtractionMetadata extractionMetadata;
  public Map<String,Object> input;
  public List<Node> nodes;

  public PostSaveInput() {throw new java.lang.UnsupportedOperationException();}

  public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
  public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
  public String toString$() {throw new java.lang.UnsupportedOperationException();}
}
