import java.util.Scanner;

class SemPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seq = sc.nextLine();
        String[] vetor = seq.split(" ");
        System.out.println(noPeers(vetor));
    }

    public static String noPeers(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            boolean found = false;
            for (int j = 0; j < vetor.length; j++) {
                if (i != j && vetor[i].equals(vetor[j])) {
                    found = true;
                    break;
                }
            }
            if (!found)
                return vetor[i];

        }
        return "";

    }

}
