package if_switch;

import java.util.Scanner;

//if-else��
//if(���ǽ�) {���ǽ��� ��(0�� �ƴ� ��)�� �� ����� ������� ���´�.}
//	else {���ǽ��� ����(0)�� �� ����� ������� ���´�.}
public class ifEx_03 {
	public static void main(String[] args) {
		
		System.out.print("���ڸ� �ϳ� �Է��ϼ���. >");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
		
	}

}