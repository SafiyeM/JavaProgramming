package java_programming_lessons.day33_abstraction;

import java_programming_lessons.day32_finalKeyword.personTask.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {


    private final String id;
    private String batchName;
    private int batchNumber;
    private static final String programmingLanguage;


    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
       // attribute age was inherited. Since it is final, we can only give a condition through getter
        // and inside the constructor(the only time we use inside the constructor to set, if there is no setter)
        super(name, gender, dateOfBirth); // we give a condition to age after we set the age by calling parent class
        if (getAge() <18){ // if age is set less than 18
            System.err.println("Cydeo developer student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;
        setBatchName(batchName);
        setBatchNumber(batchNumber);

    }


    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("Zero to Hero") || batchName.equalsIgnoreCase("alumni dev")){
            this.batchName = batchName;
        }else{ // if invalid
            System.err.println("Invalid batch name" +batchName + "\nNo such a batch in Cydeo");
            System.exit(1);
        }
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber <= 0){
            System.err.println("Invalid batch number: " + batchNumber + "\nBatch number can not be negative or zero");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public void eat(){
        System.out.println(getName() + " is eating while learning " + programmingLanguage);
    }


    public void drink(){
        System.out.println(getName() + " is drinking while learning " + programmingLanguage);
    }


    public void sleep(){
        System.out.println(getName()+ " is sleeping for 3 hours daily during the " + programmingLanguage+ " course");
    }

    /* we can NOT override
    // and breath() method's implementation is unchangeable in parents class, even if we do not use final here
    // it will give compiler

    public final void breath(){

    }
     */

    @Override
    public String toString() {
        return "CydeoDevStudent: " +
                "name= " + getName()  +
                ", gender= " + getGender()  +
                ", age= " + getAge()  +
                ", dateOfBirth= " + getDateOfBirth()  +
                ", id= " + id   +
                ", batchNumber= " + batchNumber +
                ", batchName= " + batchName;
    }


}


/*
1. Create a subclass of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables

 */