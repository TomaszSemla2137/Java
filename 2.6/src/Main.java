
import java.util.Scanner;

class funkcje{
    public static String reversed(String slowo){
        String odwrocone="";
        int i=(slowo.length())-1;
        StringBuilder builder = new StringBuilder();
        for(; i>=0; i--){
            builder.append(slowo.charAt(i));
        }
        odwrocone= builder.toString();
        return odwrocone;
    }
    public static boolean czy_palindrom_prawidlowy(String odwrocone, String slowo){
        boolean wynik;
        String normalizacja_rev=odwrocone.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String normalizacja_pierwotne=slowo.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        wynik= normalizacja_pierwotne.equals(normalizacja_rev);
        return wynik;
    }
}
class zad2_6{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj słowo lub ciąg znakowy do odwrócenia");
        String word= scanner.nextLine();
        scanner.close();
        String odwr= funkcje.reversed(word);
        System.out.println(odwr);
        if (funkcje.czy_palindrom_prawidlowy(odwr, word)){
            System.out.println("To jest palindrom prawidłowy ponieważ po normalizacji i usunięciu interpunkcji i innych znaków od tyłu jest taki sam jak od przodu");
            System.out.println("'Masz ochotę na partyjkę w Gwinta?'-Geralt z Rivii");
        }
        else{
            System.out.println("To nie jest palindrom prawdiłowy");
        }
    }
}