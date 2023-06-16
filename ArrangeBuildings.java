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