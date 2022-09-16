import java.util.Random;

public class Feature1 { //This feature is for generating a 6 digit license plate with integers from 0-9
	public static void main(String[] args) {
		
		Random random = new Random();
		int upperBound = 10;
		int arr[] = new int[6]; //Creates empty array of length 6
		int r;
		
		for(int i = 0; i < 6; i++) {
			r = random.nextInt(upperBound); //Generates a random integer between 0-9
			arr[i] = r;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]); //Prints number license plate array
		}
		
		/*
		System.out.println("\n\nTEST");
		System.out.println("This test is used to show that there is indeed randomization in the program.\n");
		System.out.println("and that the generated sequence contains values in bounds (0-9).\n");
		
		int arrTEST[][] = new int[10][6];
		int rTEST;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 6; j++) {
				rTEST = random.nextInt(upperBound);
				arrTEST[i][j] = rTEST;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(arrTEST[i][j]); 
			}
			System.out.println("\n");
		}
		*/
	}
}