package java_programming_lessons.day10_string;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(String[] args) throws IOException {

       Scanner scan= new Scanner( Path.of("src/day_10_string/ClassNotes.txt.txt.txt") ); //-->> to read a file


        System.out.println( scan.nextLine()); // returns first line of our text
        System.out.println(scan.hasNext()); // true



scan.close();
    }

}
