import java.util.Scanner;
public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj liczbe do rozkładu");
int num=scanner.nextInt();
    scanner.close();
    int n=num;
    int krok=0;
    while (num>1){
        if (num%2==0){
            num/=2;
            System.out.println(num);
            krok++;
        }
        else{
            num -=1;
            System.out.println(num);
            krok++;
        }
    }
    System.out.println("rozłozenie liczby "+n+" zajęło "+krok+" kroków");
}