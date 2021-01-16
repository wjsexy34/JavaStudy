//추상클래스를 부모클래스의 역할로 사용할 수 있다.
abstract class Bird {
	public abstract void sing(); // 추상메소드는 본문을 작성하지 않는다(자식클래스에서 오버라이드해서 구현.)

	public void fly() { // 추상클래스 내부에는 일반 메소드 구현 가능.
		System.out.println("날다.");
	}
}

class Duck extends Bird {

	@Override
	public void sing() { // 상속 받은 추상클래스의 추상메소드가 구현되어야 한다. (오버라이드)
		System.out.println("꽥꽥!");
	}

}

public class AbstractClassExam {

	public static void main(String[] args) {
		// Bird b = new Bird(); -> 추상클래스는 인스턴스를 생성할 수 없다.
		Duck duck = new Duck();
		duck.sing();
		duck.fly();	// Duck클래스가 Bird추상클래스를 상속받아서 정의 없이도 사용가능.
	}

}
