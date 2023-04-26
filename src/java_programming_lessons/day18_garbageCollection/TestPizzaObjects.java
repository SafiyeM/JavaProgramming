package java_programming_lessons.day18_garbageCollection;

public class TestPizzaObjects {


    public static void main(String[] args) {

      Pizza pizza1= new Pizza();
     // pizza1.size= 'L'; -> instead of doing separately we can make setInfo method
        pizza1.setInfo('L',1, 1);



      Pizza pizza2= new Pizza();
     // pizza2.size= 'S';
        pizza2.setInfo('S', 1,1);


        System.out.println(pizza1);
        System.out.println(pizza2);


        System.out.println("___________________________________");


        double total= 0;

        for (int i = 0; i < 20; i++) {

            Pizza small= new Pizza();
            small.setInfo('s',2,2);
            total+= small.calcCost();

            Pizza medium= new Pizza();
            medium.setInfo('M', 2, 2);
            total+= medium.calcCost();

            Pizza large= new Pizza();
            large.setInfo('L', 2, 4);
            total+= large.calcCost();





        }

        System.out.println(total);




    }
}
