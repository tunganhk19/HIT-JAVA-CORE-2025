package test;
public class Person {
    String firstName;
    String lastName;
    byte age;
    public Person(){
        firstName = "No FirstName";
        lastName = "No LastName";
        age = 0;
    }
    public Person(byte a){
        firstName = "No FirstName";
        lastName = "No LastName";
        age = a;
    }
    public Person(String f, byte a){
        firstName = f;
        lastName = "No LastName";
        age = a;
    }
    public Person(String f, String l, byte a){
        firstName = f;
        lastName = l;
        age = a;
    }
}
