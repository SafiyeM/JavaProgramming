package java_practice.day19_array;

public class Classmates_2 {

    public static void main(String[] args) {


        String[] classmates= {"Harry P","Merry F","Sara S", "Shira C", "Andrea E", "Ingrid A","Joseph C", "Micheal S"};



        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length() - 1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);



        }
    }
}
/*
2. create string array, and store the names of your  classmates (10)
            reverse each student names and print them in separate line
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c

 */