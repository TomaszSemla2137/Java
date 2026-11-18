package lista4.zad3;

public class Main {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();

        System.out.println(stringUtils.isAnagram("listen", "silent"));
        System.out.println(stringUtils.isAnagram("Tom Marvolo Riddle", "I am Lord Voldemort"));
        System.out.println(stringUtils.isAnagram("java", "javascript"));
    }
}