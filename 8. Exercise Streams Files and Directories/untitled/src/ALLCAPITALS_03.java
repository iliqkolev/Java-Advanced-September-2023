import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ALLCAPITALS_03 {
    public static void main(String[] args) {

        String path="D:\\JAVA ADVANCED\\8. Exercise Streams Files and Directories\\untitled\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath="D:\\JAVA ADVANCED\\8. Exercise Streams Files and Directories\\untitled\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(path));
             BufferedWriter writer= Files.newBufferedWriter(Path.of(outputPath))) {

            String line = reader.readLine();
            while (line != null){
                writer.write(line.toUpperCase());
                writer.newLine();
                line= reader.readLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
