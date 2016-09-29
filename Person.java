public class Person {
     public static void main (String[] args) 
 {
 String name;

   
    
    Person(String personName) {
        name = personName;
    }

    public String greet(String yourName) {
        return String.format("Hi %s, my name is %s", name, yourName);
    }
}}
