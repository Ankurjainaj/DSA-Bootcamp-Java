package com.Ankur.FileHandling;

// Java program to create a file "friendsContact.txt"
// and add a new contact in the file

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Scanner;

public class Test {

    public static void main(String[] data) {

        try {
            Scanner in = new Scanner(System.in);

            // Get the name of the contact to be updated
            // from the Command line argument
            String newName = in.next();

            // Get the number to be updated
            // from the Command line argument
            long newNumber = Long.parseLong(in.next());

            String nameNumberString;
            String name;
            long number;

            // Using file pointer creating the file.
            File file = new File("friendsContact.txt");

            if (!file.exists()) {
                // Create a new file if not exists.
                file.createNewFile();
            }

            // Opening file in reading and write mode.

            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            boolean found = false;

            // Checking whether the name of contact already exists.
            // getFilePointer() give the current offset
            // value from start of the file.
            while (raf.getFilePointer() < raf.length()) {

                // reading line from the file.
                nameNumberString = raf.readLine();

                // splitting the string to get name and number
                String[] lineSplit = nameNumberString.split(":");

                // separating name and number.
                name = lineSplit[0];
                number = Long.parseLong(lineSplit[1]);

                // if condition to find existence of record.
                if (Objects.equals(name, newName) || number == newNumber) {
                    found = true;
                    break;
                }
            }

            if (!found) {

                // Enter the if block when a record
                // is not already present in the file.
                nameNumberString = newName + ":" + newNumber;

                // writeBytes function to write a string
                // as a sequence of bytes.
                raf.writeBytes(nameNumberString);

                // To insert the next record in new line.
                raf.writeBytes(System.lineSeparator());

                // Print the message
                System.out.println(" Friend added. ");

                // Closing the resources.
                raf.close();
            }
            // The contact to be updated
            // could not be found
            else {
                // Closing the resources.
                raf.close();
                // Print the message
                System.out.println(" Input name does not exists. ");
            }
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (NumberFormatException nef) {
            System.out.println(nef);
        }
    }
}

