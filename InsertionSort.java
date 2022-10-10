public class InsertionSort{

    public static insetionSort(int[] v){
        
        for (int i = 0; i < v.length; i++) {

            int j = i;

            while(j < 0 && v[j] < v[j-1]){
                
                int aux = v[j];
                
                v[j] = v[j-1];
                v[i -1]=aux;
                
                j=-1;
            }
            
        }

    }
}