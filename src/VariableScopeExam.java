
public class VariableScopeExam {
	int globalScope = 10;	// �ν��Ͻ� ����
	static int staticVal = 7;

	public void scopeTest(int value) {
		int localScope = 20;
		System.out.println(globalScope);
		System.out.println(localScope);
		System.out.println(value);
	}

	public void scopeTest2(int value2) {
		System.out.println(globalScope);
		
		/* �����Ͽ��� �߻�, ����! ������ ������ ��Ͽ� ������ �Ǿ����� �ʱ� ������. */
//		System.out.println(localScope);	
//		System.out.println(value);
		System.out.println(value2);
		
		/* static�� �������� static���� ���� �޼ҵ�ȿ��� ����ص� �������� �ʴ´�. */
		System.out.println(staticVal);
	}

	public static void main(String[] args) {
		/* ��� Ŭ������ �ν��Ͻ�ȭ ���� ���� ä�� ����� �� ����. */
		/* �ؾ Ʋ�� �ؾ�� �ƴѰ� ó��. */
		/* Ű���� static�� ����ϸ� �ν��Ͻ�ȭ ���� �ʾƵ� ����� �� �ִ�. */
		/*
		 * static�� �޼ҵ�� ��ü�� �������� �ʾƵ� ����� �� �ֱ� ������ static�� �޼ҵ� ������ static���� ���� �ʵ�� ����� ��
		 * ����. static�� �޼ҵ尡 ����ϴ� ������ �ش� Ŭ������ �ν��Ͻ�ȭ ���� �ʾ��� ���� �ֱ� ������.
		 */
		// System.out.println(globalScope);
		// System.out.println(localScope);
		// System.out.println(value);
		System.out.println(staticVal);

		/* static�� �޼ҵ忡�� static���� ���� �������� ����ϴ� ��� */
		/* ��ü�� �����ϰ� ����Ѵ�. */
		VariableScopeExam v1 = new VariableScopeExam();
		System.out.println(v1.globalScope);

		/* �ν��Ͻ� ������ �ν��Ͻ��� ������ ��(����) ���� ������ �� �ִ� ������ ������ �����. */
		VariableScopeExam v2 = new VariableScopeExam();
		v1.globalScope = 10;
		v2.globalScope = 20;
		System.out.println(v1.globalScope);
		System.out.println(v2.globalScope);

		/* static�� �ʵ�� �ν��Ͻ� ������ ��������°��� �ƴ϶� ���� ������ �� �ִ� ������ �ϳ��ٲ� ����. */
		/* �� ���� �����Ѵ�. */
		/* �̷��� ������ "Ŭ���� ����"�� �Ѵ�. */
		/* Ŭ���� ����: static�� ����, ���� ������ �� �ִ� ������ �ϳ��ۿ� ��� ���� '����'�Ѵ�. */
		/* staticVal : Ŭ���� ����,
		 * globalScope : �ν��Ͻ� ���� */
		v1.staticVal = 50;
		v2.staticVal = 100;
		System.out.println(v1.staticVal); // �Ʒ��� �� ���� Ŭ����.���� ȣ������ �ʾƼ� ������� �׾���.
		System.out.println(v2.staticVal);
		// ��°���� �d�� 100�� ���´�.

		/* Ŭ���� �̸��� ��������ؼ� ���°��� �ٶ����ϴ�. */
		System.out.println(VariableScopeExam.staticVal);
	}

}
