public class MethodOverloading2 {
    int sum(int a, int b){
        return a+b;
    }

    String sum(String s1, String s2){
        return s1+s2;
    }
}

class MethodOverloading2Test{
    public static void main(String[] args) {
        MethodOverloading2 methodOverloading2 = new MethodOverloading2();
        int a = methodOverloading2.sum(3,4);
        System.out.println(a);

        String s = methodOverloading2.sum("privet", "Moy drug");
        System.out.println(s);
    }
}
