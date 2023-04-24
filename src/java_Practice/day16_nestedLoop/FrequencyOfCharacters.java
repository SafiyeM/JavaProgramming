package java_Practice.day16_nestedLoop;

public class FrequencyOfCharacters {


    public static void main(String[] args) {



        String str= "aabcccd";
       String result= "";


        for (int j = 0; j < str.length(); j++) { //outer loop


            char ch= str.charAt(j); // to find all ch
            int frequency= 0;

            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)){
                    frequency ++;
                }

            } // end of inner loop


            if (result.contains(""+ch)){
                continue;
            }


            result += ch + "" +frequency;


        } // ending of outer loop


        System.out.println(result);




    }
}
/*
Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character,
            then repeat it for all the remaining characters

 */