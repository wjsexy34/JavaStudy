
public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;

		gender1 = "boy";

		/*
		 * - 상수를 사용했을 때의 문제점 - String으로 선언된 gender1에는 MALE,FEMALE 둘 중 한가지 값을 갖기 원하는데,
		 * gender1의 type이 String 이기 때문에 gender1 = "소년"; 이렇게 수행 되어도 전혀 문제가 되지 않는다. 
		 * - 실행할때 원했던 값인 MALE,FEMALE이 아닌 다른 값이 들어오게 되므로 문제를 발생시킬 수 있다.
		 */
		
						/* 해결 방법 */
		/*↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓*/
		/* 특정 값만 가져다 사용해야 한다면 열거형을 사용하는것이 좋다. */
		/* 열거타입으로 선언후 열거형안에 있는 값만 대입 가능 */
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;

		/* Gender타입에 다른(없는) 값을 넣기 떄문에, 컴파일 오류 */
//		gender2 = "boy";
	}

}

enum Gender {
	MALE, FEMALE;
}