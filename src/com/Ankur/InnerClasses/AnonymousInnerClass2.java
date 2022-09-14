package com.Ankur.InnerClasses;

//4 types of inner classes:
//1.Nested Inner Class
//2.Method Local Inner Classes
//3.Static Nested Classes
//4.Anonymous Inner Classes

// Java Program to Illustrate Anonymous Inner Classes
// Declaration Without Any Name
// As an implementer of Specified interface

//2 Ways to define Anonymous classes:
//Way 2: As an implementer of the specified interface

// Interface
interface Hello {

    // Method defined inside interface
    void show();
}

// Main class
class AnonymousInnerClass2 {

    // Class implementing interface
    static Hello h = new Hello() {

        // Method 1
        // show() method inside main class
        public void show() {
            // Print statement
            System.out.println("i am in anonymous class");
        }
    };

    // Method 2
    // Main driver method
    public static void main(String[] args) {
        // Calling show() method inside main() method
        h.show();
    }
}
