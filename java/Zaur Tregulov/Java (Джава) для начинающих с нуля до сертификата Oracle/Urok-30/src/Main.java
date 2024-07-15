//class Animal{
//    Animal(){
//        System.out.println("Animal constructor");
//    }
//
//    Animal(String name){
//        System.out.println("Animal param. cons." + name);
//    }
//}
//
//class Dog extends Animal{
//     Dog(){
//         super("dddf");
//        System.out.println("Dog");
//     }
//
//    Dog(String a){
//        super("sss");
//        System.out.println("Dog param. cons.");
//    }
//}

class Employee{
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        age=age;
        System.out.println(age);
    }
}

class Main {
    static int a = 9;
    int b = 3;

    public static void main(String[] args) {
        Employee employee = new Employee("",59);
        System.out.println(employee);

    }
}