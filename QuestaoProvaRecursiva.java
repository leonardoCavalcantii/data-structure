public class QuestaoProvaRecursiva {
    public static int search(int[] vetor, int key, int left, int right){
        int mid = (left + right) /2;
        if(left > right)
            return vetor.length;
        if(key == vetor[mid])
            return 0;
        if(key < vetor[mid])
            return 1 + search(vetor, key, left, mid - 1);
        return 1 + search(vetor, key, mid + 1, right);
    }
    public static void main(String[] args) {
        int[] vetor = { 11, 21, 31, 41, 51, 61 };
        System.out.println(search(vetor, 51, 0, vetor.length - 1));
    }
}
