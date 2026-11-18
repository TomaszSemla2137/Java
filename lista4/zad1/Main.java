package lista4.zad1;

public class Main {
    public static void main(String[] args) {
        // wykorzystanie inicjalizatora bez-argumentowego, robimy pustego studenta jak niektórzy koledzy z roku
        Student s1 = new Student();
        //Inicjalizacja obiektu z wykorzystaniem konstruktora z argumentami
        Student s2 = new Student(21, "Tomasz Demla", 'B');
//wypisanie pustego studenta
        System.out.println(s1);
        //wypisanie pełnego nadziei i danych studentów
        System.out.println(s2);
    }
}