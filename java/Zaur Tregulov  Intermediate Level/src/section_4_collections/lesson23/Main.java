package section_4_collections.lesson23;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(null, "four");
        map.put(4, null);

        System.out.println(map);

        System.out.println("----------------------");

        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("----------------------");

        int arr[] = {7,8,1,7,9,8,6};
        Map<Integer, Integer> map1 = new HashMap<>();

        for (int i=0; i<arr.length; i++){
            if (!map1.containsKey(arr[i])){
                System.out.println("yes");
                map1.put(arr[i], 1);
            }else{
                map1.put(arr[i], map1.get(arr[i])+1);
            }
        }

//        System.out.println(map1);

        S s1 = new S("one", 1);
        S s2 = new S("one", 1);

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}

class S{
    String name;
    int age;

    S(String name, int age){
        this.name=name;
        this.age=age;
    }
}