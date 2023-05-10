package java_live_review.week13.language;

public interface Language {


    String DEFAULT_ENCODING = "UTF-8"; // it is public static final automatically

    public abstract void hello(); // unnecessary to use public abstract keyword here

    void bye();


   /* Compile error -> methods in interface default abstract. And we can not give body
    void b(){
    }
    */

    // it is static and has to have implementation (body of method)
    static void description() {

        System.out.println("Languages have the ability to express to express thoughts and ideas to others using " +
                "units of sound like words or sentences. There is often rules or syntax for how the words come together");
    }


    default void translate(Language lang, String msg) {
        System.out.println("Translating " + msg + " in " + getClass().getSimpleName()
                + " into " + lang.getClass().getSimpleName());
    }

}
/*
create an interface Language
	create a constant variable: DEFAULT_ENCODING = "UTF-8";
	create abstract methods: hello() & bye()
	create a static method: description()
		print a message about languages: "Languages have the ability to express thoughts and ideas to others using units of
		 sound like words or sentences. There is often rules or syntax for how the words come together"

	create a default method translate(Language l, String msg)
		return: void
		parameters: Language
		use this code: System.out.println("Translating " +  msg + " in " + getClass().getSimpleName() +
		" into " + l.getClass().getSimpleName());
 */