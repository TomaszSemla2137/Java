package lista4.zad4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Jan Kowalski", 5000.0, LocalDate.of(2023, 5, 10),
                        new HomeAddress("Długa 1", "Kraków", "31-147")),
                new Employee("Anna Nowak", 6500.0, LocalDate.of(2022, 11, 1),
                        new HomeAddress("Karmelicka 15", "Kraków", "31-128")),
                new Employee("Piotr Wiśniewski", LocalDate.of(2024, 2, 20),
                        new HomeAddress("Floriańska 8", "Kraków", "31-019"))
        };

        System.out.println("--- PRZED PODWYŻKĄ ---");
        for (Employee emp : employees) {
            System.out.println(emp.getInfo());
        }

        for (Employee emp : employees) {
            emp.raiseSalary(10.0);
        }
        employees[0].setNewAddress(new HomeAddress("Wielicka 42", "Kraków", "30-552"));

        System.out.println("\n--- PO PODWYŻCE ---");
        for (Employee emp : employees) {
            System.out.println(emp.getInfo());
        }
    }
}