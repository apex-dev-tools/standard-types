/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ConcurLongRunApexErrEvent extends SObject {
	public static SObjectType$<ConcurLongRunApexErrEvent> SObjectType;
	public static SObjectFields$<ConcurLongRunApexErrEvent> Fields;

	public Datetime CreatedDate;
	public Integer CurrentValue;
	public Datetime EventDate;
	public String EventIdentifier;
	public String EventUuid;
	public Integer LimitValue;
	public String LoginKey;
	public String Quiddity;
	public String ReplayId;
	public String RequestId;
	public String RequestUri;
	public String SessionKey;
	public String SessionLevel;
	public String SourceIp;
	public Id UserId;
	public User User;
	public String Username;

	public ConcurLongRunApexErrEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ConcurLongRunApexErrEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ConcurLongRunApexErrEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ConcurLongRunApexErrEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ConcurLongRunApexErrEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
