package minimini.파일입출력;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileIo {
    public static void main(String[] args) {
        FileReader fin = null;

        try {
            fin = new FileReader("File\\system.ini");
            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
            fin.close();
        }
        catch(IOException e){
            System.out.println("입출력 오류");
            System.out.println(e.getMessage());
        }
    }
}
