package Demo.io_text;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOFile {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    public static void writeFile() {
        String str = "File \n Handling in Java using FileWrite and FileReader";
        try {
            FileWriter fileWriter = new FileWriter("src/Demo/io_text/output.txt");
            for (int i = 0; i < str.length(); i++) {
                fileWriter.write(str.charAt(i));
            }
            System.out.println("Writing successful");
            fileWriter.close();
        } catch (IOException e) {
            System.err.println("Có lỗi!!!");
        }
    }

    public static void readFile() {
        try {
            int ch;
            FileReader fileReader = null;
            try {
                fileReader = new FileReader("src/Demo/io_text/output.txt");
            } catch (FileNotFoundException fe) {
                System.err.println("File not found");
            }
            if (fileReader != null) {
                while ((ch = fileReader.read()) != -1) {
                    System.out.print((char) ch);
                }
                while ((ch = fileReader.read()) != -1) {
                    System.out.print(ch + "; ");
                }
                fileReader.close();
            }
        } catch (IOException e) {
            System.err.println("Có lỗi!!!");
        } catch (Exception e) {
            System.err.println("Có lỗi to hơn");
        }
    }
}
