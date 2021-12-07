import java.util.Scanner;

public class Greedy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int change = sc.nextInt();
		int count=0;
		
		int[] coins = {500, 100, 50, 10};
		
		for(int cash : coins) {
			count += change / cash;
			change = change % cash;
		}
		System.out.println(count);
		
	}
}
