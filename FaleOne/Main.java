package FaleOne;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("dzfile.txt");
        if(!file.exists()) {
            try {
                file.createNewFile();
                writeFile("dzfile.txt","read this file)");
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        String content = readFile("dzfile.txt");
        System.out.println(content);

    }

    private static void writeFile(String filePath, String content){
        try(OutputStream outputStream = new FileOutputStream(filePath, false)){
            byte [] bytes = content.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(String filePah){

        StringBuilder content = new StringBuilder();

        try(InputStream inputStream = new FileInputStream(filePah)){
            int ch;
            while((ch = inputStream.read()) != -1) {
                content.append((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }
}
