package Variables;

import java.util.Scanner;

public class VariablesEx_08 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // Scanner클래스의 객체를 생성
		
		System.out.print("두자리 정수를 하나 입력해주세요. > ");
		String input = scanner.nextLine(); // 입력받은 내용을 input에 저장
		int num = Integer.parseInt(input); // 입력받은 내용을 input타입의 값으로 변환
		//Integer.parseInt() 메서드 이용  : 문자열 > int
		
		
		
		System.out.println("입력내용 : "+ input); //입력내용 : (input)으로 
		System.out.printf("num=%d%n", num); // num=(10진 정수로 표현하고 줄바꿈)
		
	
	}

}
// 두자리 정수가 문자열이 될 수 있을까?