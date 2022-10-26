class QuickSort{

    public void quickSort(int[]v, int left, int right){

        if(left < right){
            
            int index_pivot = partition (v, left, right);
            
            quickSort(v, left, index_pivot - 1);
            quickSort(v, index_pivot + 1, right);
        }


    }

    public int partition(int []v, int left, int right){
        
        int pivot = v[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            
            if(v[j]<=pivot){
                i+=1;
                swap(v, i, j);
            }
            
        }
        swap(v, left, i);
        return i;
    }
}