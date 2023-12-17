package selfStudy;

public class Test_Loops {
    public static void main(String[] args) {



        int x=1;

        while(x<6){
            System.out.println("Hello");
            x++;// if we have no iteration, then it is infinite loop

            if (x==6)
                break;

        }

        System.out.println("_______________________________________---");

        for (int i = 10; i > 0; i--) {           // i:10
            System.out.println(i);
            i--; // i:10

        }

        System.out.println("__________________________________________");


        int i= 0;
        for (; i <=5 ; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("i after the loop = " + i);


        System.out.println("___________________________");


        String s= "Cydeo";
        int j= 0;
        for (; j < s.length(); j+=3) {

            System.out.println(s.charAt(j));
        }
        System.out.println("you are out" +j);

        System.out.println("_________________________________________");

        int a= 0;
        while (a<= 6){
            a+=2;
        }

        System.out.println("a =" + a);


        System.out.println("________________________________");


        int num = 10;

        do {
            num+= 5;
        } while (num < 15);

        System.out.println(num);


        System.out.println("___________________________________");

        String str = "A1B2C3";

        int sum = 0;

        for (int m = 0; m < str.length(); m++) {
            char ch = str.charAt(m);
            if(ch >= '0' && ch <= '9'){
                sum += ch - 48;
            }
        }

        System.out.println("sum = " + sum);

    }
}
