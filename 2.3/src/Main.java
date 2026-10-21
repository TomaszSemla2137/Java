import java.util.Scanner;
class zadanie2_3{
    public static void funkcja(){
        Scanner scanner = new Scanner(System.in);
        StringBuilder builder = new StringBuilder();
        String Auto=" ";
        System.out.println("Podaj słowo do łańcucha znaków, spacje są robione automatycznie");
        for (int i=0; i<=5; i++){
            String zmienna = scanner.nextLine();
            builder.append(zmienna);
            builder.append(Auto);
        }
        String finalista=builder.toString();
        System.out.println(finalista);
    }
    public static void main(String args[]){
        funkcja();
    }
}