package if_switch;

import java.util.Scanner;

//if(score > 60) {
						//System.out.println("�հ��Դϴ�.") } ������ ���� ; ������ x

                              
public class ifEx_02 {
	public static void main(String[] args) {
		
		int input;
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���. > ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); //ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp); // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ�Ͽ� input�� ����
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		
		if(input!=0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.printf("�Է��Ͻ� ���ڴ� %d�Դϴ�.", input);
			//System.out.print("�Է��Ͻ� ���ڴ� "+input+"�Դϴ�.");
		}
		
	}

}