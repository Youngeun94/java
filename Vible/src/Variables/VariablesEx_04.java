package Variables;
/*
 * ���α׷��ֿ����� ���(constant) - �ٸ� ������ ������ �� ���� ��
 * ����� ��� ex) 12, 123, 3.14 ���� ���α׷��ֿ����� ���ͷ�(literal)�̶�� �θ�
 * 
 * int year(����) = 2018(���ͷ�);
 * final int MaxValue(���) = 100(���ͷ�);
 * 
 */
public class VariablesEx_04 {
	public static void main(String[] args) {
		int triangleArea = (20*2)/2; //�ﰢ���� ������ ���ϴ� ����
		int rectangleArea = 20*10; //���簢���� ������ ���ϴ� ����
		
		System.out.println(triangleArea);
		System.out.println(rectangleArea);
		
		final int width =20; //��
		final int height =10; //����
		
		int triangle_Area = (width*height)/2; //�ﰢ���� ������ ���ϴ� ����
		int rectangle_Area = width*height; //�簢���� ������ ���ϴ� ����
//ȿ�� - ����� ���ͷ��� �ǹ��ִ� �̸��� �ٿ��� �ڵ��� ���ؿ� ������ ���� �����
//     final���� width ���̶� height�� �ٲٸ� ������ ���� ���� �� ����
		
		System.out.println(triangle_Area);
		System.out.println(rectangle_Area);
		
	}

}
