package Variables;
/*
 * x값과 y값 서로 교환하기
 */
public class VariablesEx_02 {
	public static void main(String[] args) {
		
		int x = 10; //정수 변수 x 설정, 10 대입
		int y = 20; //정수 변수 y 설정, 20 대입
		int temp = 0; //값을 임시로 저장할 변수 temp 설정
		
		System.out.println("x : "+x+", y : "+y);
		
		temp =x;
		x=y;
		y=temp;
		
		System.out.println("x : "+x+", y : "+y);
		
	}

}
