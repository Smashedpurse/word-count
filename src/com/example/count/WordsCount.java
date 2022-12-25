package com.example.count;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordsCount {

    public String readFile (File file){

        String lines = "";

        try{
            Scanner sc = new Scanner(file);

            while(sc.hasNextLine()){
                lines += sc.hasNextLine();
                System.out.println(lines);
            }

        }catch (FileNotFoundException e){
            System.out.println( "Exepction with the file" + e );
        }


        return null;

    }

}
