package java_Practice.day08_ternarySwitch;

public class Books {
    public static void main(String[] args) {


        // Define variables for the information
        String genre = "short story";
        int pageLength = 0;
        int profit = 0;
        int sequels = 0;
        int countries = 0;


        // Assign the information based on the genre name
        switch (genre) {
            case "fantasy":
                pageLength = 500;
                profit = 1000000;
                sequels = 5;
                countries = 50;
                break;
            case "detective":
                pageLength = 350;
                profit = 700000;
                sequels = 3;
                countries = 45;
                break;
            case "science fiction":
                pageLength = 720;
                profit = 900500;
                sequels = 4;
                countries = 30;
                break;
            case "short story":
                pageLength = 150;
                profit = 300000;
                sequels = 1;
                countries = 40;
                break;
            default:
                System.out.println("Sorry we don't have information for the " + genre + " genre");
                return;
        }

        // Print the information based on the genre

        System.out.printf("The " + genre + " genre usually has profits of $" + profit + " being sold in " + countries +
                " different countries. " + "\nThe " + genre + " books often have " + sequels +
                " squeals with each book roughly being around " + pageLength + " pages.");

        // Alternative print statement
        /*System.out.printf("The %s genre usually has profits of $%,d being sold in %d different countries. " +
                        "\nThe %s books often have %d squeals with each book roughly being around %d pages.\n",
                genre, profit, countries, genre, sequels, pageLength);

         */
    }
}

/*
Books [switch, variables]

You are an author writing a new book and want to figure out some information related to the genre

Given the genre name figure out: average page length, average profit, average number of sequels, average number of countries published in. Find and print the information based on the genre.

Use the following format to print the information:
	The $genre genre usually has profits of $profit_amount being sold in $countries_number different countries. The $genre books often have $sequels_number squeals with each book roughly being around $page_length pages.

	if the given genre is not defined print: Sorry we don't have information for the $genre genre

Hint: Use variables for the information rather than printing in each genre

    Sample data for genres:

        genre - Fantasy
        page length - 500
        profit - 1,000,000
        sequels - 5
        countries - 50

        genre - Detective
        page length - 350
        profit - 700,000
        sequels - 3
        countries - 45

        genre - Science Fiction
        page length - 720
        profit - 900,500
        sequels - 4
        countries - 30

        genre - Short Story
        page length - 150
        profit - 300,000
        sequels - 1
        countries - 40
 */