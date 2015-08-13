import java.util.Random;
public class array07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int b[] = new int[20];
		int n = 0;
		int m = 0;
		int l = 0;
		for (int i = 0; i < 20; i++) {
			b[i] = rnd.nextInt(21)-10;
			System.out.print(b[i]+" ");
			if(b[i]<0){
				n++;
			}else if(b[i]==0){
				m++;
			}else{
				l++;
			}
		}
		System.out.println(" ");
		System.out.println("負值"+n+"個");
		System.out.println("0="+m+"個");
		System.out.println("正值"+l+"個");
	}

}
