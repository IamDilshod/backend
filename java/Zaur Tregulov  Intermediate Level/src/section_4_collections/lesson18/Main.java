package section_4_collections.lesson18;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "madam";
        List<Character> list = new LinkedList<>();

        for(char ch : str.toCharArray()){
            list.add(ch);
        }

        ListIterator<Character> iterator = list.listIterator();
        ListIterator<Character> reverseIterator = list.listIterator(list.size());
        boolean isPalindrome = true;

        while (iterator.hasNext() && reverseIterator.hasPrevious()){
            if (iterator.next() != reverseIterator.previous()){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
