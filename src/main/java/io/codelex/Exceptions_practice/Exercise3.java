package io.codelex.Exceptions_practice;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void cat(File file) throws IOException {
        //TODO - fix this method so it compiles
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error - file does not exist or has invalid name");
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //This is a valid link to file, that contains a link to codelex zoom room!
        // If you change some characters of the link program will trow error!
        File myObj = new File("C:\\Users\\User\\Desktop\\codelex zoom.txt");
        cat(myObj);
    }
}
