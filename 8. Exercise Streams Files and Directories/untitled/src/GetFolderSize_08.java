import java.io.File;

import static java.nio.file.Files.exists;

public class GetFolderSize_08 {
    public static void main(String[] args) {

        String path="D:\\JAVA ADVANCED\\8. Exercise Streams Files and Directories\\untitled\\src\\04-Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File directory=new File(path);
        int size=0;

            if (directory.isDirectory()){
        File[] files = directory.listFiles();

                for (File file : files) {
                    if (!file.isDirectory()){
                       size += file.length();
                    }
                }
            }

        System.out.printf("Folder size: %d",size);







    }
}
