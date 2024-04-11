import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int i_menor = i;
            for (int j = i; j < vetor.length; j++) {
                if (vetor[j] < vetor[i_menor])
                    i_menor = j;

                int aux = vetor[i];
                vetor[i] = vetor[i_menor];
                vetor[i_menor] = aux;
            }

        }

    }

    public static void main(String[] args) {
        int[] vetor = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] ordenado = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        selectionSort(vetor);
        assert Arrays.equals(vetor, ordenado);

    }

}
