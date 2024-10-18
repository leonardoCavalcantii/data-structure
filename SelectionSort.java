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
}
