import java.util.Scanner;

public class helloWorld{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int i;
		
		System.out.println("该数的二进制序列为：");
		for(i = 31; i >= 0; i--){
			System.out.print(((num >>> i) & 1) + " ");
		}
		System.out.println("\n" + "偶数位：");
		for(i = 31; i >= 1; i -= 2){
			System.out.print(((num >>> i) & 1) + " ");
		}
		System.out.println("\n" + "奇数位：");
		for(i = 30; i >= 0; i -= 2){
			System.out.print(((num >>> i) & 1) + " ");
		}
				
	}		
}