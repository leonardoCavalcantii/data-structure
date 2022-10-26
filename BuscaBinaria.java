class BuscaBinaria{

    public boolean search(int x, int v[], int leftIndex, int rightIndex){

        int mid = (leftIndex + rightIndex )/ 2;

        //caso o x não pertença aos limites do array.
        if(leftIndex > rightIndex){
            return false;
        
        }
        //verifica se o x se encontra no meio, se sim, retorna "mid".
        if(x == v[mid]){
            return mid;
        }
        //verfifica se o x se encontra na primeira metade do array, por isso "mid - 1".
        if(x < v[mid]){
            return search(x, v, leftIndex, mid - 1);
        
        }
        //verfifica se o x se encontra na segunda metade do array, por isso "mid + 1".
        else{
            return search(x, v, mid + 1, rightIndex);
        }

        
    }
}