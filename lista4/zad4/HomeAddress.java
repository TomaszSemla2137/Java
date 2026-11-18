package lista4.zad4;

import java.util.Objects;

public class HomeAddress {
    private final String street;
    private final String city;
    private final String postalCode;

    public HomeAddress(String street, String city, String postalCode) {
        this.street = Objects.requireNonNull(street, "street must not be null");
        this.city = Objects.requireNonNull(city, "city must not be null");
        this.postalCode = Objects.requireNonNull(postalCode, "postalCode must not be null");
    }

    public String getFullAddress() {
        return street + ", " + postalCode + " " + city;
    }

    @Override
    public String toString() {
        return getFullAddress();
    }
}
