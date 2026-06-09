/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.FormulaEval;

import io.github.apexdevtools.standardtypes.Schema.SObjectType;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.Type;

@SuppressWarnings("unused")
public class FormulaBuilder {
  public FormulaInstance build() {throw new java.lang.UnsupportedOperationException();}
  public static FormulaBuilder builder() {throw new java.lang.UnsupportedOperationException();}

  public FormulaBuilder parseAsTemplate(Boolean templateMode) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder treatNumericNullAsZero(Boolean isNumericNullZero) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withFormula(String formulaText) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withGlobalVariables(List<FormulaGlobal> formulaGlobals) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withReturnType(FormulaReturnType returnType) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withType(Type contextType) {throw new java.lang.UnsupportedOperationException();}
  public FormulaBuilder withType(SObjectType contextSObjectType) {throw new java.lang.UnsupportedOperationException();}
}
