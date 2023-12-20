import java.io.*;


public class SumLines_01 {
    public static void main(String[] args) {

        String path="D:\\JAVA ADVANCED\\8. Exercise Streams Files and Directories\\untitled\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        try (BufferedReader reader=new BufferedReader(new FileReader(path));) {

            String line= reader.readLine();

            while (line != null){
                long sum=0;
                for (char c : line.toCharArray()) {
                    sum  += c;
                }
                System.out.println(sum);
                line= reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
