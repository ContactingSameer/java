import java.io.File;

public class ListFilesDemo {
    public static void main(String[] args) {
        // Specify the directory to search
        File directory = new File("E:\\MCA LAB\\19.JAVA program to list all the files in a directory including the files present in all its subdirectories");

        // Call the recursive method to list all files
        listFiles(directory);
    }

    public static void listFiles(File directory) {
        // Get all files and directories in the specified directory
        File[] files = directory.listFiles();

        // Loop through each file and directory
        for (File file : files) {
            // If it's a file, print its name
            if (file.isFile()) {
                System.out.println(file.getAbsolutePath());
            }
            // If it's a directory, recursively call the method to list its files
            else if (file.isDirectory()) {
                listFiles(file);
            }
        }
    }
}
