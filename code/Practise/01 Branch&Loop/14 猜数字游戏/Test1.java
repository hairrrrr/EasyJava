import java.util.Scanner;
import java.util.Random;

public class helloWorld{
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int toGuess = rd.nextInt(100);//生成的随机数的范围是：【0 - 99】，不包含 100
		
		while(true){
			System.out.println("请输入要输入的数字：(1-100)");
			int num = sc.nextInt();
			if(num > toGuess){
				System.out.println("猜大了。");
			}else if(num < toGuess){
				System.out.println("猜小了。");
			}else{
				System.out.println("猜对了！");
				break;
			}
			
		}
		sc.close();				
	}		
}