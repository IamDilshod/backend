public class Main {
	public static void main(String[] args) {
		float f1 = 45.34f;
		float f2 = 466332.234f;
//		float f3 = 45.43; // Bu yerda sonni oxiriga "f" yoki "F" ni yozmasak xato beradi.
		// Sababi default holatda float va doublega o'xshagan(45.76; 4.53) sonlarda
		// default holatda
		// double ni oladi. Float double ga mos tushmagani uchun, xatolik beradi. Double
		// ni ichida
		// float bo'ladi deb ham tushunsak ham bo'ladi. Double ni ichiga float kirib
		// ketadi.

		float f4 = 50; // Bu holatda e'tibor bergan bo'lsangiz oxiriga "f" ni qo'shmadik.
		// Sababi 50 soni butun sondir ya'ni int dir. int type ham double type ni ichiga
		// kirib ketadi. Double typeni ichida esa, float va int type lar mavjud.
		System.out.println(f1);
		System.out.println(f2);

		double d1 = 2342342.455;
		double d2 = 54325.45;
		double d3 = 87; // Bu holatda e'tibor bergan bo'lsangiz oxiriga "d" ni qo'shmadik.
		// Sababi int type ham double type ni ichiga kirib ketadi.
		System.out.println(d1);
		System.out.println(d2);

		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1);
		System.out.println(bool2);

		boolean bool3 = 5 == 6;
		System.out.println(bool3);
	}

	public static void foo() {

	}
}
