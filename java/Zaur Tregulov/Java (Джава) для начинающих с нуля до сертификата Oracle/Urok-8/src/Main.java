public class Main {
    public final int a;
    public final double d;

    Main(){
        this.a = 5;
        d=90;
    }

    Main(int a){
        this.a=a;
        d=45.5;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.a);
        Main main1 = new Main(445);
        main1.abc(45);
    }

    public void abc(int b){
        final int c=9;
        System.out.println(b+c);
    }
}