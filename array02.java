import java.util.Scanner;

public class array02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�p��n!");
		System.out.println("�п�J�@�����n");
		int n = scn.nextInt();
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum = sum * i;
		}
		System.out.print("sum="+sum);
	}

}
