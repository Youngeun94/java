package operator;

public class OperatorEx_05 {
	public static void main(String[] args) {
		
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000)/1000.0;
		
		System.out.println(shortPi);
		
		//round�޼���� �Ű������� ���� ���� �Ҽ��� ù°�ڸ����� �ݿø��ϰ� �� ����� ������ �����ִ� �޼���
		//Math.round(3.141592*1000) = 3142
		//shortPi = 3142/1000.0 = 3.142
	}

}
