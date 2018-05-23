package Variables;
/*
 * 프로그래밍에서의 상수(constant) - 다른 값으로 변경할 수 없는 값
 * 평소의 상수 ex) 12, 123, 3.14 값은 프로그래밍에서는 리터럴(literal)이라고 부름
 * 
 * int year(변수) = 2018(리터럴);
 * final int MaxValue(상수) = 100(리터럴);
 * 
 */
public class VariablesEx_04 {
	public static void main(String[] args) {
		int triangleArea = (20*2)/2; //삼각형의 면적을 구하는 공식
		int rectangleArea = 20*10; //직사각형의 면적을 구하는 공식
		
		System.out.println(triangleArea);
		System.out.println(rectangleArea);
		
		final int width =20; //폭
		final int height =10; //높이
		
		int triangle_Area = (width*height)/2; //삼각형의 면적을 구하는 공식
		int rectangle_Area = width*height; //사각형의 면적을 구하는 공식
//효과 - 상수는 리터럴에 의미있는 이름을 붙여서 코드의 이해와 수정을 쉽게 만든다
//     final쓰면 width 값이랑 height만 바꾸면 면적을 쉽게 구할 수 있음
		
		System.out.println(triangle_Area);
		System.out.println(rectangle_Area);
		
	}

}
