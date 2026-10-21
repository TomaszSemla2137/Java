import java.util.Scanner;
class zad5{
    public static int policz_bity(int a){
        int licznik=0;
        while (a>0){
if(a%2 !=0){
    licznik++;
}
a/=2;
        }
        return licznik;
    }
public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    int x=scanner.nextInt();
    scanner.close();
    int jedynki=policz_bity(x);
System.out.println("liczba jedynek w zapisie binarnym to: "+jedynki);
}
    }