package com.pluralsight;

import java.io.*;
import java.util.*;

public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt the user for the name of the story/file
        System.out.print("Enter the name of the story file (e.g., goldilocks.txt): ");
        String fileName = scanner.nextLine();

        // 2. Setup variables for reading the file
        int lineNumber = 1;

        try {
            // We use FileReader to target the file, and BufferedReader to read it efficiently line-by-line
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("\n--- Reading Story: " + fileName + " ---");

            // Loop to read each line until the end of the file (null)
            while ((line = bufferedReader.readLine()) != null) {
                // Print the line number and the line content
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

            // Always close your readers when finished
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + fileName + "' was not found. Make sure it is in the project folder!");
        } catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file.");
        }
    }
}
