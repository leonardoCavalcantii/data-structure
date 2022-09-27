import java.util.Scanner;

class ConfereDuplicado {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String seq = sc.nextLine();
        String[] v = seq.split(" ");
        System.out.println(confere(v));
    }

    public static boolean confere( String [] v){
       for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {

                if(v[i].equals(v[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
