# Low-Level Design in Java

A collection of Java examples for practicing low-level design (LLD), object-oriented design principles, design patterns, concurrency, and common system-design components. Each example is kept in its own small project so it can be explored independently.

## Contents

- [Behavioral design patterns](#behavioral-design-patterns)
- [Creational design patterns](#creational-design-patterns)
- [Structural design patterns](#structural-design-patterns)
- [Concurrency](#concurrency)
- [System-design components](#system-design-components)
- [Getting started](#getting-started)

## Behavioral Design Patterns

Examples of patterns that define communication and responsibility between objects.

| Pattern | Example project |
| --- | --- |
| Chain of Responsibility | [ChainOfResponsibility](BehavioralDesignPattern/ChainOfResponsibility/) |
| Command | [CommandDesignPattern](BehavioralDesignPattern/CommandDesignPattern/) |
| Iterator | [IteratorDesignPattern](BehavioralDesignPattern/IteratorDesignPattern/) |
| Mediator | [MediatorDesignPattern](BehavioralDesignPattern/MediatorDesignPattern/) |
| Memento | [MementoDesignPattern](BehavioralDesignPattern/MementoDesignPattern/) |
| Observer | [ObserverDesignPattern](BehavioralDesignPattern/ObserverDesignPattern/) |
| State | [StateDesignPattern](BehavioralDesignPattern/StateDesignPattern/) |
| Strategy | [StrategyDesignPattern](BehavioralDesignPattern/StrategyDesignPattern/) |
| Template Method | [TemplateDesginPattern](BehavioralDesignPattern/TemplateDesginPattern/) |
| Visitor | [VisitorDesignPattern](BehavioralDesignPattern/VisitorDesignPattern/) |

## Creational Design Patterns

Examples focused on object creation and construction.

| Pattern | Example project |
| --- | --- |
| Abstract Factory | [AbstractDesignFactory](CreationalDesignPattern/AbstractDesignFactory/) |
| Builder | [BuilderDesignPattern](CreationalDesignPattern/BuilderDesignPattern/) |
| Factory | [FactoryDesignPattern](CreationalDesignPattern/FactoryDesignPattern/) |

## Structural Design Patterns

Examples focused on composing classes and objects into larger structures.

| Pattern | Example project |
| --- | --- |
| Adapter | [AdapterDesignPattern](StructuralDesignPattern/AdapterDesignPattern/) |
| Bridge | [BridgeDesignPattern](StructuralDesignPattern/BridgeDesignPattern/) |
| Composite | [CompositeDesignPattern](StructuralDesignPattern/CompositeDesignPattern/) |
| Decorator | [DecoratorDesignPattern](StructuralDesignPattern/DecoratorDesignPattern/) |
| Facade | [FacadeDesignPattern](StructuralDesignPattern/FacadeDesignPattern/) |

## Concurrency

- [Thread, Runnable, and Callable examples](ConcurrencyInJava/Thread_class_and_Runnable_Interface/)

## System-Design Components

- [Cache](DesignCache/Cache/): cache abstractions with in-memory storage, an LRU eviction strategy, and a write-through policy.
- [Pub/Sub](PubSubKafaka/Kafka/): an in-memory, Kafka-style topic, publisher, and subscriber model with message delivery and offset reset examples. This is a learning implementation, not a connection to an Apache Kafka broker.
- [Rate limiter](RateLimiter/RateLimiter/): a configurable rate-limiter example with a Token Bucket implementation and concurrent request demonstrations.

## Getting Started

### Requirements

- A Java Development Kit (JDK)
- An IDE such as IntelliJ IDEA, or a Java compiler and runtime on your `PATH`

The projects include IntelliJ IDEA module files (`.iml`) and Java source under `src/`. There is currently no repository-wide Maven or Gradle build, so open and run one example at a time.

### Run an example in IntelliJ IDEA

1. Clone or download this repository.
2. Open the `.iml` file for the example you want to explore, or open its project directory in IntelliJ IDEA.
3. Configure a JDK for the project if prompted.
4. Open the example's `Main.java` and run its `main` method. Some examples may use a different entry point or require running a specific class.

### Run from the command line

Compile the source files for a single example into an output directory, then run its main class with that directory on the classpath. For example, from the repository root in PowerShell:

```powershell
$source = Get-ChildItem .\RateLimiter\RateLimiter\src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d .\out $source
java -cp .\out Main
```

The entry-point class can differ between projects. Run the appropriate main class for the example you compile; avoid compiling all repository sources together because separate examples may have independent project structures.

## Repository Notes

- Examples are intended for learning and experimentation; they are not a production-ready framework.
- Naming and folder spelling follow the existing project directories.
- [LLD mind map](MindMap.webp)