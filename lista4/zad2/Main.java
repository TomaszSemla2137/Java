package lista4.zad2;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(18);
        person.yearPases();
        System.out.println(person.amIOld());
        person.yearPases();
        System.out.println(person.amIOld());
    }
}