package ie.atu;

import java.io.FileWriter;
import java.io.IOException;


public class WriteToFile {
    public static void main(String[] args) {

        String fileName = "file12.txt";

        try (FileWriter writer = new FileWriter(fileName))
        {
            writer.write("Content successfully written to the file");

            System.out.println("Content successfully written to the file.");
        } catch (IOException e){
            System.out.println("An error occured while writing to the file.");
            e.printStackTrace();
        }
    }
}
