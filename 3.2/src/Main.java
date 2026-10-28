
class funkcje{
    public static int znajdz(int x, int[] tab, int l){
        int ilosc=0;
        for (int i = 0; i < l; i++) {
if (tab[i]==x){
    ilosc++;
}
        }
        return ilosc;
    }
}
public class Main {
    public static void main(String[] args) {


        int[] tab = {1, 1236, 12, 61, 2, 6, 2, 6, 1, 3};
        int l=tab.length;
int ilosc=funkcje.znajdz(2, tab, l);
System.out.println("Liczba 2 w tej tablicy to:"+ilosc);
    }
}