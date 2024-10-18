class BuscaBinaria{
    public int search(int x, int v[], int leftIndex, int rightIndex){
        
        if(leftIndex > rightIndex){
            return -1;        
        }
    
        int mid = (leftIndex + rightIndex ) / 2;
        
        if(x == v[mid]){
            return mid;
        }
        if(x < v[mid]){
            return search(x, v, leftIndex, mid - 1); 
        }
        else{
            return search(x, v, mid + 1, rightIndex);
        }     
    }
}
