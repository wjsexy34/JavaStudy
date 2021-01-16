/*
 * 
 * this
 * this는 현재 객체, 자기 자신을 나타낸다.
 * 클래스 안에서 자기 자신이 가지고 있는 메소드를 사용할 때도 this.메소드명()으로 호출할 수 있다.
 * 
 * */

class Car2 {
	String name;
	int number;
	
	public Car2(String name) {
		//name = name; -> 가깝게 선언된 변수를 우선 사용하기 때문에 'name=name'이라는 코드는 매개변수
		//				  name의 값을 매개변수 name에 대입하라는 의미가 된다.
		//				  즉, 필드는 바뀌지 않는다. 이런 경우 필드라는 것을 컴파일러와 JVM에게 알려주기 위해서 this키워드를 사용한다.
		
		this.name = name;
		/* 앞의 this.name은 필드 name을 말하고 =(이퀄) 뒤의 name은 매개변수를 의미한다. 
		 * 즉 매개변수의 값을 필들에 대입하라는 의미가 된다.
		 * */
	}
}

public class ThisExam {

	public static void main(String[] args) {
	
	}

}
