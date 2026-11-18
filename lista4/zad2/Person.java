package lista4.zad2;

public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void yearPases() {
        age++;
    }

    public String amIOld() {
        return age <= 19 ? "Teenager" : "Adult";
    }
}