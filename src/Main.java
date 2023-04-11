import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("Notepad.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Hello World\n");

        }catch (IOException e){
            throw new RuntimeException(e);
        }
        try {
            FileReader fileReader = new FileReader(file);
            while ()
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}