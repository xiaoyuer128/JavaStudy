package study230817.demo02;

import java.io.File;

public class demo02Lianxi {
    public static void main(String[] args) {


    }
    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File f:files
             ) {
            System.out.println(files);
        }

    }
}
