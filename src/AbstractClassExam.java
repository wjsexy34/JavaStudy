//�߻�Ŭ������ �θ�Ŭ������ ���ҷ� ����� �� �ִ�.
abstract class Bird {
	public abstract void sing(); // �߻�޼ҵ�� ������ �ۼ����� �ʴ´�(�ڽ�Ŭ�������� �������̵��ؼ� ����.)

	public void fly() { // �߻�Ŭ���� ���ο��� �Ϲ� �޼ҵ� ���� ����.
		System.out.println("����.");
	}
}

class Duck extends Bird {

	@Override
	public void sing() { // ��� ���� �߻�Ŭ������ �߻�޼ҵ尡 �����Ǿ�� �Ѵ�. (�������̵�)
		System.out.println("�в�!");
	}

}

public class AbstractClassExam {

	public static void main(String[] args) {
		// Bird b = new Bird(); -> �߻�Ŭ������ �ν��Ͻ��� ������ �� ����.
		Duck duck = new Duck();
		duck.sing();
		duck.fly();	// DuckŬ������ Bird�߻�Ŭ������ ��ӹ޾Ƽ� ���� ���̵� ��밡��.
	}

}
