package operator;

public class OperatorEx_01 {
	public static void main(String[] args) {
		
		int i = 10;
		float f = 20.0f;
		
		//float result = f + (float)i; 
		float result = f+i;
		//int i를 float로 형변환으로 피연산자의 타입을 일치
		//작은 타입에서 큰 타입으로 형변환하는 경우, 자동적으로 형변환되기때문에 연산자(float) 생략 가능
		System.out.println("float result : "+result);
	}

}
