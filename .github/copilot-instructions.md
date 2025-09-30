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
  public ReturnType methodName(ParamType param) {throw new java.lang.UnsupportedOperationException();}
}
```

### Type Import Rules ⚠️

- **ALWAYS use** `com.nawforce.runforce.System.String` (not `java.lang.String`)
- **ALWAYS use** `com.nawforce.runforce.System.Integer` (not `java.lang.Integer`)
- **ALWAYS use** `com.nawforce.runforce.System.List` (not `java.util.List`)
- **ONLY exception**: `Object` can reference native Java type

### Class Structure Patterns

#### Static Method Classes

Classes with only static methods (no instance state):

```java
@SuppressWarnings("unused")
public class StaticMethodClass {
  public static ReturnType methodName(ParamType param) {throw new java.lang.UnsupportedOperationException();}
}
```

#### Instance Classes

Classes with non-static methods/properties require public constructors:

```java
@SuppressWarnings("unused")
public class InstanceClass {
  public String field;  // Public fields as documented

  public InstanceClass() {throw new java.lang.UnsupportedOperationException();}  // Default constructor
  public InstanceClass(String param) {throw new java.lang.UnsupportedOperationException();}  // Documented constructors

  public String getField() {throw new java.lang.UnsupportedOperationException();}  // Only documented methods
}
```

### Documentation Adherence Rules

- **Method/property order**: Maintain alphabetical order as documented in Salesforce API docs
- **Getters/setters**: Only create methods explicitly documented; do not auto-generate
- **Constructor patterns**: Static method classes have no constructors; instance classes have public default constructor plus any documented constructors
- **Copyright year**: Use current year (2025) for newly created files

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

## Common Tasks

### Adding New Salesforce Types

1. **Determine package location** based on Salesforce namespace mapping
2. **Set copyright year** to current year (2025) for new files
3. **Preserve documentation order** - maintain alphabetical method/property order from API docs
4. **Choose class pattern**:
   - Static method classes: No constructors
   - Instance classes: Public default constructor + documented constructors
5. **Import only `com.nawforce.runforce.*` types** (except `Object`)
6. **Add `@SuppressWarnings("unused")` annotation**
7. **Create only documented methods** - no auto-generated getters/setters
8. **Add documentation link** - include comment above class: `// https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/[class-doc-page].htm`
9. **Verify compilation** with `mvn compile`

### Updating Existing Classes

1. **Maintain existing method order** when adding new methods
2. **Follow alphabetical insertion** for new methods per API documentation
3. **Preserve existing constructor patterns** (static vs instance class style)
4. **Add documentation link** if not already present - include comment above class with Salesforce documentation URL
5. **Validate with compilation** after changes

### Cross-Package Dependencies

When types reference each other across packages, always use full package imports:

```java
// In ConnectApi package referencing System types
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.List;
```

### Static Analysis Integration

These stubs are consumed by apex-ls via JVM reflection - the structure and method signatures must exactly match Salesforce platform APIs for static analysis accuracy.

## Sources

- [apex-ls repository](https://github.com/apex-dev-tools/apex-ls) - The Apex Language Server that consumes these stubs
- [API Updates Documentation](https://github.com/apex-dev-tools/apex-ls/blob/main/doc/API_Updates.md) - Detailed update process workflow
- [sobject-types repository](https://github.com/apex-dev-tools/sobject-types) - Companion repository for SObject type stubs
- [Salesforce Release Notes](https://help.salesforce.com/s/articleView?id=release-notes.salesforce_release_notes.htm) - Official API change documentation
- [Apex Reference Guide](https://developer.salesforce.com/docs/atlas.en-us.apexref.meta/apexref/apex_ref_guide.htm) - Method signatures and type definitions
