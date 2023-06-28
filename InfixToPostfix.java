import java.util.*;
public class InfixToPostfix{

    public static int pre(char ch){
        if(ch == '+' || ch == '-'){
            return 1;
        }else if(ch == '*' || ch == '/'){
            return 2;
        }else if(ch == '^'){
            return 3;
        }else {
            return 0;
        }
    }

    public static String convert(String exp){
        Stack<Character> s = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        for(char ch: exp.toCharArray()){
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                postfix.append(ch);
            }else if(ch == '('){
                s.push(ch);
            }else if(ch == ')'){
                while(!s.isEmpty() && s.peek() != '('){
                    postfix.append(s.peek());
                    s.pop();
                }
                s.pop();
            }else{
                while(!s.isEmpty() && pre(ch) <= pre(s.peek())){
                    postfix.append(s.peek());
                    s.pop();
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convert(str));
        sc.close();
    }
}