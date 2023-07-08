import java.util.*;
public class ChocolateProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hor = sc.nextInt();
        int ver = sc.nextInt();
        Integer[] costVer = new Integer[ver-1];
        Integer[] costHor = new Integer[hor-1];

        for(int i = 0;i<costHor.length;i++){
            costHor[i] = sc.nextInt();
        }
        for(int i = 0;i<costVer.length;i++){
            costVer[i] = sc.nextInt();
        }

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1, vp = 1;
        int cost = 0;

        while(h<costHor.length && v<costVer.length){
            if(costVer[v] <= costHor[h]){
                cost += (costHor[h] * vp);
                hp++;
                h++;
            }else{
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while(h<costHor.length){
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while(v<costVer.length){
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("Minimum cost to cut chocolates is: " + cost);
        sc.close();
    }
}
