package java_Programming_Lessons.day09_scanner;

import java.util.Scanner;

public class Try {
    public static void main(String[] args) {

        //REplit code cozmeyi unutma!

        //Select screen size
        Scanner scan= new Scanner(System.in);
        System.out.println("Select screen size:");
        double screenSize= scan.nextDouble();
        double totalPrice= 0;


        if(screenSize == 13.3){
            totalPrice += 200;
        }if (screenSize == 15.0) {
            totalPrice += 300;
        } else if(screenSize == 17.3) {
            totalPrice += 400;
        }

        // Select CPU type
        System.out.println("Select CPU type:");
        String cpuType=scan.next();

        if (cpuType == ("i3")){
            totalPrice += 150;
        }else if (cpuType == ("i5")){
            totalPrice += 250;
        } else if (cpuType == ("i7")) {
            totalPrice += 350;
        }

        // Select Ram size
        System.out.println("Select RAM size");
        int ramSize= scan.nextInt();

      totalPrice+= (ramSize/4)* 50;



      //Select storage type
        System.out.println("Select storage type");
        String storageType= scan.next();
        System.out.println("Select storage size");
        int storageSize= scan.nextInt();

       if(storageType.equalsIgnoreCase("HDD")){
           totalPrice += (storageSize/500) *50;
       } else if (storageType.equalsIgnoreCase("SSD")) {
           totalPrice += (storageSize/500) *100;
       }


       //Select screen resolution
        System.out.println("Select screen resolution");
       String screenResolution= scan.next();

       if (screenResolution == ("FULL-HD")){
           totalPrice += 100;
       } else if (screenResolution== ("4K")) {
           totalPrice += 200;
       }

        System.out.println("Final price is : " + totalPrice);



/*
### Create a program that will build a custom computer by selecting each part and computing the total price.
Use the following requirements for each section:

**First ask the user about the screen size**
> Select screen size:
> - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price

**Then ask the user about the CPU**
> Select CPU type:
> - For a CPU of `i3`, add `$150` to the total price
> - For a CPU of `i5`, add `$250` to the total price
> - For a CPU of `i7`, add `$350` to the total price

**Then ask the user about the RAM size**
> Select RAM size:
> - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

**Then ask the user about the storage type and amount**
> Select storage type:

> Select storage size:

> - For `HDD`, add `$50` to the total price for every 500GB
> - For `SSD`, add `$100` to the total price for every 500GB

**Then ask the user about the screen resolution**
> Select screen resolution:
> - For `FULL-HD`, add `$100` to the total price
> - For `4K`, add `$200` to the total price

** At the end display the total price of the custom computer**
> Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0
```

```
  Select screen size:
    13.3
  Select CPU type:
    i3
  Select RAM size:
    4
  Select storage type:
    HDD
  Select storage size:
    500
  Select screen resolution:
    FULLHD
  Final price is: $550.0
 */




























      /*  Scanner scan= new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item= scan.nextLine();


       */

        /*String message="";




        if(item == "Blanket" && item == "Charger" && item == "Hat" && item ==
                "Headphones" && item == "Laptop" && item == "Pants" && item ==
                "Pillow" && item == "Smartphone" && item == "Socks" && item ==
                "USB Cable") {


            if (item=="Blanket"){
                message= "Thank you for your purchase!\nYour current balance is: 40$";
            } else if (item=="Charger") {
                message="Thank you for your purchase!\nYour current balance is: 95$";
            } else if (item=="Hat") {
                message="Thank you for your purchase!\nYour current balance is: 75$";
            } else if (item=="Headphones") {
                message= "Thank you for your purchase!\nYour current balance is: 70$";
            } else if (item=="Laptop") {
                message= "Sorry, not enough funds on your gift card";
            } else if (item=="Pants") {
                message= "Thank you for your purchase!\nYour current balance is: 50$";
            } else if (item=="Pillow") {
                message= "Thank you for your purchase!\nYour current balance is: 60$";
            } else if (item=="Smartphone") {
                message= "Sorry, not enough funds on your gift card";
            } else if (item=="Socks") {
                message= "Thank you for your purchase!\nYour current balance is: 95$";
            }else {
                message= "Thank you for your purchase!\nYour current balance is: 80$";
            }


        } else {
            message="Sorry, that is an invalid item";

        }

        System.out.println(message);



         */

      /*  String message="";


  switch(item){

                case "Blanket":
                    message= "Thank you for your purchase!\nYour current balance is: 40$";
                    break;
                case "Charger":
                    message="Thank you for your purchase!\nYour current balance is: 95$";
                    break;
                case "Hat":
                    message="Thank you for your purchase!\nYour current balance is: 75$";
                    break;
                case "Headphones":
                    message= "Thank you for your purchase!\nYour current balance is: 70$";
                    break;
                case "Laptop":
                    message= "Sorry, not enough funds on your gift card";
                    break;
                case "Pants":
                    message= "Thank you for your purchase!\nYour current balance is: 50$";
                    break;
                case "Pillow":
                    message= "Thank you for your purchase!\nYour current balance is: 60$";
                    break;
                case "Smartphone":
                    message= "Sorry, not enough funds on your gift card";
                    break;
                case "Socks":
                    message= "Thank you for your purchase!\nYour current balance is: 95$";
                    break;
                case "USB Cable":
                    message= "Thank you for your purchase!\nYour current balance is: 80$";
                    break;
                default:
                    message= "Sorry, that is an invalid item";


            }

        System.out.println(message);


       */











        scan.close();

    }
}
