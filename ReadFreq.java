class ReadFreq {
    public static String foundFreq(int[] vetor, int key) {
        String array = "";
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == key) {
                array += i + " ";
            }
        }
        if (array.isEmpty()) {
            return "-1";
        }
        return array.trim();
    }

    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 3 };
        int key = 3;
        assert foundFreq(vetor, key).equals("2 5");
        assert foundFreq(vetor, 24).equals("-1");

    }

}