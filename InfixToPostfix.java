import java.util.*;
public class InfixToPostfix{

    public static int pre(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else if(ch == '^'){
            return 3;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convert(str));
        sc.close();
    }
}