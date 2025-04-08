# Standard-types

Stub declarations for Salesforce platform types encoded as compilable Java.

These stub declarations help support static analysis of Apex code in [apex-ls](https://github.com/apex-dev-tools/apex-ls) but you may also find them useful for other purposes. They have been encoded in Java to get the benefit of type checking by javac so it easier to spot when something is amiss. In apex-ls JVM reflection is used to 'read' the stubs as part of the static analysis.

The library is versioned to reflect Salesforce API numbers, so currently v63.X.X matches the Salesforce Spring '25 API.

## Installation

To use the jar in a maven project add the following to your pom.xml

```xml
<dependency>
  <groupId>io.github.apex-dev-tools</groupId>
  <artifactId>standard-types</artifactId>
  <version>63.0.1</version>
</dependency>
```

### Build From Source

```sh
mvn install -Dgpg.skip=true
```

## Development

### File Templates

Included in this repo are some file templates for Intellij - they override the default Class, Interface, and Enum templates. There is also an Exception class template as they are all the same format. The templates will be used on most of the `New...` context menus/actions.

### Live Template

Intellij also supports live templates, similar to VSCode snippets. The below template can be copy/pasted into the `Settings > Editor > Live Templates` window by right clicking on the `Java` group.

```xml
<template name="stub" value="$sig$ {throw new java.lang.UnsupportedOperationException();}" description="Creates a stub method for given signature" toReformat="false" toShortenFQNames="true">
  <variable name="sig" expression="" defaultValue="public void stub()" alwaysStopAt="true" />
  <context>
    <option name="JAVA_DECLARATION" value="true" />
  </context>
</template>
```

This template lets you type `stub`, press tab and then paste in the method signature copied from Apex reference.

### Type Imports

Type imports must correctly reference Apex types. Java types like `String`,`Integer`,`Map`,`List` can make a class appear valid when it isn't. The only exception is `Object`, which is allowed.

It is important to prepare updates with [apex-ls](https://github.com/apex-dev-tools/apex-ls), and test before releasing, to make sure it can load all the platform types and spot any missing imports. It will report errors when `java.lang...` types are used.
