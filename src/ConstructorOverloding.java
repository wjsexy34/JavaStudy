/*
 * �����ڵ� �޼ҵ�� ���� �������� ������ �� �ִ�. (������ �����ε�.)
 * �������� �Ű������� ������ ������ �ٸ��� �Ͽ� ���� �̸��� �����ڸ� ������ ���� �� �ִ�.
 * */
class Car3{
	//Ÿ�� �ʵ��
	String name;
	int number;
	
	public Car3(String name) {
		this.name = name;
	}
	
	//�����ڸ� ���� �ڵ����� �⺻ �����ڰ� �������� ������, �⺻ �����ڸ� ���� ������ �θ� ����� �� �ִ�.
	public Car3() {
		// �Ʒ� �����ڿ� �ڵ��ߺ�.
//		this.name = "�̸�����";	
//		this.number = 0;
		
		// this() <- ���� �����ڸ� �ǹ��Ѵ�.
		// ����Ʈ �����ڸ� ȣ��� name���� "�̸�����", number���� 0�� �ڵ��� �ʱ�ȭ ��.
		this("�̸�����",0);	// �ùٸ� �ۼ���.
	}
	
	// �Ű������� ����(Ÿ��)�� ������ �ٸ��� �Ͽ� ���� �̸��� �����ڸ� ���� �� ���� �� �ִ�.
	public Car3(String name, int number) {
		this.name = name;
		this.number = number;
	}
}
 
public class ConstructorOverloding {

	public static void main(String[] args) {
		Car3 c1 = new Car3("�ҹ���");
		Car3 c2 = new Car3();
		Car3 c3 = new Car3("������",1111);
		System.out.println(c2.name);
		System.out.println(c2.number);
	}

}
