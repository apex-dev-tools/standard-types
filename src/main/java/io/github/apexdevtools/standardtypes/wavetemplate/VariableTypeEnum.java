/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.standardtypes.wavetemplate;

import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.List;
import io.github.apexdevtools.standardtypes.System.String;

@SuppressWarnings("unused")
public enum VariableTypeEnum {
    ArrayType,
    BooleanType,
    DatasetDateType,
    DatasetDimensionType,
    DatasetMeasureType,
    DatasetType,
    DateTimeType,
    NumberType,
    ObjectType,
    SobjectFieldType,
    SobjectType,
    StringType;

    public Boolean equals$(Object obj) {throw new java.lang.UnsupportedOperationException();}
    public Integer hashCode$() {throw new java.lang.UnsupportedOperationException();}
    public Integer ordinal$() {throw new java.lang.UnsupportedOperationException();}

    public VariableTypeEnum valueOf(String str) {throw new java.lang.UnsupportedOperationException();}
    public List<VariableTypeEnum> values$() {throw new java.lang.UnsupportedOperationException();}
}
