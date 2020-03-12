public class helloWorld{
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.printf("%d * %d = %2d  ", j, i, j * i);
			}
			System.out.printf("\n");
		}
		
	}		
}