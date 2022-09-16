import java.util.Random;

public class Feature2 {
	public static void main(String[] args) {
		
		Random random = new Random();
		char arr[] = new char[6];
		char r;
		
		for(int i = 0; i < 6; i++) {
			r = (char) ('A' + random.nextInt(26));
			arr[i] = r;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}