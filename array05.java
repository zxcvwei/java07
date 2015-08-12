import java.util.Random;

public class array05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int b[] = new int[3];
		for (int i = 0; i < 3; i++) {
			b[i] = rnd.nextInt((100) + 1);
		}
		int Max = b[0];//(int Max = 1 or 5 or b[1 or 5])
		for(int i = 0; i < 3; i++){
			Max = Math.max(Max, b[i]);
		}
		int min = b[0];//(int Max = 1 or 5 or b[1 or 5])
		for(int i = 0; i < 3; i++){
			min = Math.min(min, b[i]);
		}
		/*for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (b[i] > b[j]) {
					int v1 = b[i];
					b[i] = b[j];
					b[j] = v1;
				}
			}
		}*/
		for (int i = 0; i < 3; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		System.out.println("Max=" + Max);
		System.out.println("min=" + min);
	}

}
