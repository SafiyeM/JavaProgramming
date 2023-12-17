package replit.statement_2;

import java.util.Scanner;

public class ComputerBuilder {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);


        double totalPrice = 0;

        // Select screen size
        System.out.println("Select screen size:");
        double screen = input.nextDouble();

        // Select screen size
        if (screen == 13.3){
            totalPrice += 200;
        }else if (screen == 15.0) {
            totalPrice += 300;
        }else if (screen == 17.3){
            totalPrice += 400;
        }

        // Select CPU type
        System.out.println("Select CPU type:");
        String cpu = input.next();

        if (cpu.equalsIgnoreCase("i3")){
            totalPrice += 150;
        }else if (cpu.equalsIgnoreCase("i5")){
            totalPrice += 250;
        }else if (cpu.equalsIgnoreCase("i7")){
            totalPrice += 350;
        }

        // Select RAM size
        System.out.println("Select RAM size:");
        int ram = input.nextInt();

        totalPrice += (ram / 4) * 50;


        // Select storage type and size
        System.out.println("Select storage type:");
        String storageType = input.next();

        input.nextLine();
        System.out.println("Select storage size:");
        int storageSize = input.nextInt();
        input.nextLine();

        if (storageType.equalsIgnoreCase(("HDD"))){
            totalPrice += (storageSize / 500) * 50;
        }else if (storageType.equalsIgnoreCase(("SSD"))){
            totalPrice += (storageSize / 500) * 100;
        }


        // Select screen resolution
        System.out.println("Select screen resolution:");
        String resolution = input.next();

        if (resolution.equalsIgnoreCase(("FULLHD"))){
            totalPrice += 100;
        }else if (resolution.equalsIgnoreCase(("4K"))){
            totalPrice += 200;
        }

        // Display total price
        System.out.println("Final price is: $" + totalPrice);



        input.close();
    }
}
/*
### Create a program that will build a custom computer by selecting each part and computing the total price. Use the following requirements for each section:

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
> - For `FULLHD`, add `$100` to the total price
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
```
 */