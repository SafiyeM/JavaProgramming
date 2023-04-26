package java_programming_lessons.day14_forLoop;

public class StringReverse {

    public static void main(String[] args) {

        String str= "Java";
                  // 0123
                  // "avaJ"

        String reverse= "";

        for (int i = str.length()-1; i >= 0; i--) {      //--> we go backward that's why we decrease by one
                                                         //--> start from last index of string
           reverse += str.charAt(i);
        }

        System.out.println(reverse);


        System.out.println("__________________________________");


        String name= "Rebecca Sofia Nina Ilaria";
       
        System.out.println(reverse(name));
        
        /* Or
        String result= reverse(name);
        System.out.println(result);
        
        
         */


    }


    public static String reverse(String str){

        String reverse="";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }


        return reverse;

        }




}
