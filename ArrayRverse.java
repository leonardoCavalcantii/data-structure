import java.util.Arrays;

class ArrayReverse {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(vetor));
        reverse(vetor);
        System.out.println(Arrays.toString(vetor));

    }

    public static void reverse(int[] vetor) {
        for (int i = 0; i < vetor.length / 2; i++) {
            int aux;
            int temp = vetor.length - 1 - i;
            aux = vetor[i];
            vetor[i] = vetor[temp];
            vetor[temp] = aux;
            System.out.println(i);
            System.out.println(temp);
        }

    }

}
