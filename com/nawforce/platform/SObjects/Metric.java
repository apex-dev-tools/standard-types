/*
 [The "BSD licence"]
 Copyright (c) 2019 Kevin Jones
 All rights reserved.

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

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package com.nawforce.platform.SObjects;

import com.nawforce.platform.Internal.SObjectFields$;
import com.nawforce.platform.Internal.SObjectType$;
import com.nawforce.platform.System.Boolean;
import com.nawforce.platform.System.String;
import com.nawforce.platform.System.*;

@SuppressWarnings("unused")
public class Metric extends SObject {
	public static SObjectType$<Metric> SObjectType;
	public static SObjectFields$<Metric> Fields;
	public Datetime CompletionDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Decimal CurrentValue;
	public String Description;
	public Date DueDate;
	public Id GoalId;
	public Goal Goal;
	public Id Id;
	public Decimal InitialValue;
	public Boolean IsCompletionMetric;
	public Boolean IsDeleted;
	public String LastComment;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Group Owner;
	public Decimal Progress;
	public Id RecordTypeId;
	public RecordType RecordType;
	public Date StartDate;
	public String Status;
	public Datetime SystemModstamp;
	public Decimal TargetValue;
	public Decimal Weight;

	public ActivityHistory[] ActivityHistories;
	public AttachedContentDocument[] AttachedContentDocuments;
	public Attachment[] Attachments;
	public CombinedAttachment[] CombinedAttachments;
	public ContentDocumentLink[] ContentDocumentLinks;
	public EmailMessage[] Emails;
	public Event[] Events;
	public EntitySubscription[] FeedSubscriptionsForEntity;
	public MetricFeed[] Feeds;
	public MetricHistory[] Histories;
	public MetricDataLink[] LinkTarget;
	public Note[] Notes;
	public NoteAndAttachment[] NotesAndAttachments;
	public OpenActivity[] OpenActivities;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public MetricShare[] Shares;
	public Task[] Tasks;

	public Metric clone$() {throw new java.lang.UnsupportedOperationException();}
	public Metric clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Metric clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Metric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Metric clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
