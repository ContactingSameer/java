import java.io.*;

public class FileInputOutputExample {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try {
            // Create a FileInputStream object to read data from the input file
            FileInputStream fis = new FileInputStream(inputFileName);

            // Create a FileOutputStream object to write data to the output file
            FileOutputStream fos = new FileOutputStream(outputFileName);

            // Read data from the input file and write it to the output file
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }

            // Close the input and output streams
            fis.close();
            fos.close();

            System.out.println("Data has been written to " + outputFileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
