package operator;

public class OperatorEx_01 {
	public static void main(String[] args) {
		
		int i = 10;
		float f = 20.0f;
		
		//float result = f + (float)i; 
		float result = f+i;
		//int i�� float�� ����ȯ���� �ǿ������� Ÿ���� ��ġ
		//���� Ÿ�Կ��� ū Ÿ������ ����ȯ�ϴ� ���, �ڵ������� ����ȯ�Ǳ⶧���� ������(float) ���� ����
		System.out.println("float result : "+result);
	}

}
