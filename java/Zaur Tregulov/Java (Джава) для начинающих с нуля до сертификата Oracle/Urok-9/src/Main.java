public class Main {
    int a = 0;
    static int b = 0;
    String name;

    Main(String name){
        name=name;
    }

    public static void main(String[] args) {
        Main main2 = new Main("Alezzz");
        System.out.println(main2.name);
        Main main3 = foo();
        System.out.println(main3.a);
        System.out.println(main2.a);
    }

    public static Main foo(){
        Main main = new Main("Alex");
        main.a=90;
        return  main;
    }
}
