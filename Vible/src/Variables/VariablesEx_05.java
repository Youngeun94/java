package Variables;
/* ���� ���ͷ��� ���ڿ� ���ͷ�
 * '����', "���ڿ�"
 * String name = "Ja"+"va" ; name = java
 * �ǿ����� �� �� ���� String�̸� ������ �� ���� ���� String���� ��ȯ�� ���� �� String�� ����
 * ���ڿ�/any type + any type/���ڿ� = ���ڿ� + ���ڿ� = ���ڿ�
 * "" - �� ���ڿ�
 */ 
public class VariablesEx_05 {
	public static void main(String[] args) {
		String name = "Ja"+"va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+" "); //7_ (_�� ������ �ǹ�)
		System.out.println(" "+7); //_7
		System.out.println(7+""); //7
		System.out.println(""+7); //7
		System.out.println(""+"");
		System.out.println(7+7+"");//14
		System.out.println(""+7+7);//77
	}

}