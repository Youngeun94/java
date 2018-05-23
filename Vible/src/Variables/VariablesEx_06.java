/* println : ������ �� �״�� ���, �ٹٲ�o
 * printf : ���� ���̶� �ٸ� �������� ����ϰ� ���� ��, �ٹٲ�x (%n�־���� �ٹٲ�)
 * ex) �Ҽ��� ��°�ڸ������� ���; ������ 16������ 8������ ���
 * ������(specifier) : %d(10�� ����), %b(boolean����),%o(8�� ����), %x(16�� ����)
 *                 : %f(�ε� �Ҽ���), %e(����), %c(����), %s(���ڿ�)
 *                   ex) System.out.printf("age:%d",age);
 *                       System.out.printf("age:%d year:%d", age, year);
 * �������� �Ǽ������� ���� Ÿ���� ����, ���ͷ��� ���̻縦 �ٿ��� Ÿ���� ����                      
 * > ������ - long : ���̻� l or L(long�� ���� ��Ȯ�� ������ ���� �ҹ��ں��� �빮�� ��ȣ)
          - ���� ���̻簡 ���ٸ� intŸ���� ���ͷ�              
 *        - byte�� shortŸ���� ���ͷ��� ������ ��������x              
 * > �Ǽ��� - floatŸ�� : ���̻� 'f'�Ǵ� 'F'
 *        - doubleŸ�� : ���̻� 'd' �Ǵ� 'D'(doubleŸ���� ���ͷ����� ���̻� 'd'���� ����)                
 */


package Variables;

public class VariablesEx_06 {
	public static void main(String[] args) {
		byte b = 1; //byte ������ 2����Ʈ
		short s = 2; //short ������ 2����Ʈ
		char c = 'A'; //char ������  2����Ʈ
		
		int finger = 10; //�������� finger ����, �ʱ�ȭ
		long big = 100_000_000_000L; //long big = 100000000000L; longŸ���� �������̹Ƿ� ���̻� L
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ; //0x 16����
		//16���� > ���ͷ� �տ� ���λ� '0x' or '0X' ; 8���� > ���λ� '0' ; 2���� > ���λ� '0b'
		
		int octNum = 010; //8���� 10, 10�����δ� 8; ���λ�0 : 8����
		int hexNum = 0x10; //16���� 10, 10�����δ� 16
		int binNum = 0b10; //2���� 10, 10�����δ� 2
		
		System.out.printf("b=%d%n", b); //b�� ���� 10�� ������ ǥ���ϰ� �ٹٲ� ;b=1
		System.out.printf("s=%d%n", s); //s�� ���� 10�� ������ ǥ���ϰ� �ٹٲ� ;s=2
		System.out.printf("c=%c%n", c); //c�� ���� ���ڷ� ǥ���ϰ� �ٹٲ� ;c=A
		System.out.printf("c=%c, %d %n", c, (int)c); 
		//c�� ���� ����, ���������� ǥ���ϰ� �ٹٲ� ; c=A, 65(A�� ������ ǥ���ϸ� 65)
		//�ڹٴ� charŸ���� ���� ������ '%d'�� ����Ϸ��� ����ȯ �ʿ� (int)c
		System.out.printf("finger=[%5d]%n", finger); 
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finter=[%05d]%n", finger);
		// %5d > int t= 123�� ��� '  123' �����̽��� 2�� 123����, 5���� ���ڿ��� ������ ����
		// %-5d> int t= 123�� ��� '123  ' 5���� ���ڿ��� ���� ����
		// %05 > int t= 123�� ��� '00123' �����̽��� �ڸ��� 0 ����
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); //hex�� ���λ縦 ǥ���Ͽ� �ҹ��ڷ� ǥ���ϰ� �ٹٲ�
		//������ %x�� %o�� #�� ����ϸ� ���λ� 0x�� 0�� ǥ�õȴ�
		//������ %X�� 16������ ���Ǵ� ���λ�� �����ڸ� �빮�ڷ� ���
		System.out.printf("octNum=%o, %d%n", octNum, octNum); //octNum�� 8����, 10������ ǥ��
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); 
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		//10������ 2������ ������ִ� �����ڰ� ���� ������, ������ 2�� ���ڿ��� ��ȯ���ִ� Integer.toBinaryString()
	}
}
