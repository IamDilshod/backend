public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }

    void show(int a, int b){
        System.out.println(a + " " + b);
    }

    void show(boolean b1){
        System.out.println(b1);
    }

    void show(String s1){
        System.out.println(s1);
    }

    void show(String s, int a){
        System.out.println("String: "+s+" int: "+a);
    }

    void show(int a, String s){
        System.out.println("Kakoy xoroshiy den segodnya!!!");
    }
}

class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int a = 40;
        mo.show(a);
        mo.show(56, 78);
        boolean b = true;
        mo.show(b);
        String s = "Privet";
        mo.show(s);
        mo.show(34, "Salom");
        mo.show("salom", 34);
    }
}