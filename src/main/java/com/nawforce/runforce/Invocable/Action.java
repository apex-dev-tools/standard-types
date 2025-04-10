/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.Invocable;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.Map;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class Action {
    public static class Error {
        public Object clone() {throw new java.lang.UnsupportedOperationException();}
        public String getCode() {throw new java.lang.UnsupportedOperationException();}
        public String getMessage() {throw new java.lang.UnsupportedOperationException();}
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
    public static Action createStandardAction(String type) {throw new java.lang.UnsupportedOperationException();}
    public String getName() {throw new java.lang.UnsupportedOperationException();}
    public String getNamespace() {throw new java.lang.UnsupportedOperationException();}
    public String getType() {throw new java.lang.UnsupportedOperationException();}
    public List<Action.Result> invoke() {throw new java.lang.UnsupportedOperationException();}
    public Boolean isStandard() {throw new java.lang.UnsupportedOperationException();}
    public Action setInvocationParameter(String parameterName, Object parameterValue) {throw new java.lang.UnsupportedOperationException();}
    public Action setInvocations(List<Map<String,Object>> invocations) {throw new java.lang.UnsupportedOperationException();}
}
