import java.util.Scanner;

class DownN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seq = sc.nextLine();
        String[] vetor = seq.split(" ");
        int key = Integer.parseInt(sc.nextLine());
        System.out.println(foundMin(vetor, key));

    }

    public static String foundMin(String[] vetor, int key) {
        order(vetor);
        String menores = "";
        for (int i = 0; i < key; i++) {
            menores += vetor[i] + " ";

        }

        return menores.trim();
    }

    public static void order(String[] vetor) {
        String aux;
        for (int i = 0; i < vetor.length - 1; i++) {
            while (i >= 0 && Integer.parseInt(vetor[i]) > Integer.parseInt(vetor[i + 1])) {
                aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
                i--;
            }

        }
    }
}
