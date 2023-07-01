# Java-CSV-API
- CSV sample program is implemented inside the `CSV_Read_Sample` folder
- The Java program that reads a `*.csv` file and displays its contents in a tabular format.

## CSV (Comma Separated Values) sample Java api

- Java program reads a `*.csv` file and prints its contents to the console. It utilizes Java's standard I/O classes to perform file operations and exception handling to handle potential errors.

- Sample data: testData.csv

![image](https://user-images.githubusercontent.com/24220136/233832939-28349291-b299-4a38-9793-1ad6493b7222.png)

- Java api reads the file then outputs the data 

![image](https://user-images.githubusercontent.com/24220136/233832923-b73f1e16-b667-4054-b638-a8bf38ec69bb.png)

- `CSV_Read_Sample.java` explanation:

  - The code declares a class named Test within the package org.example.

  - The main method serves as the entry point of the program.

  - The code defines a file path variable (file) that points to the location of the CSV file to be read.

  - It initializes a BufferedReader object (reader) as null. This object will be used to read the file.

  - Inside a try block, the code creates a BufferedReader by passing a FileReader object (initialized with the file path) to it. This establishes a connection to the file for reading.

  - The code enters a loop that reads each line of the file using reader.readLine() until the end of the file is reached (i.e., the returned line is null).

  - Within the loop, each line is split into an array of strings using a comma (,) as the delimiter. The resulting array is stored in the row variable.

  - Another loop iterates over each element in the row array and prints it to the console using System.out.printf(). The %-20s formatting ensures left alignment and a minimum width of 20 characters for each printed value.

  - After printing all values in a row, a newline character is printed using System.out.println() to move to the next line.

  - If an exception occurs during file reading or printing, it is caught in the catch block, and the exception stack trace is printed to the console using e.printStackTrace().

  - Finally, the finally block ensures that the BufferedReader object is properly closed using the close() method. If an exception occurs while closing the reader, a RuntimeException is thrown with the original exception as its cause.

-------------------------------------

# Vector-Search

- Vector Search program is implemented in the following folder: `Vector_Search_Sample` 
- The Java program that allows the user to search for a keyword in a `*.csv file`. The program prompts the user to enter a keyword, reads the input, and then opens a CSV file specified by the file path. It reads the file line by line and checks if each line contains the keyword. If a match is found, it prints the row index and the entire line. Finally, it closes the file and handles any exceptions that may occur during the file reading process.
- Overall, this code demonstrates a simple file handling operation in Java, where a *.csv file is read, and a keyword search is performed on its contents.

