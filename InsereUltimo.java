import java.util.Arrays;
import java.util.Scanner;


class InsereUltimo{

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String seq = sc.nextLine();
        String [] v = seq.split(" ");
        System.out.println(insetionSort(v));

    
    }
     
    public static String insetionSort(String [] v){
        
        for (int i = 1; i < v.length; i++) {

            int j = i;

            while(j  > 0 && Integer.parseInt(v[j]) < Integer.parseInt(v[j-1])){
                String aux = v[j];
                
                v[j] = v[j-1];
                v[j -1]=aux;
                
                j-=1;
            }
            
        }
        return Arrays.toString(v);

    }
}
