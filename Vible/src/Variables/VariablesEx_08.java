package Variables;

import java.util.Scanner;

public class VariablesEx_08 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // ScannerŬ������ ��ü�� ����
		
		System.out.print("���ڸ� ������ �ϳ� �Է����ּ���. > ");
		String input = scanner.nextLine(); // �Է¹��� ������ input�� ����
		int num = Integer.parseInt(input); // �Է¹��� ������ inputŸ���� ������ ��ȯ
		//Integer.parseInt() �޼��� �̿�  : ���ڿ� > int
		
		
		
		System.out.println("�Է³��� : "+ input); //�Է³��� : (input)���� 
		System.out.printf("num=%d%n", num); // num=(10�� ������ ǥ���ϰ� �ٹٲ�)
		
	
	}

}
// ���ڸ� ������ ���ڿ��� �� �� ������?