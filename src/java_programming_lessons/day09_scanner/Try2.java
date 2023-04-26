package java_programming_lessons.day09_scanner;

import java.util.Scanner;

public class Try2 {
    public static void main(String[] args) {


        //Baskasinin kodu denemek icin ekledim!!!
        Scanner input = new Scanner(System.in);
        double price = 0;

        // Ask for screen size
        System.out.println("Select screen size:");
        double screen = input.nextDouble();
        input.nextLine();

        if (screen == 13.3){
            price += 200;
        }else if (screen == 15.0) {
            price += 300;
        }else if (screen == 17.3){
            price += 400;
        }


        // Ask for CPU type
        System.out.println("Select CPU type:");
        String cpu = input.next();

        if (cpu.equalsIgnoreCase("i3")){
            price += 150;
        }else if (cpu.equalsIgnoreCase("i5")){
            price += 250;
        }else if (cpu.equalsIgnoreCase("i7")){
            price += 350;
        }


        // Ask for RAM size
        System.out.println("Select RAM size:");
        int ram = input.nextInt();
        input.nextLine();

        price += (ram / 4) * 50;


        // Ask for storage type and size
        System.out.println("Select storage type:");
        String storageType = input.next();

        System.out.println("Select storage size:");
        int storageSize = input.nextInt();
        input.nextLine();

        if (storageType.equalsIgnoreCase(("HDD"))){
            price += (storageSize / 500) * 50;
        }else if (storageType.equalsIgnoreCase(("SSD"))){
            price += (storageSize / 500) * 100;
        }


        // Ask for screen resolution
        System.out.println("Select screen resolution:");
        String resolution = input.next();

        if (resolution.equalsIgnoreCase(("FULLHD"))){
            price += 100;
        }else if (resolution.equalsIgnoreCase(("4K"))){
            price += 200;
        }

        // Display total price
        System.out.println("Final price is: $" + price);
    }
}
/*
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

  if (cpu.equalsIgnoreCase("i3")){
            price += 150;
        }else if (cpu.equalsIgnoreCase("i5")){
            price += 250;
        }else if (cpu.equalsIgnoreCase("i7")){
            price += 350;
        }

        // Select Ram size
        System.out.println("Select RAM size:");
        int ramSize= scan.nextInt();


      totalPrice+= (ramSize/4)* 50;


        scan.nextLine();
      //Select storage type
        System.out.println("Select storage type:");
        String storageType= scan.next();
        System.out.println("Select storage size:");
        int storageSize= scan.nextInt();

  if(storageType.equalsIgnoreCase("HDD")){
           totalPrice += (storageSize/500) *50;
       } else if (storageType.equalsIgnoreCase("SSD")) {
           totalPrice += (storageSize/500) *100;
       }


       //Select screen resolution
        System.out.println("Select screen resolution:");
       String screenResolution= scan.next();

       if (screenResolution == "FULLHD"){
           totalPrice += 100;
       } else if (screenResolution== "4K") {
           totalPrice += 200;
       }

        System.out.println("Final price is: $" + totalPrice);








scan.close();
  }
}
 */