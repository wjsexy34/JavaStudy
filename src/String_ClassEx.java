//import java.util.Calendar;

public class String_ClassEx {

	public static void main(String[] args) {
//		String str = new String("Hello"); 일반적인 객체들은 new키워드로 생성장로 객체생성
		String str = "Hello"; // String클래스는 굉장히 자주 사용되기 때문에 특별하게 저렇게 생성하게 제공.
		System.out.println(str.length());
		System.out.println(str.concat(" world"));
		System.out.println(str);
		str = str.concat(" world"); // 이렇게 = 로 대입을 해줘야. str이 참조하는 부분이 바뀜.
		System.out.println(str);

		System.out.println(str.substring(3)); // 3번 인덱스에서 끝까지 잘라서 출력
		System.out.println(str.substring(3, 6)); // 해당인덱스 부터 해당인덱스 까지 출력
		
	}

}
