package basic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileList {

    public static void main(String[] args) {
        listFilesForFolder(new File("./"));

        System.out.println("==============================");
        getFileList("./");
    }

    public static void listFilesForFolder(File folder) {
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getPath());
            }
        }
    }

    public static void getFileList(String path) {
        try {
            Files.walk(Paths.get(path)).forEach(filePath -> {
                if(Files.isRegularFile(filePath)) {
                    System.out.println(filePath);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
