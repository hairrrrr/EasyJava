public class helloWorld{
	
	public static void main(String[] args) {
		
		int lowerYear = 1000;
		int upperYear = 2000;
		
		for(int i = lowerYear; i <= 2000; i++){
			if(isLeap(i)){
				System.out.print(i + " ");
			}
		}
		
	}
	public static boolean isLeap(int year){
		if( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0) ) {
			return true;
		}
		return false;
	}
}