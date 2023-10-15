import java.util.*;
public class palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int orignal = n;
// 		int temp = 0;
// 		int rem = 0;
// 	    while(n != 0){
// 	        rem = n % 10;
// 	        temp = temp * 10 + rem;
// 	        n = n/10;
// 	    }

        // Stack<Integer> s = new Stack<>();
        // while(n != 0){
        //     rem = n % 10;
        //     n/=10;
        //     s.add(rem);
        // }
        // while(!s.isEmpty()){
        //     temp = temp * 10 + s.pop();
        // }
        // System.out.println(temp);
        
        String s = Integer.toString(n);
        StringBuilder sb = new StringBuilder(s);
        int temp = Integer.parseInt(sb.reverse().toString());
        
        
	    if(temp == orignal){
	        System.out.println("Yes " + temp);
	    }else{
	        System.out.println("No " + temp);
	    }
	}
}
