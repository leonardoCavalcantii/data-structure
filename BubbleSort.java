
import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] array = {2, 1, 4, 5, 6, 7, 3};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
