import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers_04 {
    public static void main(String[] args) throws FileNotFoundException {

        String path="D:\\JAVA ADVANCED\\7. Streams, Files and Directories\\Streams Files and Directories\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        Scanner scanner=new Scanner(new FileInputStream(path));

        PrintWriter printer=new PrintWriter(new FileOutputStream("extract-integer-output.txt"));

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                printer.println(scanner.next());
            }
            scanner.next();
        }
        printer.close();
    }
}
