package operator;

public class OperatorEx_04 {
	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n",a,b,a + b); 
		//10진 정수 + 10진 정수 = 10진 정수 형태로 출력 후 줄바꿈
		System.out.printf("%d - %d = %d%n",a,b,a - b);
		System.out.printf("%d * %d = %d%n",a,b,a * b);
		System.out.printf("%d / %d = %d%n",a,b,a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b,a / (float)b);
		//10진 정수 / 실수 = 실수 형태로 출력 후 줄바꿈
		
		
	}

}
