import java.util.ArrayDeque;
import java.util.Deque;

class funkcje {
    public static boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);


            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }


                char top = stack.pop();


                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
            }
        }


        return stack.isEmpty();
    }
}
class zad2_9{
    public static void main(String[] args) {
        System.out.println("() "+funkcje.isValid("()"));
        System.out.println("()[]{} "+funkcje.isValid("()[]{}"));
        System.out.println("(] "+funkcje.isValid("(]"));
        System.out.println("([)] "+funkcje.isValid("([)]"));
        System.out.println("{[]} "+funkcje.isValid("{[]}"));
    }
}