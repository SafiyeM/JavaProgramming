package java_programming_lessons.day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();
                //   key  ,   value   -> pair
        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 34);
        person1.put("job_title", "Developer");
        person1.put("salary", 100_000.5);
        person1.put("married", true);

        System.out.println(person1); // {name=Arthur, gender=M, age=34, job_title=Developer, salary=100000.5, married=true}

        System.out.println( person1.get("name")); // Arthur
        System.out.println( person1.get("salary")); // 100000.5
        System.out.println(person1.get("job_title")); // Developer



    }


}
