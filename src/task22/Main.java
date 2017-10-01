package task22;

public class Main {
    public static void main(String[] args) {
//        String s = "((())))";
        String s = "( 1 81 + = 12(( w) w;,) q) wq) ++ = +)+";

        StackC stack = new StackC(s.length());
        while (!stack.isFull()) {
            for (int i = 0; i < s.length(); i++) {
                stack.push(s.charAt(i));
            }
        }

        int count = 0;
        int count1 = 0;
        while (!stack.isEmpty()) {
            char c = stack.pop();
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count1++;
            }
        }
        if (count == count1) {
            System.out.println("Expression is written correctly");
        } else {
            System.out.println("Expression is not written correctly");
        }
    }
}
