class SumRec {
    public static int sumRec(int[] vetor, int index) {
        if (index > vetor.length - 1)
            return 0;
        return vetor[index] + sumRec(vetor, index + 1);
    }
}
