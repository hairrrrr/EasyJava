import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNextInt()){
			int num;
			num = scan.nextInt();
			int digit;
			while(num != 0){
				digit = num % 10;
				System.out.print(digit + " ");
				num /= 10;
			}
			System.out.print("\n");
		}
		
		scan.close();
		
	}
	
}