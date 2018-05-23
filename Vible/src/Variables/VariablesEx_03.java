package Variables;
/* 
 * 상수 - 변수와 마찬가지로 '값을 저장할 수 있는 공간'
 *    - 변수 타입 앞에 키워드 'final'붙여주면 된다.
 */
public class VariablesEx_03 {
	public static void main(String[] args) {
		final int MaxSpeed = 10; // 상수 MaxSpeed를 선언&초기화
		//final int MaxSpeed; > 에러! 상수는 선언과 동시에 초기화 해야함
		//MaxSpeed = 20; > 상수 MaxSpeed의 값은 변경x 때문에 에러메시지 뜬다
		//error message > The final local variable MaxSpeed cannot be assigned.
		//It must be blank and not using a compound assignment
		final int MaxValue = 200;
		
		System.out.println(MaxSpeed);
		System.out.println(MaxValue);
	}
}
