package java_Practice.day08_ternarySwitch;

public class ChooseLanguage {
    public static void main(String[] args) {

        // Solution 1: Must use ternary
        int selection = 3;
        String result1;


        result1 = (selection == 1) ? "Hello, thanks for your call"
                : (selection == 2) ? "Hola, gracias para llamar"
                : (selection == 3) ? "Merhaba, aradiginiz icin tesekkurler"
                : (selection == 4) ? "Privet, spasibo za vash zvonok"
                : (selection == 5) ? "Merci ,pour votre appel"
                : "Invalid number";
        System.out.println(result1);


        System.out.println("______________________________________________________");


        // Solution 2 : MUST use switch statement
        String result;

        switch (selection) {

            case 1:
                result = "Hello, thanks for your call";
                break;
            case 2:
                result = "Hola, gracias para llamar";
                break;
            case 3:
                result = "Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                result = "Privet, spasibo za vash zvonok";
                break;
            case 5:
                result = "Merci ,pour votre appel";
                break;
            default:
                result = "Invalid Number";
        }

        System.out.println(result);


    }
}
/*
        5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection
 		 and prints the following message:

			for 1: Hello, thanks for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
         */