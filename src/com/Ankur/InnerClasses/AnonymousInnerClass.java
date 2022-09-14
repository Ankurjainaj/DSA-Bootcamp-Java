package com.Ankur.InnerClasses;

//4 types of inner classes:
//1.Nested Inner Class
//2.Method Local Inner Classes
//3.Static Nested Classes
//4.Anonymous Inner Classes

// Java Program to Illustrate Anonymous Inner classes
// Declaration Without any Name
// As a subclass of the specified type

// Class 1
// Helper class

//2 Ways to define Anonymous classes:
//Way 1: As a subclass of the specified type

class Demo {

    // Method of helper class
    void show() {
        // Print statement
        System.out.println("I am in show method of super class");
    }
}

// Class 2
// Main class
class AnonymousInnerClass {

    // An anonymous class with Demo as base class
    static Demo d = new Demo() {
        // Method 1
        // show() method
        void show() {
            // Calling method show() via super keyword
            // which refers to parent class
            super.show();

            // Print statement
            System.out.println("I am in AnonymousInner class");
        }
    };

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        // Calling show() method inside main() method
        d.show();
    }
}

