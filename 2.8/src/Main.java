
import java.util.Scanner;


class funkcja {

    public static void znajdzNajdluzszyOdstep(String s) {
        int maxLen = -1;
        char maxChar = ' ';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);
            if (first != last) {
                int currentLen = last - first - 1;

                if (currentLen > maxLen) {
                    maxLen = currentLen;
                    maxChar = ch;
                }
            }
        }
        if (maxLen == -1) {
            System.out.println("-1");
        } else {
            System.out.println("Najdłuższa przerwa wynosi: " + maxLen);
            if (maxChar == ' ') {
                System.out.println("Znak: ' ' (spacja)");
            } else {
                System.out.println("Znak: '" + maxChar + "'");
            }
        }
    }
}
    class zadanie2_8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String zmienna = scanner.nextLine();
            scanner.close();
            System.out.println("Maksymalny odstęp między literami to:");
            funkcja.znajdzNajdluzszyOdstep(zmienna);

        }
    }