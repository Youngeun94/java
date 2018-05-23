/* println : 변수의 값 그대로 출력, 줄바꿈o
 * printf : 같은 값이라도 다른 형식으로 출력하고 싶을 때, 줄바꿈x (%n넣어줘야 줄바꿈)
 * ex) 소수점 둘째자리까지만 출력; 정수를 16진수나 8진수로 출력
 * 지시자(specifier) : %d(10진 정수), %b(boolean형식),%o(8진 정수), %x(16진 정수)
 *                 : %f(부동 소수점), %e(지수), %c(문자), %s(문자열)
 *                   ex) System.out.printf("age:%d",age);
 *                       System.out.printf("age:%d year:%d", age, year);
 * 정수형과 실수형에는 여러 타입이 존재, 리터럴에 접미사를 붙여서 타입을 구분                      
 * > 정수형 - long : 접미사 l or L(long은 보다 명확한 구분을 위해 소문자보다 대문자 선호)
          - 만약 접미사가 없다면 int타입의 리터럴              
 *        - byte와 short타입의 리터럴은 별도로 존재하지x              
 * > 실수형 - float타입 : 접미사 'f'또는 'F'
 *        - double타입 : 접미사 'd' 또는 'D'(double타입의 리터럴에는 접미사 'd'생략 가능)                
 */


package Variables;

public class VariablesEx_06 {
	public static void main(String[] args) {
		byte b = 1; //byte 정수형 2바이트
		short s = 2; //short 정수형 2바이트
		char c = 'A'; //char 문자형  2바이트
		
		int finger = 10; //정수변수 finger 설정, 초기화
		long big = 100_000_000_000L; //long big = 100000000000L; long타입의 정수형이므로 접미사 L
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ; //0x 16진수
		//16진수 > 리터럴 앞에 접두사 '0x' or '0X' ; 8진수 > 접두사 '0' ; 2진수 > 접두사 '0b'
		
		int octNum = 010; //8진수 10, 10진수로는 8; 접두사0 : 8진수
		int hexNum = 0x10; //16진수 10, 10진수로는 16
		int binNum = 0b10; //2진수 10, 10진수로는 2
		
		System.out.printf("b=%d%n", b); //b의 값을 10진 정수로 표현하고 줄바꿈 ;b=1
		System.out.printf("s=%d%n", s); //s의 값을 10진 정수로 표현하고 줄바꿈 ;s=2
		System.out.printf("c=%c%n", c); //c의 값을 문자로 표현하고 줄바꿈 ;c=A
		System.out.printf("c=%c, %d %n", c, (int)c); 
		//c의 값을 문자, 정수형으로 표현하고 줄바꿈 ; c=A, 65(A를 정수로 표시하면 65)
		//자바는 char타입의 값을 지시자 '%d'로 출력하려면 형변환 필요 (int)c
		System.out.printf("finger=[%5d]%n", finger); 
		System.out.printf("finger=[%-5d]%n", finger);
		System.out.printf("finter=[%05d]%n", finger);
		// %5d > int t= 123일 경우 '  123' 스페이스바 2개 123생성, 5개의 문자열에 오른쪽 정렬
		// %-5d> int t= 123일 경우 '123  ' 5개의 문자열에 왼쪽 정렬
		// %05 > int t= 123일 경우 '00123' 스페이스바 자리에 0 생김
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); //hex를 접두사를 표함하여 소문자로 표시하고 줄바꿈
		//지시자 %x와 %o에 #을 사용하면 접두사 0x와 0이 표시된다
		//지시자 %X는 16진수에 사용되는 접두사와 영문자를 대문자로 출력
		System.out.printf("octNum=%o, %d%n", octNum, octNum); //octNum을 8진수, 10진수로 표현
		System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); 
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);
		//10진수를 2진수로 출력해주는 지시자가 없기 때문에, 정수를 2진 문자열로 변환해주는 Integer.toBinaryString()
	}
}
