package by.traning.tutor.oop.task1;

import java.io.File;
import java.io.IOException;

public class TextMain {
    public static void main(String[] args) throws IOException {

       // java.io.File file = new java.io.File("tyu.txt");
       // file.createNewFile();
       // System.out.println(file.getAbsolutePath());
        TextFile textFile = new TextFile(new File("E:\\Training\\Java0Tutor_1\\"),new File("move.txt"));

    }
}
