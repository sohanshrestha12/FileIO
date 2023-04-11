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
            int newChar;
            FileReader fileReader = new FileReader(file);
            while (true){
                try {
                    if (!((newChar = fileReader.read()) != -1)) break;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                System.out.print((char)newChar );
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}