package java_live_review.week13.building;

public class House extends Building implements HasBackYard{

    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("Paying mortgage");
    }



    @Override
    public void mowLawn() {
        System.out.println("Mowing the Backyard");
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,numberOfResidents " + numberOfResidents;
    }
}
/*
- Create a class House
		child class of Building
		implements HasBackyard
 */