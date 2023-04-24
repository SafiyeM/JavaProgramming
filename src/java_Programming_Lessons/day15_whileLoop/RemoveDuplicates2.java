package java_Programming_Lessons.day15_whileLoop;

public class RemoveDuplicates2 {
    public static void main(String[] args) {


        String str = "xyzxyzxyz";
        String result = "";

        int i = 0;
        for (;i < str.length(); i++) {

            if (result.contains("" + str.charAt(i))) { // if the character is already contained in new String
                continue;                             // then skip it
            }

            result += str.charAt(i);

        }


        System.out.println(result );


    }
}

/*
2. Solution of this task with continue:

Write a program that can remove the duplicated characters from the string

				Ex:
					str = "aabbbcccc"

					output:
						abc
 */