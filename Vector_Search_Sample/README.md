## Vector Search Sample

- Java code allows the user to search for a keyword within a CSV file.

- Test Data is NationalUniversitiesRankings.csv

![image](https://user-images.githubusercontent.com/24220136/233833032-cb18b396-4553-4fe1-992f-4351bffe4dc8.png)

- Java API reads the file then searchs for the particular keyword

![image](https://user-images.githubusercontent.com/24220136/233833045-80be041f-7e10-4871-a8a3-3b0f2d90d8ef.png)

- `Vector Search` is implemented in the below lines (This loop is performing the vector search by comparing each element in the row to the keyword entered by the user. If a match is found, it prints the entire row where the keyword was found.):

![image](https://user-images.githubusercontent.com/24220136/233833117-86ba265a-cc00-4202-9967-cf9212e1635d.png)

- `Vector_Search_Sample.java` code explanation:

  - Code starts by importing necessary classes for file handling, exception handling, and user input.

  - The code declares a class named Test within the package `org.example.`

  - The main method serves as the entry point of the program.

  - The code defines a file path variable (file) that points to the location of the CSV file to be read.

  - It initializes a `BufferedReader` object (reader) as null. This object will be used to read the file.

  - It declares a string variable (line) to store each line read from the file.

  - It declares an integer variable (`rowIndex`) to keep track of the current row being read.

  - It initializes a Scanner object (input) to receive user input from the console.

  - The code prompts the user to enter a keyword to search within the CSV file using `System.out.print()`.

  - It reads the user's input (keyword) using `input.nextLine()` and stores it in a string variable (keyword).

  - Inside a try block, the code creates a `BufferedReader` by passing a `FileReader` object (initialized with the file path) to it. This establishes a connection to the file for reading.

  - The code enters a loop that reads each line of the file using `reader.readLine()` until the end of the file is reached (i.e., the returned line is null).

  - Within the loop, each line is split into an array of strings using a comma (,) as the delimiter. The resulting array is stored in the row variable.

  - Another loop iterates over each element in the row array and checks if the current element contains the keyword entered by the user using `index.contains(keyword)`.

  - If a match is found, the code prints the row index (`rowIndex`) and the entire line where the keyword was found using `System.out.println()`.

  - After processing each line, the rowIndex is incremented.

  - If an exception occurs during file reading, searching, or printing, it is caught in the catch block, and the exception stack trace is printed to the console using `e.printStackTrace()`.

Finally, the finally block ensures that the BufferedReader object is properly closed using the close() method. If an exception occurs while closing the reader, a RuntimeException is thrown with the original exception as its cause.

Overall, this code allows the user to search for a specific keyword within a CSV file. It utilizes Java's standard I/O classes, exception handling, and user input functionality to achieve this task.
