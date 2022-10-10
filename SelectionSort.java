
public class SelectionSort{

    
    public static void selectionSort(int[] v){

    for (int i = 0; i < v.length; i++) {
        int indicie_menor = i;
        
        for (int j = i + 1; j < v.length; j++) {
            if(v[j] < v[indicie_menor]);
            indicie_menor = j;

            }

            int aux = v[i];
            v[i] = v[indicie_menor];
            v[indicie_menor] = aux;  

        }

    }
}