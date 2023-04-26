package java_programming_lessons.day16_nestedLoop;

public class FrequencyOfWord {
    public static void main(String[] args) {


        String str= "java jaVa jAva Java";
        String word= "JavA";
        int count= 0;

        str= str.toLowerCase();
        word= word.toLowerCase();


        while (str.contains(word)){
            count++;
            str = str.replaceFirst(word, "");
        }

        System.out.println(count);


    }
}
/*
3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4

  "xxyyyzzz"

 */