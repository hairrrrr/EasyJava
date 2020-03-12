public class helloWorld{
	
	public static void main(String[] args) {
		
		int lower = 1;
		int upper = 999999;
		int cur, sumOfNum;
		
		for(int i = lower; i <= upper; i++){
			cur = i;
			sumOfNum = 0;
			
			int n = numOfdigit(cur);
			int sumOfdigit;
			int num;
			
			while(cur != 0){
				
				num = cur % 10;
				sumOfdigit = 1;
				for(int j = n; j > 0; j--){
					sumOfdigit *= num;
				}
				sumOfNum += sumOfdigit;
				cur /= 10;
			}
			
			if(i == sumOfNum){
				System.out.print(i + " ");
			}
		}
		
	}
	public static int numOfdigit(int num){
		int count = 0;
		while(num != 0){
			count++;
			num /= 10;
		}
		return count;
	}
}