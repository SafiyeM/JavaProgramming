package java_Programming_Lessons.day31_inheritance.shape_methodOverriding;

public class Shape {


    private String name;



    // default constructor // we do not need any arg.
    // and we do not need to call explicitly in subclass, it is called implicitly
    public Shape(){
       setName(getClass().getSimpleName());

       // * we set the name by calling class name and getSimpleName method,
        // so it allows us to set the name of each shape we create as a child class
        //-> i.e. circle class can set the name to the circle
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // * since for each shape we have different formula,
    // we need to give the default value, that needs to be returned from the area method
    public double area(){
        return 0;  // we set now to 0, but in child/subclass we can change and calculate for each shape
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){ // we will implement the draw method in child classes based on the child classes shape

        System.out.println("Drawing a " + getClass().getSimpleName()+ ": ");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
