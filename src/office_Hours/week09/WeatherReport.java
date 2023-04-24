package office_Hours.week09;

import office_Hours.utils.MathUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WeatherReport {

    public static void main(String[] args) {


        ArrayList<Double> temps = new ArrayList<>(Arrays.asList(62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5));
        System.out.println("original " + temps);
        Collections.sort(temps);
        System.out.println("sorted " + temps);
        temps.remove(0); // remove the lower temp
        temps.remove(0); // remove the second lower temp
        temps.remove(temps.size() - 1); // removes the highest temp
        temps.remove(temps.size() - 1); // removes the second-highest temp
        System.out.println("fixed data: " + temps);

        System.out.println("Max: " + Collections.max(temps));
        System.out.println("Min: " + Collections.min(temps));
        System.out.println("Median: " + temps.get(temps.size() / 2));

        double avg = 0;
        for (double each : temps) {
            avg += each;
        }
        avg /= temps.size();

        System.out.println("Mean: " + MathUtil.format(avg));

        System.out.println("Predication: " + ((int) avg - 5) + " - " + ((int) avg + 5));




        // 2. Solution

        //Create an arraylist
        ArrayList<Double> temperatures = new ArrayList<>(Arrays.asList(62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1,
                55.8, 42.3, 48.5));
        //w e can easily sort
        Collections.sort(temperatures);
        System.out.println(temperatures);
        // we will remove the first element two times
        temperatures.remove(0);
        System.out.println(temperatures);
        temperatures.remove(0);
        System.out.println(temperatures);
        //we will remove the last element two times

        temperatures.remove(temperatures.size() - 1);
        temperatures.remove(temperatures.size() - 1);
        System.out.println("temperatures = " + temperatures);

        double max= temperatures.get(0);     //Double.MIN_VALUE;
        double min= temperatures.get(0);    //  Double.MAX_VALUE;

        double sum=0;

        for (double temperature : temperatures) {

            if (temperature>max){
                max=temperature;

            }

            if (temperature<min){
                min=temperature;
            }
            sum+=temperature;

        }
        double mean=sum/ temperatures.size();
        double median=0;
        //  0     1     2     3
        //42.3, 43.0, 68.9, 77.3
        if (temperatures.size()%2==0){
            //2
            double num1=  temperatures.get(temperatures.size()/2);
            double num2=  temperatures.get(temperatures.size()/2-1);
            median=(num1+num2)/2;

        }else {
            median=temperatures.get(temperatures.size()/2);
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("mean = " + mean);
        System.out.println("median = " + median);
        System.out.println("predication " +((int)mean-5) +" - " +((int)mean+5));












    }


}
