import java.util.Scanner;
class zadanie2_1{
public static void przeliczanie(String slowo){
    String samogloski="aąeęiouóyAĄEĘIOUÓY";
    StringBuilder builder = new StringBuilder();

    int licznik=0;
    for (int i=0; i<slowo.length(); i++){
        char aktualny =slowo.charAt(i);
        if (samogloski.indexOf(aktualny)!= -1){
            licznik++;
            builder.append(aktualny);
        }
    }
    String wystepuja=builder.toString();
    System.out.println("W tym słowie występują samogłoski "+wystepuja+ " A ich liczba to: "+ licznik);
}
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Podaj słowo do sprawdzenia:");
String sprawdzam=scanner.nextLine();
scanner.close();
przeliczanie(sprawdzam);
}
        }
