package java_programming_lessons.day16_nestedLoop;

public class NestedLoopPractice {
    public static void main(String[] args) {




        String str = "aaabbccccddeeeeff";

        String result = "";  // "bdf"

        /*
        Find the ch in String which appears twice only
         */



        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character of str -->
            int count = 0;                           // char ch= str.charAt(0) this is only for first ch
                                                     // if we want i.e. second ch, we need to use char ch= str.charAt(1);
                                                      // and so on... therefor we create another loop to get every single of ch in string


            for (int i = 0; i < str.length(); i++) { // responsible for comparing ch to each character of str and return the frequency of ch
                if(str.charAt(i) == ch){  // if each character of string equal to ch
                    count++;             // then add by one
                }
            }

            if(count == 2 && !result.contains(""+ ch)){ // in order to avoid duplication of the ch --if the result does not contain 'b', then add it to result
                result += ch;                           // i.e. bbddff --> result should be 'bdf' - without duplication
            }

        }


        System.out.println(result);






    }
}
