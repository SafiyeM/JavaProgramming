package java_practice.day29_inheritance.PhoneTask;

public class Phone {

    private String brand, model, size, color;
    private double price;


    public void setInfo(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    //brand can not be null/empty/blank
    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()){
            System.err.println("brand can not be null/empty/blank");
            return;
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    //model can not be null/empty/blank
    public void setModel(String model) {

        if (model == null || model.isEmpty() || model.isBlank()){
            System.err.println("model can not be null/empty/blank");
            return;
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    //Color can not be null/empty/blank
    public void setColor(String color) {

        if (color == null || color.isEmpty() || color.isBlank()){
            System.err.println("Color can not be null/empty/blank");
            return;
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    // price can not be zero or negative
    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("price can not be zero or negative");
            return;
        }
        this.price = price;
    }


    public void call(long phoneNumber){

        System.out.println(brand + model+ " is calling " + phoneNumber);
    }


    public void text(long phoneNumber){

        System.out.println(brand + model + " is texting to " + phoneNumber);
    }


    @Override
    public String toString() {
        return  getClass().getSimpleName() +"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create a named Phone:
			Common Instance Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

			Common Methods:
					call(long phoneNumber)
					text(long phoneNumber)


 */