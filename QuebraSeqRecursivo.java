import java.util.Arrays;

class QuebraSeqRecursivo {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 490, 5 };
        System.out.println(Arrays.toString(vetor));
        System.out.println(found(vetor, 0));
    }

    public static int found(int[] vetor, int index) {
        if (index == vetor.length - 1)
            return -1;
        if (vetor[index] > vetor[index + 1])
            return index;
        return found(vetor, index + 1);
    }
}
