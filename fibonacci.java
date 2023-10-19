
import java.util.*;
public class fibonacci
{

	// public static int fib(int n){

	// 	if(n <= 1){
	// 		return n;
	// 	}

	// 	return fib(n - 1) + fib(n- 2);
	// }
	

	public static int fib(int n){
		int[] fib = new int[n + 2];

		fib[0] = 0;
		fib[1] = 1;

		for(int i = 2;i<=n ;i ++){
			fib[i] = fib[i - 1] + fib [i - 2];
		}

		return fib[n];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// int a = 0;
		// int b = 1;
		
		// int c = 0;
		// System.out.print(a + " " + b);
		// for(int i =2;i<=n;i++){
		//     c = a + b;
		//     System.out.print(" " + c);
		//     a = b;
		//     b = c;
		// }
		// sc.close();

		System.out.println(fib(n));
	}
}
