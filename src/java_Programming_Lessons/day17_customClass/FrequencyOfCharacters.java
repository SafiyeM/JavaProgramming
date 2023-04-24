package java_Programming_Lessons.day17_customClass;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str= "aabcccd";

        String result= ""; // a2b1c3d1
                           // a b c d
                           // 2 1 3 1


        for (int j = 0; j < str.length(); j++) { //outer loop -> to find the frequency of each ch with help of inner loop


            char ch= str.charAt(j);    // to find the first ch 'a' if we give 0 in charAt(0)
            int count= 0;


            for (int i = 0; i < str.length(); i++) { // to get every ch of the string --> inner loop

                if (str.charAt(i) == ch){     //looks for if there is matching character of the string with 'ch'
                    count ++; //when 'ch' appears add by one      // we find the frequency of one character with this way

                }

               // System.out.println("count = " + count); //--> we print to see frequency of - a = 2

            }// end of inner loop


            if (result.contains(""+ch)){ //if the result already has one ch i.e. 'a'  then we say skip it
                continue;                 // and continue the process make the concatenation
            }


            result += ch + ""+ count;     // so we get each ch & frequency, then we add them to the result variable
                //all ch + ""+ frequency


        }// end of outer loop

        System.out.println(result); // a2b1c3d1














    }
}
