package io.github.mathew512.Exercise.java_se_012;

public class ComputerDemo {
    public static void main(String[] args) {
        // Create outer class instance
        Computer comp1 = new Computer("Dell", "XPS 15", 1500.0);

        // Create static nested class instance (no outer object needed)
        Computer.Processor proc1 = new Computer.Processor("Intel i7", 3.5, 8);

        // Create inner class instance (needs outer object)
        Computer.Memory mem1 = comp1.new Memory(16, 512);

        // Display info
        proc1.displayProcessorInfo();
        mem1.displayMemoryInfo();

        // Another example
        Computer comp2 = new Computer("Apple", "MacBook Pro", 2500.0);
        Computer.Processor proc2 = new Computer.Processor("M1 Pro", 3.2, 10);
        Computer.Memory mem2 = comp2.new Memory(32, 1000);

        proc2.displayProcessorInfo();
        mem2.displayMemoryInfo();
    }
}
/* - Static nested class (Processor) can be instantiated without an outer class instance.

 - Inner class (Memory) requires an instance of the outer class (Computer) to be created.

 - Inner class can access outer class's instance members directly.

 - Demonstrates encapsulation and organization of related classes. */