//import java.util.Calendar;

public class String_ClassEx {

	public static void main(String[] args) {
//		String str = new String("Hello"); �Ϲ����� ��ü���� newŰ����� ������� ��ü����
		String str = "Hello"; // StringŬ������ ������ ���� ���Ǳ� ������ Ư���ϰ� ������ �����ϰ� ����.
		System.out.println(str.length());
		System.out.println(str.concat(" world"));
		System.out.println(str);
		str = str.concat(" world"); // �̷��� = �� ������ �����. str�� �����ϴ� �κ��� �ٲ�.
		System.out.println(str);

		System.out.println(str.substring(3)); // 3�� �ε������� ������ �߶� ���
		System.out.println(str.substring(3, 6)); // �ش��ε��� ���� �ش��ε��� ���� ���
		
	}

}
