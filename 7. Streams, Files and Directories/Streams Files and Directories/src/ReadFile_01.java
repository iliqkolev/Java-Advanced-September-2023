import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String path="D:\\JAVA ADVANCED\\7. Streams, Files and Directories\\Streams Files and Directories\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (FileInputStream inputStream= new FileInputStream(path)){

            int oneByte=inputStream.read();
            while (oneByte >= 0){
                System.out.print(Integer.toBinaryString(oneByte) + " ");
                oneByte=inputStream.read();
            }
        }catch (IOException e) {
        }
    }
}
