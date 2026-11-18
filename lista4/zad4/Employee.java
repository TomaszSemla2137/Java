package lista4.zad4;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Employee {
    private static final double DEFAULT_SALARY = 0.0;

    private final String name;
    private double salary;
    private final LocalDate hireDate;
    private HomeAddress homeAddress;

    public Employee(String name, double salary, LocalDate hireDate, HomeAddress homeAddress) {
        this.name = Objects.requireNonNull(name, "name must not be null");
        this.hireDate = Objects.requireNonNull(hireDate, "hireDate must not be null");
        this.homeAddress = Objects.requireNonNull(homeAddress, "homeAddress must not be null");
        setSalary(salary);
    }

    public Employee(String name, LocalDate hireDate, HomeAddress homeAddress) {
        this(name, DEFAULT_SALARY, hireDate, homeAddress);
    }

    public String getInfo() {
        return String.format(
                Locale.ROOT,
                "Pracownik: %s | Pensja: %.2f PLN | Data zatrudnienia: %s | Adres: %s",
                name,
                salary,
                hireDate,
                homeAddress.getFullAddress());
    }

    public void setNewAddress(HomeAddress newAddress) {
        this.homeAddress = Objects.requireNonNull(newAddress, "newAddress must not be null");
    }

    public void raiseSalary(Double byPercent) {
        Objects.requireNonNull(byPercent, "byPercent must not be null");
        if (!Double.isFinite(byPercent) || byPercent < 0) {
            throw new IllegalArgumentException("byPercent must be a finite, non-negative number.");
        }

        setSalary(salary * (1 + byPercent / 100));
    }

    private void setSalary(double salary) {
        if (!Double.isFinite(salary) || salary < 0) {
            throw new IllegalArgumentException("salary must be a finite, non-negative number.");
        }
        this.salary = salary;
    }
}