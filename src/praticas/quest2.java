package praticas;
import java.util.Scanner;

public class quest2 {

	public static int ehpar(int num) {
		if(num %2 == 0) {
			return 1;
		}else {
			return 0;
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número: ");
		int num = sc.nextInt();
		int result = ehpar(num);
		//if ()
		System.out.print(result);
		
	}
}