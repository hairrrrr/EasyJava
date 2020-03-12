import java.util.Scanner;

public class helloWorld{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入两个数：");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int rmd = num1 % num2;
		//18 % 24 == 18;
		
		while(rmd != 0){
			num1 = num2;
			num2 = rmd;
			rmd = num1 % num2;
		}
		System.out.println("最大公约数是：" + num2);
	}		
}