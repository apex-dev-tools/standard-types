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

package com.nawforce.runforce.ConnectApi;

import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class EmailMessageCapability extends FeedElementCapability {
	public EmailAttachment attachments;
	public String automationType;
	public List<EmailAddress> bccAddresses;
	public String body;
	public List<EmailAddress> ccAddresses;
	public EmailMessageDirection direction;
	public String emailMessageId;
	public EmailAddress fromAddress;
	public Boolean isRichText;
	public String subject;
	public String textBody;
	public List<EmailAddress> toAddresses;
	public Integer totalAttachments;

	public EmailMessageCapability() {throw new java.lang.UnsupportedOperationException();}
}
