import java.util.Scanner;
import java.util.Random;

public class array06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J5��1~100���������");
		int a[] = new int[5];
		for (int n = 0; n < 5; n++) {
			a[n] = scn.nextInt();
		}
		for (int n = 0; n < 5; n++) {
			for (int j = n + 1; j < 5; j++) {
				if (a[n] > a[j]) {
					int v1 = a[n];
					a[n] = a[j];
					a[j] = v1;
				}
			}
		}
		for (int n = 0; n < 5; n++) {
			System.out.print(a[n] + " ");
		}
		System.out.println();
		System.out.println(a[2] + " ");
		Random rnd = new Random();
		int b[] = new int[5];
		int i = 0;
		boolean flag = false;
		while (i < 5) {
			flag = false;
			b[i] = rnd.nextInt(101);
			System.out.print(b[i] + " ");
			for (int j = 0; j < i; j++) {
				if (b[i] == b[j]) {
					flag = true;
				}
			}
			if (flag == false) {
				i++;
			}
		}
		for (int k = 0; k < 5; k++) {
			for (int j = k + 1; j < 5; j++) {
				if (b[k] > b[j]) {
					int v1 = b[k];
					b[k] = b[j];
					b[j] = v1;
				}
			}
		}
		System.out.println();
		for (int k = 0; k < 5; k++) {
			System.out.print(b[k] + " ");
		}
		System.out.println();
		System.out.println(b[2] + " ");
		if (a[2] > b[2]) {
			System.out.println("�A��ӤF!!");
		} else if (a[2] == b[2]) {
			System.out.println("����!!  �Э��s�}�l");
		} else if (a[2] < b[2]) {
			System.out.println("�q�����");
		}
	}

}
