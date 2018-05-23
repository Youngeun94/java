package Variables;
/* 문자 리터럴과 문자열 리터럴
 * '문자', "문자열"
 * String name = "Ja"+"va" ; name = java
 * 피연산자 중 한 쪽이 String이면 나머지 한 쪽을 먼저 String으로 변환한 다음 두 String을 결합
 * 문자열/any type + any type/문자열 = 문자열 + 문자열 = 문자열
 * "" - 빈 문자열
 */ 
public class VariablesEx_05 {
	public static void main(String[] args) {
		String name = "Ja"+"va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7+" "); //7_ (_는 공백을 의미)
		System.out.println(" "+7); //_7
		System.out.println(7+""); //7
		System.out.println(""+7); //7
		System.out.println(""+"");
		System.out.println(7+7+"");//14
		System.out.println(""+7+7);//77
	}

}
