
/* Super와 부모생성자 
 * 객체가 생성될때 반드시 생성자를 실행하고 생성이 된다. 
 * Class가 인스턴스화 될때 [생성자가 실행되면서 객채를 초기화 한다.]
 * 그때 자신의 생성자만 실행이 되는것이 아니고, [부모의 생성자부터] 실행된다.
 * Super 키워드
 * 부모 객체를 나타내는 키워드
 * new연산자로 자식객체를 생성하면, 자식객체가 메모리에 올라갈때 부모인 Car도 함께 메모리에 올라간다.
 * [자식에서 부모의 메소드나 필드를 사용할때도 사용한다.]
 * 
 * */

class Car5 {
	public Car5(String name) {
		System.out.println("Car의 " + name + " 생성자 입니다.");
	}
}

class Truck extends Car5 {
	public Truck() {
		//super();	// 지정하지 않으면 자동으로 기본 생성자를 호출하는 super를 컴파일러가 추가한다.
					// 지정하지 않았을 때 컴파일러는 부모의 기본 생성자만 호출한다. 고로 에러발생. 
		
		super("소방차");	// 기본생성자가 아닐시 반드시 직접 생성자를 호출해줘야 한다.
		System.out.println("Truck의 기본 생성자 입니다.");
	}
}

public class SuperExam {

	public static void main(String[] args) {
		Truck t = new Truck(); //Car5의 생성자가 먼저 실행되고 다음에 Truck의 생성자가 실행된다.
	}

}
