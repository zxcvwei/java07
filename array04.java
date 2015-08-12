import java.util.Scanner;

public class array04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一正整數n");
		int n = scn.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (int) (i * (i + 1));
		}
		System.out.println("sum=" + sum);

	}

}
