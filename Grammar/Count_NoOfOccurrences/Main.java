import java.util.Scanner;
import java.lang.String;

public class Main { // 클래스 : new 를 통해 인스턴스 생성 
	public int Solution(String str, char c) { // 인스턴스 메소드 
		
		// convert all str to uppercase
		// loop the str and count the number of char 
		int cnt = 0;
		str.toUpperCase();
		for(int i=0; i<str.length(); i++) {
			if(c == str.charAt(i)) cnt++;
		}
		return cnt;		
	};
	
	int a = 1;
	
	public static void main(String[] args) { // 클래스 메소드 
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		Main sol = new Main(); // 클래스 메소드(static이 붙으면)에는 인스턴스 메소드를 사용하기 위해선
		// 클래스 객체를 생성해야한다. 
		// 즉, Solution 함수는 클래스가 아니고, 클래스 안에 있는 함수라 Main 객체(인스턴스)를 생성해야 사용할 수 있음
		int ans = sol.Solution(str, c);
		System.out.println(ans);
	}
}
