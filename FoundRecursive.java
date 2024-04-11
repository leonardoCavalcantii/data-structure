import java.util.Scanner;

public class FoundRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        String seq = sc.nextLine();
        String[] vetor = seq.split(" ");
        System.out.println(foundRecursive(vetor, key, 0));
    }

    public static String foundRecursive(String[] vetor, String key, int index) {
        if (index > vetor.length - 1)
            return "-1";
        if (vetor[index].equals(key))
            return vetor[index];
        return foundRecursive(vetor, key, index + 1);
    }

}
