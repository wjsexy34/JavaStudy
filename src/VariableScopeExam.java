
public class VariableScopeExam {
	int globalScope = 10;	// 인스턴스 변수
	static int staticVal = 7;

	public void scopeTest(int value) {
		int localScope = 20;
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}

	public void scopeTest2(int value2) {
		System.out.println(globalScope);
		
		/* 컴파일에러 발생, 범위! 변수를 선언한 블록에 포함이 되어있지 않기 때문에. */
//		System.out.println(localScope);	
//		System.out.println(value);
		System.out.println(value2);
		
		/* static한 변수들은 static하지 않은 메소드안에서 사용해도 문제되지 않는다. */
		System.out.println(staticVal);
	}

	public static void main(String[] args) {
		/* 모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다. */
		/* 붕어빵 틀이 붕어빵은 아닌것 처럼. */
		/* 키워드 static을 사용하면 인스턴스화 하지 않아도 사용할 수 있다. */
		/*
		 * static한 메소드는 객체를 생성하지 않아도 사용할 수 있기 때문에 static한 메소드 내에서 static하지 않은 필드는 사용할 수
		 * 없다. static한 메소드가 사용하는 시점에 해당 클래스가 인스턴스화 되지 않았을 수도 있기 때문에.
		 */
		// System.out.println(globalScope);
		// System.out.println(localScope);
		// System.out.println(value);
		System.out.println(staticVal);

		/* static한 메소드에서 static하지 않은 변수들을 사용하는 방법 */
		/* 객체를 생성하고 사용한다. */
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);

		/* 인스턴스 변수는 인스턴스가 생성될 때(마다) 값을 저장할 수 있는 공간이 별도로 생긴다. */
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);

		/* static한 필드는 인스턴스 생성시 만들어지는것이 아니라 값을 저장할 수 있는 공간이 하나바께 없다. */
		/* 즉 값을 공유한다. */
		/* 이러한 변수를 "클래스 변수"라 한다. */
		/* 클래스 변수: static한 변수, 값을 저장할 수 있는 공간이 하나밖에 없어서 값을 '공유'한다. */
		/* staticVal : 클래스 변수,
		 * globalScope : 인스턴스 변수 */
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal); // 아래와 위 같이 클래스.으로 호출하지 않아서 노란줄이 그어짐.
		System.out.println(v2.staticVal);
		// 출력결과는 둪다 100이 나온다.

		/* 클래스 이름을 직접사용해서 쓰는것이 바람직하다. */
		System.out.println(VariableScopeExam.staticVal);
	}

}
