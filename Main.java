import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0;
        int j = s.length();
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while(i<j){
            Character ch = s.charAt(i);
            // if(i == 0) sb.append(Character.toUpperCase(ch));
            if(ch >= 'A' && ch <= 'Z'){
                list.add(sb.toString());
                sb.setLength(0);
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(Character.toUpperCase(ch));
            }
            i++;
        }
        list.add(sb.toString());
        System.out.println(list);
        for(String st: list){
            System.out.println(st);
        }
    }
}
