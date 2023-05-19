package java_programming_lessons.day38_exceptions;


public class BreakTimeException extends RuntimeException {

    public BreakTimeException(){
        super("It's a break time"); // calling parent class' default constructor
    }

    public BreakTimeException(String message){
    super(message); // calling parents class' String argument constructor
}



}
