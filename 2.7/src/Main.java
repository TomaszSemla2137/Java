import java.util.Scanner;
class funckje{
    static void dzielenie_numeru(String numer) {
        String tylkoCyfry = numer.replaceAll("[^0-9]", "");

        if (tylkoCyfry.length() < 9) {
            System.out.println("Błąd: Za mało cyfr w numerze.");
            return;
        }


        String blok1 = tylkoCyfry.substring(0, 3);
        String blok2 = tylkoCyfry.substring(3, 6);
        String blok3 = tylkoCyfry.substring(6, 9);

        System.out.println("Blok 1: " + blok1);
        System.out.println("Blok 2: " + blok2);
        System.out.println("Blok 3: " + blok3);
    }
}
class zad2_7{
    public static void main(String args[]) {
        String numer = "123-256-632";
        funckje.dzielenie_numeru(numer);
    }
}