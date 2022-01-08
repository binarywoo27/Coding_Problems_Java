package domjudge;

import java.util.Scanner;
import java.lang.String;

public class Main { // 클래스 : new 를 통해 인스턴스 생성 
	public String Solution(String str) { // 인스턴스 메소드 
		
		String ans = "";
		for(int i=0; i<str.length(); i++) {
			//if(i.equals(str.indexOf(str.charAt(i))))
			if(str.indexOf(str.charAt(i)) == i) ans += str.charAt(i);
		}
		//System.out.println(ans);
		return ans;
	};
	int a = 1;
	
	public static void main(String[] args) { // 클래스 메소드 
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		Main sol = new Main(); // 클래스 메소드(static이 붙으면)에는 인스턴스 메소드를 사용하기 위해선
		// 클래스 객체를 생성해야한다. 
		// 즉, Solution 함수는 클래스가 아니고, 클래스 안에 있는 함수라 Main 객체(인스턴스)를 생성해야 사용할 수 있음
		String ans = sol.Solution(str);
		System.out.println(ans);
	}
}
