import java.io.*;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes_02 {
    public static void main(String[] args) {
        String path="D:\\JAVA ADVANCED\\8. Exercise Streams Files and Directories\\untitled\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        long sum= 0;
        try (BufferedReader br= Files.newBufferedReader(Path.of(path))){

            String line= br.readLine();

            while (line != null){

                for (char c : line.toCharArray()) {
                    sum += c;
                }

                line= br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sum);
    }
}
