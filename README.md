Singleton Design Pattern

-- Used only when you want 1 instance of the class in the JVM regardless how many times it gets created.

Factory Design Pattern

-- Used when there is multiple implementations for an interface and each is created based on a specific condition e.g type
-- The logic to decide which implementation to use is moved to a different class ending with *Factory "Separation of concern principle"

Decorator Design Pattern(Structural pattern)

-- Adds additional behavior and functionality to an Object dynamically
-- Have a class that implements the interface can be an abstract or concrete class
-- The Decorator class must have an instance of the interface and an overloaded constructor were the interface is a parameter
-- Additional behavior and functionality of the Object resides in the Decorator