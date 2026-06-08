/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.Invocable;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Date;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Long;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Action {
    public static class AdditionalAttribute {
        public String getApexClass() {throw new java.lang.UnsupportedOperationException();}
        public String getDataType() {throw new java.lang.UnsupportedOperationException();}
        public Boolean getIsCollection() {throw new java.lang.UnsupportedOperationException();}
        public String getName() {throw new java.lang.UnsupportedOperationException();}
        public Object getValue() {throw new java.lang.UnsupportedOperationException();}
        public List<Boolean> getValueAsBooleanList() {throw new java.lang.UnsupportedOperationException();}
        public List<Date> getValueAsDateList() {throw new java.lang.UnsupportedOperationException();}
        public List<Double> getValueAsDoubleList() {throw new java.lang.UnsupportedOperationException();}
        public List<Integer> getValueAsIntegerList() {throw new java.lang.UnsupportedOperationException();}
        public List<Object> getValueAsList() {throw new java.lang.UnsupportedOperationException();}
        public List<Long> getValueAsLongList() {throw new java.lang.UnsupportedOperationException();}
        public List<String> getValueAsStringList() {throw new java.lang.UnsupportedOperationException();}
    }

    public static class DescribeResult {
        public Action getAction() {throw new java.lang.UnsupportedOperationException();}
        public Boolean getAllowsTransactionControl() {throw new java.lang.UnsupportedOperationException();}
        public List<String> getCapabilityTypes() {throw new java.lang.UnsupportedOperationException();}
        public String getCategory() {throw new java.lang.UnsupportedOperationException();}
        public String getConfigurationEditor() {throw new java.lang.UnsupportedOperationException();}
        public String getDescription() {throw new java.lang.UnsupportedOperationException();}
        public List<Action.GenericType> getGenericTypes() {throw new java.lang.UnsupportedOperationException();}
        public Boolean getHasCallout() {throw new java.lang.UnsupportedOperationException();}
        public Boolean getHasSystemGeneratedOutput() {throw new java.lang.UnsupportedOperationException();}
        public String getIconId() {throw new java.lang.UnsupportedOperationException();}
        public String getIconName() {throw new java.lang.UnsupportedOperationException();}
        public List<Action.InputParameter> getInputs() {throw new java.lang.UnsupportedOperationException();}
        public String getLabel() {throw new java.lang.UnsupportedOperationException();}
        public String getMethodDescription() {throw new java.lang.UnsupportedOperationException();}
        public String getMethodLabel() {throw new java.lang.UnsupportedOperationException();}
        public String getMethodName() {throw new java.lang.UnsupportedOperationException();}
        public String getName() {throw new java.lang.UnsupportedOperationException();}
        public List<Action.OutputParameter> getOutputs() {throw new java.lang.UnsupportedOperationException();}
        public String getTargetEntityName() {throw new java.lang.UnsupportedOperationException();}
        public String getType() {throw new java.lang.UnsupportedOperationException();}
    }

    public static class Error {
        public Object clone() {throw new java.lang.UnsupportedOperationException();}
        public String getCode() {throw new java.lang.UnsupportedOperationException();}
        public String getMessage() {throw new java.lang.UnsupportedOperationException();}
    }

    public static class GenericType {
        public String getDescription() {throw new java.lang.UnsupportedOperationException();}
        public String getLabel() {throw new java.lang.UnsupportedOperationException();}
        public String getName() {throw new java.lang.UnsupportedOperationException();}
        public String getSuperType() {throw new java.lang.UnsupportedOperationException();}
    }

    public static class InputParameter {
        public List<Action.AdditionalAttribute> getAdditionalAttributes() {throw new java.lang.UnsupportedOperationException();}
        public String getApexClass() {throw new java.lang.UnsupportedOperationException();}
        public Integer getByteLength() {throw new java.lang.UnsupportedOperationException();}
        public Boolean getConfiguration() {throw new java.lang.UnsupportedOperationException();}
        public Object getDefaultValue() {throw new java.lang.UnsupportedOperationException();}
        public String getDescription() {throw new java.lang.UnsupportedOperationException();}
        public String getLabel() {throw new java.lang.UnsupportedOperationException();}
        public Integer getMaxOccurs() {throw new java.lang.UnsupportedOperationException();}
        public String getName() {throw new java.lang.UnsupportedOperationException();}
        public List<Action.PicklistValue> getPicklistValues() {throw new java.lang.UnsupportedOperationException();}
        public String getPlaceholderText() {throw new java.lang.UnsupportedOperationException();}
        public Boolean getRequired() {throw new java.lang.UnsupportedOperationException();}
        public String getSObjectType() {throw new java.lang.UnsupportedOperationException();}
        public List<String> getSetupReferenceType() {throw new java.lang.UnsupportedOperationException();}
        public String getToolingType() {throw new java.lang.UnsupportedOperationException();}
        public String getType() {throw new java.lang.UnsupportedOperationException();}
    }

    public static class OutputParameter {
        public List<Action.AdditionalAttribute> getAdditionalAttributes() {throw new java.lang.UnsupportedOperationException();}
        public String getApexClass() {throw new java.lang.UnsupportedOperationException();}
        public String getDescription() {throw new java.lang.UnsupportedOperationException();}
        public String getLabel() {throw new java.lang.UnsupportedOperationException();}
        public Integer getMaxOccurs() {throw new java.lang.UnsupportedOperationException();}
        public String getName() {throw new java.lang.UnsupportedOperationException();}
        public List<Action.PicklistValue> getPicklistValues() {throw new java.lang.UnsupportedOperationException();}
        public String getSObjectType() {throw new java.lang.UnsupportedOperationException();}
        public String getType() {throw new java.lang.UnsupportedOperationException();}
    }

    public static class PicklistValue {
        public Boolean getActive() {throw new java.lang.UnsupportedOperationException();}
        public Boolean getDefaultValue() {throw new java.lang.UnsupportedOperationException();}
        public String getLabel() {throw new java.lang.UnsupportedOperationException();}
        public String getValidFor() {throw new java.lang.UnsupportedOperationException();}
        public String getValue() {throw new java.lang.UnsupportedOperationException();}
    }

    public static class Result {
        public Object clone() {throw new java.lang.UnsupportedOperationException();}
        public Action getAction() {throw new java.lang.UnsupportedOperationException();}
        public List<Action.Error> getErrors() {throw new java.lang.UnsupportedOperationException();}
        public Map<String,Object> getInvocationParameters() {throw new java.lang.UnsupportedOperationException();}
        public Map<String,Object> getOutputParameters() {throw new java.lang.UnsupportedOperationException();}
        public Boolean isSuccess() {throw new java.lang.UnsupportedOperationException();}
    }

    public Action addInvocation() {throw new java.lang.UnsupportedOperationException();}
    public Action clearInvocations() {throw new java.lang.UnsupportedOperationException();}
    public Object clone() {throw new java.lang.UnsupportedOperationException();}
    public static Action createCustomAction(String type, String name) {throw new java.lang.UnsupportedOperationException();}
    public static Action createCustomAction(String type, String namespace, String name) {throw new java.lang.UnsupportedOperationException();}
    public static Action createCustomAction(String type, String namespace, String name, String version) {throw new java.lang.UnsupportedOperationException();}
    public static Action createStandardAction(String type) {throw new java.lang.UnsupportedOperationException();}
    public static Action createStandardAction(String type, String version) {throw new java.lang.UnsupportedOperationException();}
    public List<Action.DescribeResult> getDescribe() {throw new java.lang.UnsupportedOperationException();}
    public String getName() {throw new java.lang.UnsupportedOperationException();}
    public String getNamespace() {throw new java.lang.UnsupportedOperationException();}
    public String getType() {throw new java.lang.UnsupportedOperationException();}
    public String getVersion() {throw new java.lang.UnsupportedOperationException();}
    public List<Action.Result> invoke() {throw new java.lang.UnsupportedOperationException();}
    public Boolean isStandard() {throw new java.lang.UnsupportedOperationException();}
    public Action setInvocationParameter(String parameterName, Object parameterValue) {throw new java.lang.UnsupportedOperationException();}
    public Action setInvocations(List<Map<String,Object>> invocations) {throw new java.lang.UnsupportedOperationException();}
}
