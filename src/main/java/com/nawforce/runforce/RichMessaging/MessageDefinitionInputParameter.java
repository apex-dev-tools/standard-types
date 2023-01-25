/*
 * Copyright (c) 2023 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.RichMessaging;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Date;
import com.nawforce.runforce.System.Datetime;
import com.nawforce.runforce.System.Double;
import com.nawforce.runforce.System.List;
import com.nawforce.runforce.System.String;

@SuppressWarnings("unused")
public class MessageDefinitionInputParameter {
    public Boolean booleanValue;
    public List<Boolean> booleanValues;
    public Datetime dateTimeValue;
    public List<Datetime> dateTimeValues;
    public Date dateValue;
    public List<Date> dateValues;
    public String name;
    public Double numberValue;
    public List<Double> numberValues;
    public String recordIdValue;
    public List<String> recordIdValues;
    public String textValue;
    public List<String> textValues;

    public MessageDefinitionInputParameter() {throw new java.lang.UnsupportedOperationException();}

    public Object clone() {throw new java.lang.UnsupportedOperationException();}
}
