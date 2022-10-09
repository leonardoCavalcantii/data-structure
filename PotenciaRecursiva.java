import java .util.Scanner;


class PotenciaRecursiva {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(recursive(i, j));

    }

    public static int recursive(int i, int j){
        
        if(j == 0){
            return 1;
        }

        if(j == 1){
            return i;
        }

        return i * recursive(i, -- j);

        }

    }
    




