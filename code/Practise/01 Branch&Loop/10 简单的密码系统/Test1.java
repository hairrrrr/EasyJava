import java.util.Scanner;
import java.lang.Object; 


public class helloWorld{
	
	public static void main(String[] args) {
		
		String codeRight = "abc123";
		int chance = 3;
		int i;
		while(scan.hasNext()){
		for(i = chance; i > 0; i--){
			String codeInput = scan.next();
			if( codeInput.equals(codeRight) ){
				System.out.println("登陆成功");
				break;
			}
			System.out.println("密码错误！您还有" + (i - 1) + " 次机会");
		}
		if(i == 0){
			System.out.println("登陆失败，退出程序！");
		}
		}
		
		
	}		
}