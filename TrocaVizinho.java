import java.util.Scanner;
import java.util.Arrays;

class TrocaVizinho{
    
    public static void main(String[] atgs){
        Scanner sc = new Scanner(System.in);
        
        String seq = sc.nextLine();
        String[] v = seq.split(" ");
        System.out.println(troca(v));
    }

    public static String troca(String[] v){
        for (int i = 0; i < v.length - 1; i +=2 ) {
            String aux = v[i];
            v[i] = v[i+1];
            v[i+1] = aux;
            
        }
        return Arrays.toString(v);

    }




}