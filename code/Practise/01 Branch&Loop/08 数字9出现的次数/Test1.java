public class helloWorld{
	
	public static void main(String[] args) {
		
		int lower = 1;
		int upper = 10;
		int countOf9 = 0;
		
		for(int i = lower; i <= upper; i++){
			int cur = i;
            countOf9 = 0;
			while(cur != 0){
				if(cur % 10 == 9){
					countOf9++;
				}
				cur /= 10;
			}
		}
		System.out.println(countOf9);
	}		
}