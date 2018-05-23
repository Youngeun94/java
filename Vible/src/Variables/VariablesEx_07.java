package Variables;

public class VariablesEx_07 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";
		
		float f1 = .10f; // f1 = 0.1
		float f2 = 1e1f; // f2 = 10
		float f3 = 3.14e3f; // f3 = 3.14*1000 = 3140.0
		double d = 1.23456789;
		//1e1 = 10, 1e2 = 100, 1e3 = 1000
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		//f1=부동 소수점의 형식, 지수 표현식의 형식, 값을 간략하게 표현 줄바꿈
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		
		System.out.printf("d=%f%n", d);
		//d=부동 소수점(6자리까지)의 형식으로 표현, 줄바꿈
		System.out.printf("d=%14.10f%n",d);
		//d=%14.10f 전체 14자리 중 소수점 아래 10자리
		//소수점도 한자리를 차지하며 소수점 아래의 빈자리는 0으로 채우고 정소의 빈자리는 공백  
		//cf)%014.10으로 지정했다면 양쪽 빈자리를 모두 0으로 채움
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		//%s : 문자열로 출력, 문자열의 길이만큼 출력공간 확보
		System.out.printf("[%20s]%n", url);
		//%(-)20s : 최소 20글자 출력공간 확보, 우측정렬(좌측정렬), 빈자리는 공백으로 표시
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
		//%.8s : 왼쪽에서 8글자만 출력
		
		//%f는 기본적으로 소수점 아래 6자리까지만 출력 > 7자리에서 반올림
	}

}
