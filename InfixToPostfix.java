import java.util.*;
public class InfixToPostfix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convert(str));
        sc.close();
    }
}