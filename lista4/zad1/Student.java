package lista4.zad1;

public class Student {
    private int age;
    private String name;
    private char group;

    public Student() {
    }

    public Student(int age, String name, char group) {
        this.age = age;
        this.name = name;
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public char getGroup() {
        return group;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    @Override
    public String toString() {
        String displayName = name == null ? "(brak)" : name;
        String displayGroup = group == '\0' ? "(brak)" : String.valueOf(group);
        return "Student{name='" + displayName + "', age=" + age + ", group=" + displayGroup + "}";
    }
}
