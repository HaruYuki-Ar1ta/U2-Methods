

public class StringExamples {

    public static void main(String[] args) {
        String greeting = "Hello" ;
        String name = "hephaestus" ;

        //Style 1
        int greetingSize = greeting.length();
        System.out.println(greeting + " has " + greetingSize + " letters.");

        //Style 2
        System.out.println(name +  " has " + name.length() + " letters.");

        //Create a program which capitalizes the first letter of any word.

        /*
        1. Get input - users name
        2. Isolate the first letter
        3. Capitalize
        4. Isolate everything after the first letter
        5. Combine 2 and 4
        6. Use/Output

         */

        System.out.println(capital(name));

    }
    public static String capital(String name){
        String firstLetter = name.substring(0, 1);
        firstLetter = firstLetter.toUpperCase();

        String restName = name.substring(1);

        return firstLetter + restName;
    }










}
