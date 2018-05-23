package operator;
//두 문자열을 비교할 때는, 비교 연산자 ==대신 equals()라는 매서드를 사용해야한다
public class OperatorEx_08 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		//String str2 = new String("abc");
		//7,8라인의 차이점은?
		//String str2 = "abc";의 값이랑 (true) String str2 = new String("abc") 값(false) 다름; 
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");
		System.out.printf(" str1 ==\"abc\" ? %b%n", str1 == "abc");
		System.out.printf(" str2 ==\"abc\" ? %b%n", str2 == "abc");
		//왜 false? 내용은 같지만 서로 다른 객체이기 때문에...(뭔말이야)
		//객체는 [클래스 이름] [변수명];으로 선언하고
		//[변수명] = new[클래스이름]();으로 초기화
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		// 대소문자를 구별하지 않고 비교하고 싶으면, equals()대신 equalsIgnoreCase() 사용
	}

}
