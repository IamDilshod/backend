package section5_nested_classes.lesson37;

class Car{
    String color;
    int doorCount;
    static int a=9;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
        System.out.println(new Engine(4).horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                '}';
    }

     static  class Engine{
        int horsePower;

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

class Z extends Car.Engine{
    Z(){
        super(4);
    }

    public void zFunc(){
        System.out.println("zFunc");
    }
}

public class Main {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(34);
        System.out.println(engine);
    }
}
