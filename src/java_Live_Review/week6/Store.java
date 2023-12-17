package java_Live_Review.week6;

public class Store {


    public static void main(String[] args) {


        Item apples= new Item();
        apples.setInfo("Apple", 20, 1.35);
        System.out.println(apples);


        Item javaBook= new Item();
        javaBook.setInfo("Java Book", 4, 150);
        System.out.println(javaBook);





        apples.sellItem(10);
        System.out.println(apples);

        javaBook.sellItem(5);
        System.out.println(javaBook);

        javaBook.sellItem(4);
        System.out.println(javaBook);




    }
}
