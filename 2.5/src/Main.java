
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
    public static boolean czy_palindrom(String odwrocone, String slowo){
        boolean wynik;
        String normalizacja_rev=odwrocone.toLowerCase().replace(" ", "");
        String normalizacja_pierwotne=slowo.toLowerCase().replace(" ", "");
        wynik= normalizacja_pierwotne.equals(normalizacja_rev);
        return wynik;
    }
}
class zad2_5{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj słowo lub ciąg znakowy do odwrócenia");
        String word= scanner.nextLine();
        scanner.close();
        String odwr= funkcje.reversed(word);
        System.out.println(odwr);
        if (funkcje.czy_palindrom(odwr, word)){
            System.out.println("To jest palindrom ponieważ po normalizacji od tyłu jest taki sam jak od przodu");
            System.out.println("'Powiedz mi to z przodu twojej głowy to twarz czy dupa?'-Bezimienny z Gothica");
        }
        else{
            System.out.println("To nie jest palindrom");
        }
    }
}