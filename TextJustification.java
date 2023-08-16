import java.util.*;
public class TextJustification {

    public static List<String> fullJustify(String[] words, int maxWidth){
        List<String> result = new ArrayList<>();
        int n = words.length;
        int i = 0;
        while(i < n){
            int j = i + 1;
            int lineLength = words[i].length();
            while(j < n && (lineLength + words[j].length() + (j - i - 1) < maxWidth)){
                lineLength += words[j].length();
                ++j;
            }

            int diff = maxWidth - lineLength;
            int numberOfWords = j - i;

            if(numberOfWords == 1 || j >= n) result.add(leftJustify(words, diff, i, j));
            else result.add(middleJustify(words, diff, i, j));
            i=j;
        }
        return result;
    }

    public static String middleJustify(String[] words, int diff, int i, int j){
        int spaceNeeded = j - i - 1;
        int spaces = diff / spaceNeeded;
        int extraSpaces = diff % spaceNeeded;

        StringBuilder result = new StringBuilder(words[i]);

        for(int k = i + 1 ;k < j;k++){
            int spacesToApply = spaces  + (extraSpaces-- > 0 ? 1 : 0);
            result.append(" ".repeat(spacesToApply) + words[k]);
        }
        return result.toString();
    }

    public static String leftJustify(String[] words, int diff, int i, int j){
        int spaceOnRight = diff - (j - i -1);
        StringBuilder result = new StringBuilder(words[i]);
        for(int k = i+1;k<j;k++){
            result.append(" " + words[k]);
        }
        result.append(" ".repeat(spaceOnRight));
        return result.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i =0;i<n;i++){
            words[i] = sc.next();
        }
        int maxWidth = sc.nextInt();

        List<String> result = fullJustify(words, maxWidth);
        System.out.println(result);
        sc.close();
    }
}
