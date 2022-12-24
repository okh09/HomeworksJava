package homework2;

import java.io.File;

public class homework2task2 {
    public static void main(String[] args) {
        File dir = new File("src/main/resources/files");
        File[] files = dir.listFiles();
        for (File file : files) {
            String name = file.getName();
            int index = name.lastIndexOf(".");
            String extension = name.substring(index + 1, name.length());
            System.out.printf("Расширение файла %s => %s\n", name, extension);
        }
    }
}
