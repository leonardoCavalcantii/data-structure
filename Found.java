import java.util.Scanner;

class Found {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String seq = sc.nextLine();
        String[] vetor = seq.split(" ");
        System.out.println(found(vetor, x));
    }

    public static String found(String[] vetor, String x) {
        for (int i = 0; i < vetor.length; i++) {
            if (x.equals(vetor[i]))
                return "sim";

        }
        return "nao";

    }

}
