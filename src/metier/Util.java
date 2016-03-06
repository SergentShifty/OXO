import java.util.Scanner;

public class Util{
	public static int askIntPositiveMax(String text, int max){
		Scanner keyboard = new Scanner(System.in);
		if(text == null) text = "Enter an integer between 0 and " + max + " : ";
		String line;
		System.out.print(text);
		if((line = keyboard.nextLine()).isEmpty()){
			System.err.println("Input must be a number!");
			return askIntPositiveMax(text, max);
		}else{
			try{
				int value = Integer.parseInt(line);
				if(value >= 0 && value <= max){
					return value;
				}else{
					System.err.println("Input must be an integer between 0 and " + max);
					return askIntPositiveMax(text, max);
				}
			}catch(NumberFormatException e){
				System.err.println("Input is not an integer!");
				return askIntPositiveMax(text, max);
			}
		}
	}
}
