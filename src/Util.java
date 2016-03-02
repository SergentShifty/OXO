import java.util.Scanner;
import java.util.InputMismatchException;

public class Util{
	public static int askIntMax(String text, int max){
		Scanner sc = new Scanner(System.in);
		System.out.println(text);
		try{
			int value = sc.nextInt();
			if(value >= 0 && value <= max){
				return value;
			}else{
				return askIntMax(text, max);
			}
		}catch(InputMismatchException e){
			return askIntMax(text, max);
		}
	}
}
