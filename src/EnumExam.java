
public class EnumExam {
	public static final String MALE = "MALE";
	public static final String FEMALE = "FEMALE";

	public static void main(String[] args) {
		String gender1;
		gender1 = EnumExam.MALE;
		gender1 = EnumExam.FEMALE;

		gender1 = "boy";

		/*
		 * - ����� ������� ���� ������ - String���� ����� gender1���� MALE,FEMALE �� �� �Ѱ��� ���� ���� ���ϴµ�,
		 * gender1�� type�� String �̱� ������ gender1 = "�ҳ�"; �̷��� ���� �Ǿ ���� ������ ���� �ʴ´�. 
		 * - �����Ҷ� ���ߴ� ���� MALE,FEMALE�� �ƴ� �ٸ� ���� ������ �ǹǷ� ������ �߻���ų �� �ִ�.
		 */
		
						/* �ذ� ��� */
		/*���������������������������������������������*/
		/* Ư�� ���� ������ ����ؾ� �Ѵٸ� �������� ����ϴ°��� ����. */
		/* ����Ÿ������ ������ �������ȿ� �ִ� ���� ���� ���� */
		Gender gender2;
		gender2 = Gender.MALE;
		gender2 = Gender.FEMALE;

		/* GenderŸ�Կ� �ٸ�(����) ���� �ֱ� ������, ������ ���� */
//		gender2 = "boy";
	}

}

enum Gender {
	MALE, FEMALE;
}