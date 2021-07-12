import java.util.Scanner;

public class Exam {
    // 1등급 80 ~ 100
    // 2등급 60 ~ 79
    // 3등급 40 ~ 59
    // 4등급 20 ~ 39
    // 5등급 0 ~ 19
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinsh = true;
        while (isFinsh) {
            System.out.println("점수를 입력하세요.");
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 80 && number <=100) {
                System.out.println("1등급");
            } else if (number >= 60 && number <=79) {
                System.out.println("2등급");
            } else if (number >= 40 && number <=59) {
                System.out.println("3등급");
            } else if (number >= 20 && number <=39) {
                System.out.println("4등급");
            } else if (number >= 0 && number <=19) {
                System.out.println("5등급");
            } else {
                System.out.println("숫자를 잘못 입력하셨습니다.");
            }

            System.out.println("계속 하시겠습니까? (계속 : Y, 아니요 : N)");
            String finish = scanner.nextLine();
            if (finish.equals("N") || finish.equals("n")) {
                isFinsh = false;
            }
        }
    }
}