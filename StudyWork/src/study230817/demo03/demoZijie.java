package study230817.demo03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class demoZijie {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        fos.write(22);
        fos.write(23);
        fos.close();
        FileInputStream fis = new FileInputStream("a.txt");
        /*int len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        len = fis.read();
        System.out.println(len);
        fis.close();*/
        int len = 0;
        while(len!=-1){
            len = fis.read();
            System.out.println(len);
        }

    }
}
