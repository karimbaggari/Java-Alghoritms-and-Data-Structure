import java.util.List;
import java.util.Stack;

public class theStacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("first");
        stack.push("second");
        stack.push("thirth");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack);
        List<String> stackTwo = new Stack<>();
        stackTwo.add("1");
        stackTwo.add("2");
        stackTwo.add("3");
        stackTwo.add("4");
        stackTwo.add("5");
        System.out.println(stackTwo);
    }

}
