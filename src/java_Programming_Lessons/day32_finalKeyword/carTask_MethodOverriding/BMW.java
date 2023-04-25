package java_Programming_Lessons.day32_finalKeyword.carTask_MethodOverriding;

public class BMW extends Car {


    public BMW(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {

        System.out.println("Call the mechanic or jump start to start " + getMake() +" "+ getModel());
    }

}


/*
 4. BMW
        start(): "Call the mechanic or jump start "
 */