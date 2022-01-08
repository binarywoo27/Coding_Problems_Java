import java.util.*;

public class Greedy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    System.out.println("거스름돈 금액을 입력해주세요: ");
		int change = sc.nextInt();
		int count=0;
		
		int[] coins = {500, 100, 50, 10};
		
		for(int cash : coins) {
			count += change / cash;
			change = change % cash;
		}
		System.out.println(count);
		
    sc.close();
	}
}