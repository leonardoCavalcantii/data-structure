//acha o k-esimo termo utilizando a logica do SelectionSort.
package algoritimosDeOrdenacao;

public class EstatisticaDeOrdemSelectionSort {
    public int found(int[] array, int k) {
        if (k > array.length)
            return -1;
        for (int i = 0; i < array.length; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index])
                    min_index = j;
            }
            int aux = array[i];
            array[i] = array[min_index];
            array[min_index] = aux;
        }
        return array[k - 1];
    }
}