import java.util.Scanner;
class zad2_4{
    public static String reverse(String slowo){
        String odwrocone="";
        int i=(slowo.length())-1;
        StringBuilder builder = new StringBuilder();
        for(; i>=0; i--){
builder.append(slowo.charAt(i));
        }
        odwrocone= builder.toString();
        return odwrocone;
    }
    public static void main(String[] args){
Scanner scanner=new Scanner(System.in);
System.out.println("Podaj słowo lub ciąg znakowy do odwrócenia");
String word= scanner.nextLine();
scanner.close();
String wynik= reverse(word);
System.out.println(wynik);
    }
}