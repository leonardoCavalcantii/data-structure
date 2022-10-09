import java.util.Scanner;

class LinearRecursiva{

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        String seq = sc.nextLine();
        String [] v = seq.split(" ");
        String n = sc.nextLine();
        System.out.println(recursao(v, 0, n));
    }

    public static Integer recursao(String [] v, Integer index, String n){

        if(v[index].equals(n)){
            return  index;
        }

        if(v.length == index + 1){
            return -1;
        }

        return recursao(v, index += 1, n);
    }

}



