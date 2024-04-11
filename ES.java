import java.util.Scanner;

public class ES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNextLine()) {
            String name = sc.nextLine().strip();
            System.out.println(i++ + " " + name);

        }

    }

}
