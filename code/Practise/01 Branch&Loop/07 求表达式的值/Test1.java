public class helloWorld{
	
	public static void main(String[] args) {
		
		int lower = 1;
		int upper = 100;
		double result, sum = 0;
		byte flag = 1;
		
		for(int i = lower; i <= upper; i++){
			result = flag * 1.0 / i;
			sum += result;
			flag *= -1;
		}
		System.out.println(sum);
		
	}		
}