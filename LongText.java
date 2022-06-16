import java.util.Scanner;

public class LongText {
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = obj.nextLine();
		System.out.println("Enter a number");
		int n = obj.nextInt();

		int vowelCount = 0;

		String VOWELS = "aeiou";
		String outputString = "";

		for(int i = 0; i < input.length(); i++){

	
			if(VOWELS.indexOf(input.charAt(i)) > -1){

				for(int j = 0; j < n; j++){

					outputString += input.charAt(i);
				}
			}
			else{
				outputString += input.charAt(i);
			}
		}

		
		System.out.println(outputString);

	}
}