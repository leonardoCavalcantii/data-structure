class MergeSort{

    int [] a;
    int left = 0;
    int right = v.length;
    int mid = (left + right)/2;
    

    public void merge(int[] a, int left, int mid, int right){
        //criando o novo array.
        int[] v = new int[a.length];
        
        for (int i = left; i < right; i++) {
            //array v recebe os indicies de a.
            v[i]=a[i];
        }
        // i -> parte do inicio a metade.
        int i =left;
        // j -> parte da metade para o final.
        int j = mid + 1;
        // k -> começa do inicio. 
        int k = left;

        //confere os limites.
        while(i <= mid && j <= right){
            //se i for menor que j, incrementa i.
            if(v[i]<=v[j]){   
                a[k]=v[i];
                i++;
            }       
            //caso contrario encrementa j.
            else{       
                a[k]=v[j];
                j++;
            }
            k++;
        }
        //caso sobre elementos em i.
        while(i<=mid){
            a[k]=v[i];
            i++;
            k++;
        }
        //caso sobre elementos em j.
        while(j<=mid){
            a[k]=v[j];
            j++;
            k++;
        } 
    }
}
