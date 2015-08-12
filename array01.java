import java.util.Scanner;

public class array01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入想說的話");
		String str = scn.nextLine();
		// 字串換字元陣列
		char data[] = str.toCharArray();
		int len = data.length;
		char data1[] = new char[len];
		for (int i = 0; i < len; i++) {
			data1[i]=data[len-i-1];
		}
		String newstr = new String(data1);
		System.out.print(newstr);
	}

}
