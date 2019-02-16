package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class WebToCaseSettings implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public WebToCaseSettings() {}

    /* Cache the typeInfo instead of declaring static fields throughout*/
    private transient java.util.Map<String, com.sforce.ws.bind.TypeInfo> typeInfoCache = new java.util.HashMap<String, com.sforce.ws.bind.TypeInfo>();
    private com.sforce.ws.bind.TypeInfo _lookupTypeInfo(String fieldName, String namespace, String name, String typeNS, String type, int minOcc, int maxOcc, boolean elementForm) {
      com.sforce.ws.bind.TypeInfo typeInfo = typeInfoCache.get(fieldName);
      if (typeInfo == null) {
        typeInfo = new com.sforce.ws.bind.TypeInfo(namespace, name, typeNS, type, minOcc, maxOcc, elementForm);
        typeInfoCache.put(fieldName, typeInfo);
      }
      return typeInfo;
    }

    /**
     * element : caseOrigin of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean caseOrigin__is_set = false;

    private java.lang.String caseOrigin;

    public java.lang.String getCaseOrigin() {
      return caseOrigin;
    }

    public void setCaseOrigin(java.lang.String caseOrigin) {
      this.caseOrigin = caseOrigin;
      caseOrigin__is_set = true;
    }

    protected void setCaseOrigin(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("caseOrigin", "urn:metadata.tooling.soap.sforce.com","caseOrigin","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setCaseOrigin(__typeMapper.readString(__in, _lookupTypeInfo("caseOrigin", "urn:metadata.tooling.soap.sforce.com","caseOrigin","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldCaseOrigin(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("caseOrigin", "urn:metadata.tooling.soap.sforce.com","caseOrigin","http://www.w3.org/2001/XMLSchema","string",0,1,true), caseOrigin, caseOrigin__is_set);
    }

    /**
     * element : defaultResponseTemplate of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean defaultResponseTemplate__is_set = false;

    private java.lang.String defaultResponseTemplate;

    public java.lang.String getDefaultResponseTemplate() {
      return defaultResponseTemplate;
    }

    public void setDefaultResponseTemplate(java.lang.String defaultResponseTemplate) {
      this.defaultResponseTemplate = defaultResponseTemplate;
      defaultResponseTemplate__is_set = true;
    }

    protected void setDefaultResponseTemplate(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("defaultResponseTemplate", "urn:metadata.tooling.soap.sforce.com","defaultResponseTemplate","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setDefaultResponseTemplate(__typeMapper.readString(__in, _lookupTypeInfo("defaultResponseTemplate", "urn:metadata.tooling.soap.sforce.com","defaultResponseTemplate","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldDefaultResponseTemplate(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("defaultResponseTemplate", "urn:metadata.tooling.soap.sforce.com","defaultResponseTemplate","http://www.w3.org/2001/XMLSchema","string",0,1,true), defaultResponseTemplate, defaultResponseTemplate__is_set);
    }

    /**
     * element : enableWebToCase of type {http://www.w3.org/2001/XMLSchema}boolean
     * java type: boolean
     */
    private boolean enableWebToCase__is_set = false;

    private boolean enableWebToCase;

    public boolean getEnableWebToCase() {
      return enableWebToCase;
    }

    public boolean isEnableWebToCase() {
      return enableWebToCase;
    }

    public void setEnableWebToCase(boolean enableWebToCase) {
      this.enableWebToCase = enableWebToCase;
      enableWebToCase__is_set = true;
    }

    protected void setEnableWebToCase(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("enableWebToCase", "urn:metadata.tooling.soap.sforce.com","enableWebToCase","http://www.w3.org/2001/XMLSchema","boolean",0,1,true))) {
        setEnableWebToCase(__typeMapper.readBoolean(__in, _lookupTypeInfo("enableWebToCase", "urn:metadata.tooling.soap.sforce.com","enableWebToCase","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), boolean.class));
      }
    }

    private void writeFieldEnableWebToCase(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("enableWebToCase", "urn:metadata.tooling.soap.sforce.com","enableWebToCase","http://www.w3.org/2001/XMLSchema","boolean",0,1,true), enableWebToCase, enableWebToCase__is_set);
    }

    /**
     */
    @Override
    public void write(javax.xml.namespace.QName __element,
        com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper)
        throws java.io.IOException {
      __out.writeStartTag(__element.getNamespaceURI(), __element.getLocalPart());
      writeFields(__out, __typeMapper);
      __out.writeEndTag(__element.getNamespaceURI(), __element.getLocalPart());
    }

    protected void writeFields(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper)
         throws java.io.IOException {
       writeFields1(__out, __typeMapper);
    }

    @Override
    public void load(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __typeMapper.consumeStartTag(__in);
      loadFields(__in, __typeMapper);
      __typeMapper.consumeEndTag(__in);
    }

    protected void loadFields(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
        loadFields1(__in, __typeMapper);
    }

    @Override
    public String toString() {
      java.lang.StringBuilder sb = new java.lang.StringBuilder();
      sb.append("[WebToCaseSettings ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldCaseOrigin(__out, __typeMapper);
      writeFieldDefaultResponseTemplate(__out, __typeMapper);
      writeFieldEnableWebToCase(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setCaseOrigin(__in, __typeMapper);
      setDefaultResponseTemplate(__in, __typeMapper);
      setEnableWebToCase(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "caseOrigin", caseOrigin);
      toStringHelper(sb, "defaultResponseTemplate", defaultResponseTemplate);
      toStringHelper(sb, "enableWebToCase", enableWebToCase);
    }


}