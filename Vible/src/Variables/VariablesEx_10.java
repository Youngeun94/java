package Variables;

public class VariablesEx_10 {
	public static void main(String[] args) {
		double d = 85.4;
		int score = (int)d; //double형태의 d를 int로 형변환(85)하여 score에 대입, 
		
		System.out.println("score = "+ score);
		System.out.println("d="+d);
		//형변환 후에도 피연산자에는 아무런 변화가 없음
	}

}
