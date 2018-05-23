package if_switch;
// if(조건식) { (조건식이 true일 때 수행될 문장들을 적는다)}
//   - 만일 조건식이 참이면 괄호 안의 문장들을 수행하라.
    
public class IfEx_01 {
	public static void main(String[] args) {
		
		int x = 0;
		System.out.printf("x=%d 일 때, 참인 것은?%n",x);
		
		if(x==0) System.out.println("x==0"); //true
		if(x!=0) System.out.println("x!=0"); //false
		if(!(x==0)) System.out.println("!(x==0)"); //false
		if(!(x!=0)) System.out.println("!(x!=0)"); //true
		
		x = 1;
		System.out.printf("x=%d 일 때, 참인것은? %n",x);
		
		if(x==0) System.out.println("x==0"); //false
		if(x!=0) System.out.println("x!=0"); //true
		if(!(x==0)) System.out.println("!(x==0)"); //true
		if(!(x!=0)) System.out.println("!(x!=0)"); //false
		
	}

}
