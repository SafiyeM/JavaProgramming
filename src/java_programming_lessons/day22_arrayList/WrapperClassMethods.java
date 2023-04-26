package java_programming_lessons.day22_arrayList;

public class WrapperClassMethods {


    public static void main(String[] args) {


        String str = "20";

        System.out.println(str + 1); // 201

        // Integer num1= Integer.parseInt(str);  -> Autoboxing
        // int primitive with parseInt method is assigned to wrapper class

        int num1 = Integer.parseInt(str); //-> 20

        /*
        The parse methods return type int (primitive) value, so primitive is being assigned to primitive, it is not converted to another type
        It is neither autoboxing nor unboxing
         */

        System.out.println(num1 + 1); // 21

        Integer num2 = Integer.valueOf(str);
        // wrapper class is being assigned to the wrapper class -> neither autoboxing nor unboxing
        // if we want to use num1 with other data structures

        System.out.println(num2); // 20


        System.out.println("_________________________________________________________________________");


        String s = "20.5";


        double num3 = Double.parseDouble(s); //  returns the value of primitive double

        Double num4 = Double.valueOf(s);  // returns the value of wrapper class Double

        /* If we want to use with the other data Structure,
         we convert it to the Wrapper Class ->neither autoboxing nor unboxing
          */

        System.out.println("num3 = " + num3); // 20.5
        System.out.println("num4 = " + num4); // 20.5

        System.out.println("______________________________________________");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);
        Boolean r2 = Boolean.valueOf(x);

        System.out.println("r1 = " + r1); // true

        System.out.println("r2 = " + r2); // true


        System.out.println("______________________________________________");

        char ch = 'a';

        boolean isDigit = Character.isDigit(ch);

        boolean isLetter = Character.isLetter(ch);

        boolean isLowerCaseLetter = Character.isLowerCase(ch);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        boolean isSpecialCharacter = !Character.isLetterOrDigit(ch);

        System.out.println("isDigit = " + isDigit); // isDigit = false
        System.out.println("isLetter = " + isLetter); // isLetter = true
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter); // isLowerCaseLetter = true
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("isSpecialCharacter = " + isSpecialCharacter);


        System.out.println("______________________________________________");

        String string = "a1b2c3d4e5";

        int sum = 0;

        for (char each : string.toCharArray()) {  // we called charArray() method through the string variable

            if (Character.isDigit(each)) {
                sum += Integer.parseInt(each + "");

            }
        }

        System.out.println("sum = " + sum); // 15


    }
}
