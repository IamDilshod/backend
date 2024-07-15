abstract class Figura{
    int kolichestvoStoron = 0;

    Figura(int kolichestvoStoron){
        this.kolichestvoStoron=kolichestvoStoron;
    }

    abstract void perimetr();

    abstract void ploshad();
}

class Kvadrat extends Figura{
    int a;

    Kvadrat(int a){
        super(a);
        this.a=a;
    }

    @Override
    void perimetr() {
        System.out.println("Kvadrat Perimetr = " + 4*a);
    }

    @Override
    void ploshad() {
        System.out.println("Kvadrat Ploshad = " + a*a);
    }
}

class Pryamougolnik extends Figura{
    int a=2;
    int b=4;

    Pryamougolnik(int a, int b){
        super(a);
        this.a=a;
        this.b=b;
    }

    @Override
    void perimetr() {
        System.out.println("Pryamougolnik Perimetr = " + 2*(a+b));
    }

    @Override
    void ploshad() {
        System.out.println("Pryamougolnik Ploshad = " + a*b);
    }
}

class Okrujnost extends Figura{
    int radius = 3;
    final float PI = 3.1415f;

    Okrujnost(int radius){
        super(radius);
        this.radius=radius;
    }

    @Override
    void perimetr() {
        System.out.println("Okrujnost Kvadrat = " + 2*PI*radius);
    }

    @Override
    void ploshad() {
        System.out.println("Okrujnost Ploshad = " + PI*radius*radius);
    }
}

abstract class Chetirexugolnik extends Figura{
    Chetirexugolnik(){
        super(3);
    }

    void def(){
        System.out.println("Eto chetirexugolnik");
    }
}

public class Main {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat(2);
        f1.perimetr();
    }
}
