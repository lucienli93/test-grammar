package test.flie;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ReadFolder {
    private static int count = 0;
    static BufferedWriter fileStream = createFile("C:\\Users\\liyizheng\\Desktop\\failFile.txt");
    public static void main(String [] args) throws IOException {
        BufferedWriter outStream = createFile("C:\\Users\\liyizheng\\Desktop\\tempSaveFile.txt");
        String rootPath = "D:\\Question_Data\\question";
//        String rootPath = "C:\\Users\\liyizheng\\Documents";
        readFile(rootPath, outStream);
        System.out.println("file number: " + count);
        outStream.close();
    }
    
    public static void readFile(String path, BufferedWriter outStream) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("directory: " + file);
                if (file.list() != null && file.list().length > 0) {
                    for (String subFile : file.list()) {
                        readFile(file.getPath() + "\\" +subFile, outStream);
                    }
                }
            } else if (file.isFile()) {
                System.out.println("file: " + file);
                try {
                    outStream.write(file.getPath());
                    outStream.newLine();
                } catch (IOException e) {
                    try {
                        fileStream.write(file.getPath());
                        outStream.newLine();
                    } catch (IOException e1) {
                        System.out.println("fail error" + file.getPath());
                        e1.printStackTrace();
                    }
                    e.printStackTrace();
                }
                count++;
            }
        }
    }
    
    private static BufferedWriter createFile(String path) {
        BufferedWriter result = null;
        File file = new File(path);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            FileOutputStream stream = new FileOutputStream(file);
            result = new BufferedWriter(new OutputStreamWriter(stream));
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
}
