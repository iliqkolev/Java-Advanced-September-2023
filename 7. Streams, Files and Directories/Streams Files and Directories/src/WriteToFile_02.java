import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Set <Character> punctuation= Set.of(',','.','!','?');
        String path="D:\\JAVA ADVANCED\\7. Streams, Files and Directories\\Streams Files and Directories\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream=new FileInputStream(path);

        FileOutputStream outputStream=new FileOutputStream("write-to-file-output-txt");

        int oneByte=inputStream.read();

        while (oneByte >= 0){
            char symbol=(char) oneByte;
            if (!punctuation.contains(symbol)){
                outputStream.write(symbol);

            }
            oneByte=inputStream.read();
        }
    }
}
