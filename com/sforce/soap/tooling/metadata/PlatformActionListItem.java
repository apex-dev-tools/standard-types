package com.sforce.soap.tooling.metadata;

/**
 * This is a generated class for the SObject Enterprise API.
 * Do not edit this file, as your changes will be lost.
 */
public class PlatformActionListItem implements com.sforce.ws.bind.XMLizable {

    /**
     * Constructor
     */
    public PlatformActionListItem() {}

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
     * element : actionName of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean actionName__is_set = false;

    private java.lang.String actionName;

    public java.lang.String getActionName() {
      return actionName;
    }

    public void setActionName(java.lang.String actionName) {
      this.actionName = actionName;
      actionName__is_set = true;
    }

    protected void setActionName(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("actionName", "urn:metadata.tooling.soap.sforce.com","actionName","http://www.w3.org/2001/XMLSchema","string",1,1,true))) {
        setActionName(__typeMapper.readString(__in, _lookupTypeInfo("actionName", "urn:metadata.tooling.soap.sforce.com","actionName","http://www.w3.org/2001/XMLSchema","string",1,1,true), java.lang.String.class));
      }
    }

    private void writeFieldActionName(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("actionName", "urn:metadata.tooling.soap.sforce.com","actionName","http://www.w3.org/2001/XMLSchema","string",1,1,true), actionName, actionName__is_set);
    }

    /**
     * element : actionType of type {urn:tooling.soap.sforce.com}PlatformActionType
     * java type: com.sforce.soap.tooling.PlatformActionType
     */
    private boolean actionType__is_set = false;

    private com.sforce.soap.tooling.PlatformActionType actionType;

    public com.sforce.soap.tooling.PlatformActionType getActionType() {
      return actionType;
    }

    public void setActionType(com.sforce.soap.tooling.PlatformActionType actionType) {
      this.actionType = actionType;
      actionType__is_set = true;
    }

    protected void setActionType(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("actionType", "urn:metadata.tooling.soap.sforce.com","actionType","urn:tooling.soap.sforce.com","PlatformActionType",1,1,true))) {
        setActionType((com.sforce.soap.tooling.PlatformActionType)__typeMapper.readObject(__in, _lookupTypeInfo("actionType", "urn:metadata.tooling.soap.sforce.com","actionType","urn:tooling.soap.sforce.com","PlatformActionType",1,1,true), com.sforce.soap.tooling.PlatformActionType.class));
      }
    }

    private void writeFieldActionType(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("actionType", "urn:metadata.tooling.soap.sforce.com","actionType","urn:tooling.soap.sforce.com","PlatformActionType",1,1,true), actionType, actionType__is_set);
    }

    /**
     * element : sortOrder of type {http://www.w3.org/2001/XMLSchema}int
     * java type: int
     */
    private boolean sortOrder__is_set = false;

    private int sortOrder;

    public int getSortOrder() {
      return sortOrder;
    }

    public void setSortOrder(int sortOrder) {
      this.sortOrder = sortOrder;
      sortOrder__is_set = true;
    }

    protected void setSortOrder(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.verifyElement(__in, _lookupTypeInfo("sortOrder", "urn:metadata.tooling.soap.sforce.com","sortOrder","http://www.w3.org/2001/XMLSchema","int",1,1,true))) {
        setSortOrder((int)__typeMapper.readInt(__in, _lookupTypeInfo("sortOrder", "urn:metadata.tooling.soap.sforce.com","sortOrder","http://www.w3.org/2001/XMLSchema","int",1,1,true), int.class));
      }
    }

    private void writeFieldSortOrder(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("sortOrder", "urn:metadata.tooling.soap.sforce.com","sortOrder","http://www.w3.org/2001/XMLSchema","int",1,1,true), sortOrder, sortOrder__is_set);
    }

    /**
     * element : subtype of type {http://www.w3.org/2001/XMLSchema}string
     * java type: java.lang.String
     */
    private boolean subtype__is_set = false;

    private java.lang.String subtype;

    public java.lang.String getSubtype() {
      return subtype;
    }

    public void setSubtype(java.lang.String subtype) {
      this.subtype = subtype;
      subtype__is_set = true;
    }

    protected void setSubtype(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      __in.peekTag();
      if (__typeMapper.isElement(__in, _lookupTypeInfo("subtype", "urn:metadata.tooling.soap.sforce.com","subtype","http://www.w3.org/2001/XMLSchema","string",0,1,true))) {
        setSubtype(__typeMapper.readString(__in, _lookupTypeInfo("subtype", "urn:metadata.tooling.soap.sforce.com","subtype","http://www.w3.org/2001/XMLSchema","string",0,1,true), java.lang.String.class));
      }
    }

    private void writeFieldSubtype(com.sforce.ws.parser.XmlOutputStream __out, com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      __typeMapper.writeObject(__out, _lookupTypeInfo("subtype", "urn:metadata.tooling.soap.sforce.com","subtype","http://www.w3.org/2001/XMLSchema","string",0,1,true), subtype, subtype__is_set);
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
      sb.append("[PlatformActionListItem ");
      toString1(sb);

      sb.append("]\n");
      return sb.toString();
    }

    private void toStringHelper(StringBuilder sb, String name, Object value) {
      sb.append(' ').append(name).append("='").append(com.sforce.ws.util.Verbose.toString(value)).append("'\n");
    }

    private void writeFields1(com.sforce.ws.parser.XmlOutputStream __out,
         com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException {
      writeFieldActionName(__out, __typeMapper);
      writeFieldActionType(__out, __typeMapper);
      writeFieldSortOrder(__out, __typeMapper);
      writeFieldSubtype(__out, __typeMapper);
    }

    private void loadFields1(com.sforce.ws.parser.XmlInputStream __in,
        com.sforce.ws.bind.TypeMapper __typeMapper) throws java.io.IOException, com.sforce.ws.ConnectionException {
      setActionName(__in, __typeMapper);
      setActionType(__in, __typeMapper);
      setSortOrder(__in, __typeMapper);
      setSubtype(__in, __typeMapper);
    }

    private void toString1(StringBuilder sb) {
      toStringHelper(sb, "actionName", actionName);
      toStringHelper(sb, "actionType", actionType);
      toStringHelper(sb, "sortOrder", sortOrder);
      toStringHelper(sb, "subtype", subtype);
    }


}