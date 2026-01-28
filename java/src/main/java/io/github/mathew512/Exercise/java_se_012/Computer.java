package io.github.mathew512.Exercise.java_se_012;

public class Computer {
    // Outer class members
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Static Nested Class: Processor
    public static class Processor {
        private String type;
        private double speed; // GHz
        private int cores;

        public Processor(String type, double speed, int cores) {
            this.type = type;
            this.speed = speed;
            this.cores = cores;
        }

        public void displayProcessorInfo() {
            System.out.println("Processor: " + type + ", " + speed + "GHz, " + cores + " cores");
        }
    }

    // Inner Class: Memory
    public class Memory {
        private int ram;     // GB
        private int storage; // GB

        public Memory(int ram, int storage) {
            this.ram = ram;
            this.storage = storage;
        }

        public void displayMemoryInfo() {
            // Inner class can access outer class instance members
            System.out.println("Computer: " + brand + " " + model + " ($" + price + ")");
            System.out.println("Memory: " + ram + "GB RAM, " + storage + "GB Storage");
        }
    }
}

