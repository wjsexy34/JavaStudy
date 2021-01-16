/*
 * 생성자도 메소드와 같이 여러개를 정의할 수 있다. (생성자 오버로딩.)
 * 생성자의 매개변수의 유형과 개수를 다르게 하여 같은 이름의 생성자를 여러개 가질 수 있다.
 * */
class Car3{
	//타입 필드명
	String name;
	int number;
	
	public Car3(String name) {
		this.name = name;
	}
	
	//생성자를 만들어서 자동으로 기본 생성자가 생성되지 않으면, 기본 생성자를 직접 정의해 두면 사용할 수 있다.
	public Car3() {
		// 아래 생성자와 코드중복.
//		this.name = "이름없음";	
//		this.number = 0;
		
		// this() <- 나의 생성자를 의미한다.
		// 디폴트 생성자를 호출시 name에는 "이름없음", number에는 0이 자동을 초기화 됨.
		this("이름없음",0);	// 올바른 작성법.
	}
	
	// 매개변수의 유형(타입)과 개수를 다르게 하여 같은 이름의 생성자를 여러 개 가질 수 있다.
	public Car3(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
 
public class ConstructorOverloding {

	public static void main(String[] args) {
		Car3 c1 = new Car3("소방차");
		Car3 c2 = new Car3();
		Car3 c3 = new Car3("구급차",1111);
		System.out.println(c2.name);
		System.out.println(c2.number);
	}

}
