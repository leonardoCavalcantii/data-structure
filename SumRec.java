class SumRec {
    public static int sumRec(int[] vetor, int index) {
        if (index > vetor.length - 1)
            return 0;
        return vetor[index] + sumRec(vetor, index + 1);

    }

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5 };
        assert sumRec(vetor, 0) == 15;

    }

}
