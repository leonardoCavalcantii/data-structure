import java.util.Scanner;

class WarMup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String seq = sc.nextLine();
        String[] v = seq.split(" ");
        String op = "";


        for (int i = 0; i < v.length; i++) {
            op += (Integer.parseInt(v[i]) * n ) + " ";
        }
        System.out.println(op.trim());

    }
}

