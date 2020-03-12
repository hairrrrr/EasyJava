import java.util.Scanner;

public class helloWorld{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int count = 0;
		
		while(num != 0){
			if((num & 1) == 1){
				count++;
			}
			num = num >>> 1;//如果用 >>,当输入的数位负数时，会进入死循环
		}
		System.out.println(count);
		
	}		
}