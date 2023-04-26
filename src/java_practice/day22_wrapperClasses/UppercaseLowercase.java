package java_practice.day22_wrapperClasses;

public class UppercaseLowercase {


    public static void main(String[] args) {

        String str = "JAVA java";

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

      for (int each : str.toCharArray()){

          if (Character.isUpperCase(each)){
              upperCaseCount ++;
          } else if (Character.isLowerCase(each)) {
              lowerCaseCount++;
          }

      }

        System.out.println(upperCaseCount == lowerCaseCount);
    }
}
/*
2. Write program that returns true if the total number of upper case characters are equal
 to total number of Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true

 */