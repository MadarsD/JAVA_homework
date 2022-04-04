package io.codelex.advancedtest.exercise4;

import java.io.*;


public class InputOutput {


    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("E:\\Codelex_JAVA\\Codelex\\JAVA_homework\\JAVA_homework\\src\\main\\java\\io\\codelex\\advancedtest\\exercise4\\file.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("E:\\Codelex_JAVA\\Codelex\\JAVA_homework\\JAVA_homework\\src\\main\\java\\io\\codelex\\advancedtest\\exercise4\\copy.txt"));

        String line;

        while ((line = in.readLine()) != null) {
            StringBuilder builder = new StringBuilder(line);
            out.write(String.valueOf(builder.reverse()));
        }

        in.close();
        out.close();
    }

}
