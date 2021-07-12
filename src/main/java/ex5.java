import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단 수를 입력하세요");
        int dan = scanner.nextInt();
        for (int i = dan; i <= dan; i++) {
            for (int j = 1; j <= 18; j++) {
                System.out.println(i + "x" + j + "=" + (i * j));

            }

        }
    }
}
