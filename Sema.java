public class Sema {
    int[] vetor = new int[10];
    int last = 0;
    public void put(int data){
        //mutex.down();
        vetor[last] = data;
        last++;
        //mutex.up();
        //mutex2.up();
    }
    public int get(int data){
        if(last == 0){
            //mutex2.down();
        }
        return data;
    }

}
