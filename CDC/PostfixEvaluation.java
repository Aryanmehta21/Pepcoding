// You are using Java
import java.util.*;
class PostfixEvaluation{
    public static int evaluate(String postfix){
        Stack<Integer> stack = new Stack<>();
        for(char ch: postfix.toCharArray()){
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }else{
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                
                
                switch(ch){
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand2 - operand1);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return stack.pop();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(evaluate(s));
    }
}