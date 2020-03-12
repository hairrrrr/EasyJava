import java.util.Scanner;

public class helloWorld{
	
	public static void main(String[] args) {
		
		Scanner Age = new Scanner(System.in);
		int age;
		
		while(Age.hasNextInt()){
			
			age = Age.nextInt();
			
			if(age <= 18){
				System.out.println("当前年龄属于：少年");
			}else if(age <= 28){
				System.out.println("当前年龄属于：青年");
			}else if(age <= 55){
				System.out.println("当前年龄属于：中年");
			}else{
				System.out.println("当前年龄属于：老年");
			}
			
		}
		Age.close();
	}
}