package operator;
//�� ���ڿ��� ���� ����, �� ������ ==��� equals()��� �ż��带 ����ؾ��Ѵ�
public class OperatorEx_08 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		//String str2 = new String("abc");
		//7,8������ ��������?
		//String str2 = "abc";�� ���̶� (true) String str2 = new String("abc") ��(false) �ٸ�; 
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1 ==\"abc\" ? %b%n", str1 == "abc");
		System.out.printf(" str2 ==\"abc\" ? %b%n", str2 == "abc");
		//�� false? ������ ������ ���� �ٸ� ��ü�̱� ������...(�����̾�)
		//��ü�� [Ŭ���� �̸�] [������];���� �����ϰ�
		//[������] = new[Ŭ�����̸�]();���� �ʱ�ȭ
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		// ��ҹ��ڸ� �������� �ʰ� ���ϰ� ������, equals()��� equalsIgnoreCase() ���
	}

}