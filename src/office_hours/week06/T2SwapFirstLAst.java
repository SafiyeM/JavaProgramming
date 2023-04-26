package src.office_Hours.week06;

public class T2SwapFirstLAst {
    public static void main(String[] args) {

        System.out.println(swapFirstLast("code"));

        System.out.println(swapFirstLast("hello"));


    }


    public static String swapFirstLast(String str){

        if (str.length() == 0 || str.length() < 2){
          return str;

        }

        int lastIndex= str.length()-1;
        char first= str.charAt(0);
        char last= str.charAt(lastIndex);
        String middle= str.substring(1, lastIndex);
        return last + middle + first;
        }


    }

/*
T2SwapFirstLast [methods, String]

    Create a method that has a String parameter and returns a String with the first
    and last character swapped

    Ex:
        code -> eodc
        ab -> ba
        fa -> af
 */