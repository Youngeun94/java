package if_switch;

import java.util.Scanner;

//if(score > 60) {
						//System.out.println("합격입니다.") } 블럭의 끝에 ; 붙이지 x

                              
public class ifEx_02 {
	public static void main(String[] args) {
		
		int input;
		
		System.out.print("숫자를 하나 입력하세요. > ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine(); //화면을 통해 입력받은 내용을 tmp에 저장
		input = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 변환하여 input에 저장
		
		if(input==0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		
		if(input!=0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.printf("입력하신 숫자는 %d입니다.", input);
			//System.out.print("입력하신 숫자는 "+input+"입니다.");
		}
		
	}

}
