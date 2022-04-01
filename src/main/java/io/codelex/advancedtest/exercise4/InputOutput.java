package io.codelex.advancedtest.exercise4;

import java.io.*;



public class InputOutput {


    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("src/main/java/io/codelex/advancedtest/exercise4/File.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("src/main/java/io/codelex/advancedtest/exercise4/copy.txt"));

        String line;

        while((line = in.readLine()) != null){
            out.write(line);
        }

        in.close();
        out.close();
    }


}
