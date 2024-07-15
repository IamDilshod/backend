package section5_nested_classes.lesson38;

class Car{
    String color;
    int doorCount;
    static int a=9;
    Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(34);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                '}';
    }

     class Engine{
        int horsePower;
        static final int k = 9;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        public void f(){
            System.out.println(new Car("",0).doorCount);
        }

         @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

public class Main{

    public static void main(String[] args) {
//        Car car = new Car("red", 4);
//        Car.Engine engine = car.new Engine(450);
//        System.out.println(engine.horsePower);

        Dowhile.foo();
    }
}

class Dowhile {
    public static void foo() {
        int   s1=0b1010010100;
        short  s2=02424;
        short  s3=1300;
        short  s4=0x514;

        System.out.println("s1="+s1);
        System.out.println("s2="+s2);
        System.out.println("s3="+s3);
        System.out.println("s4="+s4);
    }
}