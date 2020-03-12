import java.util.Scanner;
import java.math.*;

public class helloWorld{
	
	public static void main(String[] args) {
		
		Scanner Num = new Scanner(System.in);
		int num;
	
		while( Num.hasNextInt() ) {
			
			num = Num.nextInt();
		
			if(num <= 1){
				System.out.println(num + "不是素数");
			}else if(num == 2 || num == 3){
				System.out.println(num + "是素数");
			}else if(num % 2 == 0){
				//偶数不是素数
				System.out.println(num + "不是素数");
			}else {
				boolean flag = true;
				for(int i = 3; i <= Math.sqrt(num); i++){
					if(num % i == 0){
						flag = false;
						System.out.println(num + "不是素数");
						break;
					}
				}
				if(flag){
					System.out.println(num + "是素数");
				}
			}
		}
		Num.close();
	}
}