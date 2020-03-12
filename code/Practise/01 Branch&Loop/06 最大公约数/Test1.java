import java.util.Scanner;

public class helloWorld{
	
	public static void main(String[] args) {
		
		Scanner Num = new Scanner(System.in);
		int num1, num2;
		
		while(Num.hasNextInt()){
			
			num1 = Num.nextInt();
			num2 = Num.nextInt();
			
			//将两个数中的较大值放入 max
			int max = num1, min = num2;
			if(num1 < num2){
				max = num2;
				min = num1;
			}
			while(max % min != 0){
				int t = max % min;
				max = min;
				min = t;
			}
			
			System.out.printf("%d 与 %d 的最大公约数为：%d\n", num1, num2, min);
		}
		
	}		
}