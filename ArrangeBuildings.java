// 1. You are given a number n, which represents the length of a road. The road has n plots on it's each side.
// 2. The road is to be so planned that there should not be consecutive buildings on either side of the road.
// 3. You are required to find and print the number of ways in which the buildings can be built on both side of roads.
// Input Format
// A number n
// Output Format
// A number representing the number of ways in which the buildings can be built on both side of roads.

import java.util.*;

public class ArrangeBuildings{

public static void main(String[] args) throws Exception {
    // write your code here
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int ob = 1;
    int os = 1;
    for(int i =2;i<=n;i++){
        int nb = os;
        int ns = ob+os;
        
        ob = nb;
        os = ns;
    }
    
    int total = ob + os;
    System.out.println(total * total);
    sc.close();
 }

}