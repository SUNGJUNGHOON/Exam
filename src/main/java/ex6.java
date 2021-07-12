import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinish = true;
        while (isFinish) {
            System.out.println("단 수를 입력하세요");
            int dan = Integer.parseInt(scanner.nextLine());
            for (int i = dan; i <= dan; i++) {
                for (int j = 1; j <= 20; j++) {
                    System.out.println(i + "x" + j + "=" + (i * j));
                }

                System.out.println("CONTINUE? (yes : o or y, no : x or n)");
                String finish = scanner.nextLine();
                if (finish.equals("x") || finish.equals("n")) {
                    isFinish = false;
                }
            }
        }
    }
}
