public class Test9 {
    public static void main(String[] args) {
        // Agar for loop da shart tekshirish joyini shunday tashlab ketsak, ya'ni
        // shartga tekshirmasak, u holda har doim "true" ni qabul qiladi. Bu holatda
        // "infinitive loop" hosil bo'ladi. Pastda shart berilmagan for loop berilgan va
        // u inifinitive loop bo'lib ishlaydi!
        for (int i=0; ; i++){
            System.out.println(i);
        }
    }
}
