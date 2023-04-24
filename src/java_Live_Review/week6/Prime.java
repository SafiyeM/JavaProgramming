package java_Live_Review.week6;

public class Prime {

    public static void main(String[] args) {

        int range = 100;

        for(int j = 2; j <= range; j++){ // num = j

            boolean isPrime = true;

            for(int i = 2; i < j; i++){
                //System.out.println(num + " % " + i + "  " + (num%i));
                if(j % i == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.print(j + ", ");
            }
        }

    }

    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    /*
        for(int i = 2; i < n; i++){

        --> the loop starts from 2 and goes until the number n
            we start from 2 because we want to check if the number n is evenly divisible by any number.
            We do not check for 1 or the number itself because all numbers are evenly divisible by those

        if(n % i == 0){

        -->  this if statement is executed each iteration and checks if the number n is evenly divisible by i.
             If a number is prime it shouldn't be evenly divisible by any other number.
             divisibility means when the number is divided there is no leftover

         return false;

         --> false is returned whenever the above if statement is true meaning the number n was divisible
             by a number besides 1 and itself (that is what the loop checks for)
             otherwise true is returned by default at the end of the method
            }
        }
     */

    public static String primeInRange(int range){
        String prime = "";
        for(int i = 2; i <= range; i++){
            if(isPrime(i)){
                prime += i + ", ";
            }
        }
        return prime.substring(0, prime.length()-2);
    }

    /*
        String prime = "";
        for(int i = 2; i <= range; i++){

        -->  the loop is going from 2 until the range number. It will be the number checked each iteration.

        if(isPrime(i)){

        -->  the number i is the argument of the isPrime method above. It checks if this number is prime or not.
             Each number from 2 to the range is checked

         prime += i + ", ";

         -->  when the number is prime it is concatenated to the prime String with a comma space after

            }
        }

        return prime.substring(0, prime.length()-2);

         --> the substring removes the last comma space
     */
}



/*[IQ] Prime in range [nested loop, methods, conditional]

        create a method that will accept a number. Print out all the prime numbers in the range between 2 and the given number

        a number is a prime number when it is only divisible by 1 and itself

        ex:
        Input:
        50
        Output:
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47


 */