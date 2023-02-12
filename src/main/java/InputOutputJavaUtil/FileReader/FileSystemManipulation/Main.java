package com.timbuchalka;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {

    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("src\\main\\java\\InputOutputJavaUtil\\FileReader\\FileSystemManipulation", "WorkingModuleFile.txt");
        printFile(path);
        path = FileSystems.getDefault().getPath( "WorkingDirectoryFile.txt");
        printFile(path);
        path = FileSystems.getDefault().getPath("src\\main\\java\\InputOutputJavaUtil\\FileReader\\FileSystemManipulation\\files", "SubdirectoryFile.txt");
        printFile(path);

        //filePath = Paths.get("/Volumes/Production/Courses/Programs/JavaPrograms/OutThere.txt");
        path = Paths.get("C:\\Users\\WAKAM\\Desktop\\Coding DOJO.txt");
        // D:\\Examples\\OutThere.txt
        printFile(path);

    }

    private static void printFile(Path path) {
        try(BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("*************************************************************************************");
        } catch(IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
