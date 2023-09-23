
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class checkArmstronginString
{
    public static boolean checkArmStrong(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        int sum = 0;
        String st = sb.toString();
        
        for(int i = 0;i<st.length();i++){
            String str = Character.toString(st.charAt(i));
            int n = Integer.parseInt(str);
            sum += Math.pow(n, st.length());
        }
        // System.out.println(sum);
        
        int no = Integer.parseInt(st);
        if(no == sum){
            return true;
        }
        return false;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(checkArmStrong(s));
        sc.close();
	}
}
