import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

public class CountCharacterTypes_04 {
    public static void main(String[] args) {

        String path="D:\\JAVA ADVANCED\\8. Exercise Streams Files and Directories\\untitled\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String outputPath="D:\\JAVA ADVANCED\\8. Exercise Streams Files and Directories\\untitled\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        Set<Character> vowels=Set.of('a','e','i','o','u');
        Set<Character> punctuation=Set.of('!','.',',','?');
        int vowelsCount=0;
        int punctuationCount=0;
        int otherSymbols=0;

        try (BufferedReader reader = Files.newBufferedReader(Path.of(path));
             BufferedWriter writer= Files.newBufferedWriter(Path.of(outputPath))) {

            String line = reader.readLine();
            while (line != null){
                for (int i = 0; i < line.length(); i++) {
                    char symbol=line.charAt(i);
                    if (vowels.contains(symbol)){
                        vowelsCount++;
                    } else if (punctuation.contains(symbol)) {
                        punctuationCount++;
                    }else if (symbol != ' '){
                        otherSymbols++;
                    }
                }
                line= reader.readLine();
            }
            writer.write(String.format("Vowels: %d\n", vowelsCount));
            writer.write(String.format("Other symbols: %d\n", otherSymbols));
            writer.write(String.format("Punctuation: %d\n", punctuationCount));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
