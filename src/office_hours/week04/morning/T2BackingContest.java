package office_hours.week04.morning;

public class T2BackingContest {
    public static void main(String[] args) {

        /*
        T2BakingContest [multibranch, logical, arithmetic, relational]

You are in a baking contest and tour cookies will be rated by 3 judges.

	Create a program that will define 3 scores for your cookies. Calculate the average score you earned.
	Then also define two other people's final score and determine which place you earned int the baking contest

		you can earn either: First place, Second place, or Third place

		Ex:
			input:
				your score = 8.5, 7.9, 8.3
				other people score = 8.5 and 7.9

				output: Congratulations you earned Second place with a score of: 8.2
					-> don't worry about decimal formatting
         */
        
        
        double  judge1= 8.5,
                judge2= 7.9,
                judge3= 8.3;
        
        double myScore= (judge1+judge2+judge3) /3; //we divide by 3 because we had 3 scores
        
        double  person1= 8.5,
                person2= 7.6;


        if (myScore> person1 && myScore >person2){
            System.out.println("Congratulations you earned first place with a score of: "+myScore);
        } else if (myScore < person1 && myScore <person2) {
            System.out.println("Congratulations you earned third place with a score of: " +myScore);
        } else {
            System.out.println("Congratulations you earned Second place with a score of:" +myScore);
        }


    }
}
