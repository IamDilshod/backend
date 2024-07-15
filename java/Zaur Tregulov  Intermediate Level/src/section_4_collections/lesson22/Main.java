package section_4_collections.lesson22;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("one");
        stack.add("two");
        stack.add("three");

//        System.out.println(stack.pop());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

