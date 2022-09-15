import java.util.Random;

public class Feature1 {
	public static void main(String[] args) {
		
		Random random = new Random();
		int upperBound = 9;
		int arr[] = new int[6];
		int r;
		
		for(int i = 0; i < 6; i++) {
			r = random.nextInt(upperBound);
			arr[i] = r;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}