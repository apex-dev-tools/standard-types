# AI Coding Agent Instructions for Standard-Types

## Project Overview

This repository provides Java stub declarations for Salesforce platform types to support static analysis in apex-ls. All classes are compilation-compatible but throw `UnsupportedOperationException` at runtime since they're analysis stubs, not implementations.

## Architecture & Package Structure

### Core Namespace Pattern

- **Root package**: `com.nawforce.runforce`
- **Namespace mapping**: Each Salesforce namespace becomes a Java package (e.g., `System` → `com.nawforce.runforce.System`)
- **Cross-references**: Types reference each other using proper `com.nawforce.runforce.*` imports, never native Java types (except `Object`)

### Key Package Categories

- **`System/`** - Core Apex types (String, Integer, List, Map, Database operations)
- **`Schema/`** - Metadata and reflection types (SObjectType, DescribeSObjectResult)
- **`ConnectApi/`** - REST API representations and service classes
- **`Database/`** - DML operation results and batch processing interfaces
- **`SObjectStubs/`** - Standard object stubs (User, AuthProvider, etc.)
- **`aiplatform/`** - AI platform service types (newer additions)

## Development Patterns

### Stub Implementation Pattern

Every method follows this exact pattern:

```java
@SuppressWarnings("unused")
public class ExampleClass {
    public ReturnType methodName(ParamType param) {
        throw new java.lang.UnsupportedOperationException();
    }
}
```

### Type Import Rules ⚠️

- **ALWAYS use** `com.nawforce.runforce.System.String` (not `java.lang.String`)
- **ALWAYS use** `com.nawforce.runforce.System.Integer` (not `java.lang.Integer`)
- **ALWAYS use** `com.nawforce.runforce.System.List` (not `java.util.List`)
- **ONLY exception**: `Object` can reference native Java type

### Class Structure Pattern

```java
package com.nawforce.runforce.PackageName;

import com.nawforce.runforce.System.String;  // Correct import

@SuppressWarnings("unused")
public class ClassName {
    public String field;  // Public fields for data classes

    protected ClassName() {throw new java.lang.UnsupportedOperationException();}  // Constructor

    public String getField() {throw new java.lang.UnsupportedOperationException();}  // Methods
}
```

## Build & Development

### Maven Build

```bash
mvn install -Dgpg.skip=true  # Skip GPG signing for local builds
```

### Version Strategy

- Versions track Salesforce API releases (e.g., v64.X.X = Summer '25 API)
- Built for Java 1.8 compatibility for wider tooling support

### File Organization

- No tests (stubs are compilation-only)
- `options/field-service.txt` - Lists Field Service related types
- IntelliJ templates available for rapid stub creation using live template `stub`

## Common Tasks

### Adding New Salesforce Types

1. Determine correct package based on Salesforce namespace
2. Use IntelliJ `stub` live template or copy existing similar class
3. Ensure all imports use `com.nawforce.runforce.*` types
4. Add `@SuppressWarnings("unused")` annotation
5. Verify compilation with `mvn compile`

### Cross-Package Dependencies

When types reference each other across packages, always use full package imports:

```java
// In ConnectApi package referencing System types
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.List;
```

### Static Analysis Integration

These stubs are consumed by apex-ls via JVM reflection - the structure and method signatures must exactly match Salesforce platform APIs for static analysis accuracy.

## Salesforce API Version Updates

### Update Process Overview

This repository is the **first step** in a multi-stage process for updating Apex LS with new Salesforce API versions:

1. **Standard-types update** (this repo) - Add new platform types from Salesforce release notes
2. **SObject-types update** - Generate org-specific types using describe calls
3. **Apex-ls integration** - Update dependencies and validate with comprehensive tests

### Platform Types Update Workflow

#### 1. Research New API Changes

- Review [Salesforce Release Notes](https://help.salesforce.com/s/articleView?id=release-notes.salesforce_release_notes.htm) sections:
  - `Development > Apex` - Language feature changes
  - `Development > New and Changed Items for Developers > Apex: New and Changed Items` - Updated namespaces and classes
  - `Development > ConnectApi` - API service updates
  - Beta features under `Development` (Analytics, AI/Einstein, Wave)

#### 2. Cross-reference with Apex Reference

- Use [Apex Reference Guide](https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_ref_guide.htm) to get exact method signatures
- Look up new classes and namespaces identified in release notes
- Verify parameter types and return types match exactly
- **Expect PDF context**: Apex Reference Guide PDF should be provided to cross-reference method signatures, parameter types, and relationships between classes within a single context window

#### 3. Implementation Steps

1. Create new classes following established patterns in appropriate `com.nawforce.runforce.*` packages
2. Update existing classes with new methods/fields
3. Ensure all new imports use `com.nawforce.runforce.*` types
4. Build and verify: `mvn compile`
5. Reference previous API update PRs for examples (e.g., [API 61 changes](https://github.com/apex-dev-tools/standard-types/pull/26/files))

#### 4. Integration Testing

After publishing updated standard-types, apex-ls tests will validate:

- **Type count validation** - Update count in `PlatformTypesValidationTest`
- **`All outer types are valid`** - Catches missing `com.nawforce.runforce.*` imports
- **`Exceptions are valid`** - Ensures Exception classes properly extend `System.Exception`

Common failures: `Reference to non-platform type java.lang...` errors indicate missing Apex type imports.

## Sources

- [apex-ls repository](https://github.com/apex-dev-tools/apex-ls) - The Apex Language Server that consumes these stubs
- [API Updates Documentation](https://github.com/apex-dev-tools/apex-ls/blob/main/doc/API_Updates.md) - Detailed update process workflow
- [sobject-types repository](https://github.com/apex-dev-tools/sobject-types) - Companion repository for SObject type stubs
- [Salesforce Release Notes](https://help.salesforce.com/s/articleView?id=release-notes.salesforce_release_notes.htm) - Official API change documentation
- [Apex Reference Guide](https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_ref_guide.htm) - Method signatures and type definitions
