package java_practice.day07_ifStatements;

public class Browser {
    public static void main(String[] args) {

        // ______________________________Nested If Statement______________________//


        String browser = "chrome";
        String result = "";

        if (browser == "chrome" || browser == "firefox" || browser == "opera" || browser == "safari" || browser == "edge") {

            if (browser == "chrome") {
                result = "chrome browser is selected";
            } else if (browser == "firefox") {
                result = "firefox browser is selected";
            } else if (browser == "opera") {
                result = "opera browser is selected";
            } else if (browser == "safari") {
                result = "firefox browser is selected";
            } else {
                result = "edge browser is selected";
            }

        } else {
            result = "invalid browser name";
        }
        System.out.println(result);

    }
}
/*

2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be:
        Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */