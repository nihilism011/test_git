package minimini.파일입출력;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try {
            fout = new FileWriter("File\\test.txt");
            while (true) {
                String line = sc.nextLine();
                if (line.length() == 0) break;
                fout.write(line, 0, line.length());
                fout.write("\r\n", 0, 2);
            }
            fout.close();

        }catch (IOException e){
        System.out.println("입출력 오류");
        System.out.println(e.getMessage());
        }
        sc.close();
    }
}
