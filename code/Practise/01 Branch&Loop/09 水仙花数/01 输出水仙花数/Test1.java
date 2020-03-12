public class helloWorld{
	
	public static void main(String[] args) {
		
		int lower = 0;
		int upper = 999;
		int cur, num, sum = 0;
		
		for(int i = lower; i <= upper; i++){
			cur = i;
			sum = 0;
			while(cur != 0){
				num = cur % 10;
				sum += num * num * num;
				cur /= 10;
			}
			if(i == sum){
				System.out.print(i + " ");
			}
		}
		
	}		
}