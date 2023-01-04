package com.damian;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String pathToFile = "src/file/dataset_91022.txt";
        File file = new File(pathToFile);
        int count = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                int num = scanner.nextInt();
                if (num >= 9999) {
                    count = count + 1;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(count);

    }
}
