package java_programming_lessons.day14_forLoop;

public class WarmUpTasks {
    public static void main(String[] args) {



String str3= combine("one", "eight");
        System.out.println(str3);

        System.out.println("__________________________________");


        System.out.println(sumof2IntegerNumbers(100,200));

        System.out.println(sumOf3IntegerNumbers(10,20,30));

        System.out.println(sumof4IntegerNumbers(40,60,100,30));



    }



    public static String combine(String str1, String str2){

        String result;
/*      // 1. Solution / Approach
        if (str1.endsWith(""+ str2.charAt(0) ) ){ //if the first str1 ends with first character of str2
            result= str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }
 */

     // 2. Approach / Solution
if (str1.charAt(str1.length()-1) == str2.charAt(0)){ //if last character in str1 is equal to first ch of str2
    result = str1 + str2.substring(1);// first character of the second string (str2) should be excluded
}else {
    result= str1 + str2;
}
        return result;
    }



public static int sumof2IntegerNumbers(int n1, int n2){

        return n1 + n2;


}



public static int sumOf3IntegerNumbers(int n1, int n2, int n3){
        // return n1 + n2+ n3;
    return sumof2IntegerNumbers(n1, n2) +n3;
}



public  static int sumof4IntegerNumbers(int n1, int n2, int n3, int n4){
       // return n1 + n2 + n3 + n4;
       //return sumOf3IntegerNumbers(n1, n2, n3) +n4;
      // return sumof2IntegerNumbers(n1,n2) + sumof2IntegerNumbers(n3,n4);
       // return sumof2IntegerNumbers(sumOf3IntegerNumbers(n1, n2, n3) ,n4);
       return sumOf3IntegerNumbers( sumof2IntegerNumbers(n1,n2),  n3,  n4); // we provided 3 arguments



}


}



/*
Warmup Tasks.txt:
	Task1:
	    Create a method named combine that can take two string and then add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same,
        	 return that character once.

	        combine("one", "eight")  ==> oneight

	Task 2:
	    1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers

	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers

	    3. create a method that can find the sum of four integer numbers

 */