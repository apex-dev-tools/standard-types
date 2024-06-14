/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.FormulaEval;

import com.nawforce.runforce.Schema.SObjectType;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.Type;

@SuppressWarnings("unused")
public class FormulaBuilder {
  public FormulaInstance build() {throw new java.lang.UnsupportedOperationException();}
  public static FormulaBuilder builder() {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder treatNumericNullAsZero(Boolean isNumericNullZero) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withFormula(String formulaText) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withGlobalVariables(List<FormulaGlobal> formulaGlobals) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withReturnType(FormulaReturnType returnType) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withType(Type contextType) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withType(SObjectType contextSObjectType) {throw new java.lang.UnsupportedOperationException();}
}
