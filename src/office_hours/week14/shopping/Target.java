package office_hours.week14.shopping;

public final class Target extends Shopping implements Shipping{
//final class can not be parent

    @Override
    public void shipItem() {
        System.out.println("Shipping from Target warehouse");
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Target store");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Target store");
    }



}
/*
  Create a concrete class Target
        - Make the class final
        - Inherit Shopping and implement Shipping
        - implement all abstract methods
 */