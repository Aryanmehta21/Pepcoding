/*
 * Problem Statement
The variables num1 and num2 are assigned two integer values which are given as input. Your task is to convert the given integer values of num1 and num2 to binary format. Sum up both the set bit counts of num1 and num2 and reconstruct the obtained sum to binary format. Snap the obtained binary number and obtain the decimal version of the same.
Example:
Input:
5
7
Output:
2
Explanation:
Binary format of num1+num2 = 101 + 111
Set Bits sum of num1 and num2 = 2 + 3 = 5
The binary format of 5 = 101
Snapped value = 010 = 2
Output: 2
 */
import java.util.*;
public class ToggleSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Count Set Bits
        int count1 = 0;
        int count2 = 0;
        while(a != 0){
            if((a & 1) != 0){
                count1++;
            }
            a = a >> 1;
        }
        
        while(b != 0){
            if((b & 1) != 0){
                count2++;
            }
            b = b >> 1;
        }
        
        int count = count1 + count2;
        // Toggle all bits
        int temp = 1;
        while(temp <= count){
            count = count ^ temp;
            temp = temp << 1;
        }
        System.out.println(count);
        sc.close();
    } 
}
