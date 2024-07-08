package minimini.파일입출력;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) {
        File src = new File("images\\image3.jpg");
        File dest = new File("File\\temp\\copyimage.jpg");
        try{
            FileInputStream fi = new FileInputStream(src);
            FileOutputStream fo = new FileOutputStream(dest);
            byte[] buf = new byte[1024*10];

            while(true){
                int n = fi.read(buf);
                fo.write(buf,0,n);
                if(n<buf.length)break;
            }

        }catch (IOException e){
            System.out.println("파일 복사 오류");
            System.out.println(e.getMessage());
        }
    }
}
