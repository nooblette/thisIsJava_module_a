package package1;

import package3.C;
public class A {
	// 메서드 선언
	public void method(){
		System.out.println("thisIsJava_module_a package1 A class method 실행");
	}

	public C getC() {
		C c = new C();
		return c;
	}
}