package office_hours.week14.shopping;

public interface Shipping {

    // variables will be public static final
    void shipItem(); // public abstract by default


    // not abstract
    default void notification(){
        System.out.println("Sending email: Package shipped");
    }
}
/*

    Create an interface Shipping
        - Declare an abstract methods:
            shipItem()
 */