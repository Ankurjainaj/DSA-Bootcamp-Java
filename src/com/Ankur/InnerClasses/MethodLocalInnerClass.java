package com.Ankur.InnerClasses;

//4 types of inner classes:
//1.Nested Inner Class
//2.Method Local Inner Classes
//3.Static Nested Classes
//4.Anonymous Inner Classes

// Java Program to Illustrate Inner class can be
// declared within a method of outer class

// Class 1
// Outer class
class Outer1 {

    // Method inside outer class
    void outerMethod() {

        // Print statement
        System.out.println("inside outerMethod");
        final int x = 90;
        System.out.println("x=" + x);

        // Class 2
        // Inner class
        // It is local to outerMethod()
        class Inner {

            // Method defined inside inner class
            void innerMethod() {

                // Print statement whenever inner class is
                // called
                System.out.println("inside innerMethod");
                System.out.println("x=" + x);
            }
        }

        // Creating object of inner class
        Inner y = new Inner();

        // Calling over method defined inside it
        y.innerMethod();
    }
}

// Class 3
// Main class
class MethodLocalInnerClass {

    // Main driver method
    public static void main(String[] args) {

        // Creating object of outer class inside main()
        // method
        Outer1 x = new Outer1();

        // Calling over the same method
        // as we did for inner class above
        x.outerMethod();
    }
}

