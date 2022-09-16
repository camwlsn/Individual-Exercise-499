import java.util.Random;

public class Feature2 { //This feature is for generating a 6 digit license plate with letters from A-Z
	public static void main(String[] args) {
		
		Random random = new Random();
		char arr[] = new char[6]; //Creates empty array of length 6
		char r;
		
		for(int i = 0; i < 6; i++) {
			r = (char) ('A' + random.nextInt(26)); //Generates a random letter from A-Z
			arr[i] = r;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]); //Prints letter license plate array
		}
		
		
		System.out.println("\n\nTEST");
		System.out.println("This test is used to show that there is indeed randomization in the program");
		System.out.println("and that the generated sequence contains values in bounds (A-Z).\n");
		
		char arrTEST[][] = new char[10][6];
		char rTEST;
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 6; j++) {
				rTEST = (char) ('A' + random.nextInt(26));
				arrTEST[i][j] = rTEST;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print(arrTEST[i][j]); 
			}
			System.out.println("\n");
		}
		
		
	}
}