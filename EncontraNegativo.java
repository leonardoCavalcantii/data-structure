import java.util.Scanner;

class EncontraNegativo{

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String seq = sc.nextLine();
        String [] v = seq.split(" ");
        System.out.println(recursao(v,0));
            
        }

    public static String recursao(String[] v, int i){

        if(Integer.parseInt(v[i]) < 0){
            return v[i];
    }
        

        if(v.length == i + 1){
            return "-";
        }
        
        return recursao(v, i+=1);
        
    }
        

}



