import java.util.Scanner;

public class array02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("計算n!");
		System.out.println("請輸入一正整數n");
		int n = scn.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		System.out.print("sum="+sum);
	}

}
