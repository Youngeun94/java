package Variables;
/* 
 * ��� - ������ ���������� '���� ������ �� �ִ� ����'
 *    - ���� Ÿ�� �տ� Ű���� 'final'�ٿ��ָ� �ȴ�.
 */
public class VariablesEx_03 {
	public static void main(String[] args) {
		final int MaxSpeed = 10; // ��� MaxSpeed�� ����&�ʱ�ȭ
		//final int MaxSpeed; > ����! ����� ����� ���ÿ� �ʱ�ȭ �ؾ���
		//MaxSpeed = 20; > ��� MaxSpeed�� ���� ����x ������ �����޽��� ���
		//error message > The final local variable MaxSpeed cannot be assigned.
		//It must be blank and not using a compound assignment
		final int MaxValue = 200;
		
		System.out.println(MaxSpeed);
		System.out.println(MaxValue);
	}
}
