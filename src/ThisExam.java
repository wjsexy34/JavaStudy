/*
 * 
 * this
 * this�� ���� ��ü, �ڱ� �ڽ��� ��Ÿ����.
 * Ŭ���� �ȿ��� �ڱ� �ڽ��� ������ �ִ� �޼ҵ带 ����� ���� this.�޼ҵ��()���� ȣ���� �� �ִ�.
 * 
 * */

class Car2 {
	String name;
	int number;
	
	public Car2(String name) {
		//name = name; -> ������ ����� ������ �켱 ����ϱ� ������ 'name=name'�̶�� �ڵ�� �Ű�����
		//				  name�� ���� �Ű����� name�� �����϶�� �ǹ̰� �ȴ�.
		//				  ��, �ʵ�� �ٲ��� �ʴ´�. �̷� ��� �ʵ��� ���� �����Ϸ��� JVM���� �˷��ֱ� ���ؼ� thisŰ���带 ����Ѵ�.
		
		this.name = name;
		/* ���� this.name�� �ʵ� name�� ���ϰ� =(����) ���� name�� �Ű������� �ǹ��Ѵ�. 
		 * �� �Ű������� ���� �ʵ鿡 �����϶�� �ǹ̰� �ȴ�.
		 * */
	}
}

public class ThisExam {

	public static void main(String[] args) {
	
	}

}
