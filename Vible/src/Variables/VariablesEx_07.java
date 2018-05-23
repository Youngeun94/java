package Variables;

public class VariablesEx_07 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f; // f1 = 0.1
		float f2 = 1e1f; // f2 = 10
		float f3 = 3.14e3f; // f3 = 3.14*1000 = 3140.0
		double d = 1.23456789;
		//1e1 = 10, 1e2 = 100, 1e3 = 1000
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		//f1=�ε� �Ҽ����� ����, ���� ǥ������ ����, ���� �����ϰ� ǥ�� �ٹٲ�
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		//d=�ε� �Ҽ���(6�ڸ�����)�� �������� ǥ��, �ٹٲ�
		System.out.printf("d=%14.10f%n",d);
		//d=%14.10f ��ü 14�ڸ� �� �Ҽ��� �Ʒ� 10�ڸ�
		//�Ҽ����� ���ڸ��� �����ϸ� �Ҽ��� �Ʒ��� ���ڸ��� 0���� ä��� ������ ���ڸ��� ����  
		//cf)%014.10���� �����ߴٸ� ���� ���ڸ��� ��� 0���� ä��
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		//%s : ���ڿ��� ���, ���ڿ��� ���̸�ŭ ��°��� Ȯ��
		System.out.printf("[%20s]%n", url);
		//%(-)20s : �ּ� 20���� ��°��� Ȯ��, ��������(��������), ���ڸ��� �������� ǥ��
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
		//%.8s : ���ʿ��� 8���ڸ� ���
		
		//%f�� �⺻������ �Ҽ��� �Ʒ� 6�ڸ������� ��� > 7�ڸ����� �ݿø�
	}

}
