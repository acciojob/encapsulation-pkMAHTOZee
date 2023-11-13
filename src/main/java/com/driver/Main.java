package com.driver;

public class Main {
    public static void main(String[] args) {
        // Step 3: Create an object of class RWOnly
        RWOnly rwObject = new RWOnly();

        // Step 4: Try setting a value to 'name' directly (Error: private access)
        // rwObject.name = "John"; // Uncommenting this line will result in a compile-time error

        // Step 5: Try implementing getter and setter functions
        rwObject.setName("John");

        // Step 4 (revisited): Try printing the value using getter
        System.out.println("Name using getter: " + rwObject.getName());

        // Step 6: Set a value to 'name' in Main using setter and access it using getter
        RWOnly rwObject2 = new RWOnly();
        rwObject2.setName("Alice");
        System.out.println("Name using setter and getter: " + rwObject2.getName());
    }
}
