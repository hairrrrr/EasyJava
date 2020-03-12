import java.math.*;

public class helloWorld{
	
	public static void main(String[] args) {
		
		int lower = 1;
		int upper = 100;
			
		for(num = lower; num <= upper; num++){
			if(isPrime(num)){
				System.out.println(num + "是素数");
			}else{
				System.out.println(num + "不是素数");
			}
		}
	
	}
	
	public static boolean isPrime(int num){
		
		if(num <= 1){
			return false;
		}
		if(num == 2 || num == 3){
			return true;
		}
		if(num % 2 == 0){
			return false;
		}
		for(int i = 3; i <= (int)Math.sqrt(num); i++){
			if(num % i == 0){
				return false;
			}
		}
		return true; 
		
	}
}