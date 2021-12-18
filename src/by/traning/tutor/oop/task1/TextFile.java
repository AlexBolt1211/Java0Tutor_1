package by.traning.tutor.oop.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать,
//вывести на консоль содержимое, дополнить, удалить.
public class TextFile {
    public File directory;
    public File file;

    public TextFile(File directory, File file){
        this.directory = directory;
        this.file = file;
    }

    // создать текстовый файл
    public void create() throws IOException {
         if (!directory.mkdir()) {
             if (!file.createNewFile()){
                 System.out.println(" " + file.getAbsolutePath());
             } ;
         }
    }
    // удалить файл
    public void deleteFile(){
        file.delete();
    }

    // удалить директорию
    public void deleteDirectory(){
        directory.delete();
    }

}
