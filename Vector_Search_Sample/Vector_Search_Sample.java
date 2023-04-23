package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String file = "C://elastic_stack//logstash-8.6.2//data2//NationalUniversitiesRankings.csv";
        BufferedReader reader = null;
        String line = "";
        int rowIndex = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter keyword to search: ");
        String keyword = input.nextLine();

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                for (String index : row) {
                    if (index.contains(keyword)) {
                        System.out.println("Row " + rowIndex + ": " + line);
                        break;
                    }
                }
                rowIndex++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}



