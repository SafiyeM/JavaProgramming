package java_Practice.day25_constructor.carpetTask;

public class Carpet {

    public double width, length, unitPrice;
    boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){


        double totalPrice = (width*length)*unitPrice;

        if(isPersian){
            totalPrice += 200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unit price=" + unitPrice +
                ", is Persian=" + isPersian +
                ", total price=" + calcCost() +
                '}';
    }
}
/*
Task03:
    1. Create a custom class named Carpet:
                instance variables:
                        width, length, unitPrice, isPersian (boolean)

                Add a constructor that can set all the fields

                instance methods:
                        calcCost(): should be able to calculate the total cost of the carpet and return it as double
                        toString(): should be able to display all the info of the carpet including the total cost of the
                         carpet as calculated by calcCost()

            total price of carpet = (width*length)*unitPrice

            if the carpet is persian  carpet, add 200$ to the totalPrice
 */