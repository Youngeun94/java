package Variables;
/*
 * x���� y�� ���� ��ȯ�ϱ�
 */
public class VariablesEx_02 {
	public static void main(String[] args) {
		
		int x = 10; //���� ���� x ����, 10 ����
		int y = 20; //���� ���� y ����, 20 ����
		int temp = 0; //���� �ӽ÷� ������ ���� temp ����
		
		System.out.println("x : "+x+", y : "+y);
		
		temp =x;
		x=y;
		y=temp;
		
		System.out.println("x : "+x+", y : "+y);
		
	}

}
