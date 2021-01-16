
class Car4{
	public void run() {
		System.out.println("Run!");
	}
}

class Bus extends Car4{
	public void ppang() {
		System.out.println("Pang!");
	}
}

public class InheritanceExam {

	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		bus.ppang();
		
		Car4 car = new Car4();
		car.run();
		
		// 부모클래스는 자식이 갖고 있는것을 사용할 수 없다.
		//car.ppang();
	}

}
