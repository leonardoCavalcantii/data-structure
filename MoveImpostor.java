import java.util.Scanner;
import java.util.Arrays;

class MoveImpostor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seq = sc.nextLine();
        String[] vetor = seq.split(" ");
        move(vetor);
        System.out.println(Arrays.toString(vetor));

    }

    public static void move(String[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (Integer.parseInt(vetor[i]) > Integer.parseInt(vetor[i + 1])) {
                while (i >= 0 && Integer.parseInt(vetor[i]) > Integer.parseInt(vetor[i + 1])) {
                    String aux;
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    i--;
                }
                break;

            }

        }

    }

}
