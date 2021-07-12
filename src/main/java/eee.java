import java.util.Scanner;

public class eee {
    // 특급전사 70개이상
    // 1급 60 ~ 79
    // 2급 40 ~ 59
    // 3급 20 ~ 39
    // 불합격 0 ~ 19
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFinsh = true;
        while (isFinsh) {
            System.out.println("개수를 입력하세요.");
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 70) {
                System.out.println("특급전사");
            } else if (number >= 60 && number <= 79) {
                System.out.println("1급");
            } else if (number >= 40 && number <= 59) {
                System.out.println("2급");
            } else if (number >= 20 && number <= 39) {
                System.out.println("3급");
            } else if (number >= 0 && number <= 19) {
                System.out.println("불합격");
            } else {
                System.out.println("개수를 잘못 입력하셨습니다.");
            }

            System.out.println("계속 하시겠습니까? (계속 : Y, 아니요 : N)");
            String finish = scanner.nextLine();
            if (finish.equals("N") || finish.equals("n")) {
                isFinsh = false;
            }
        }
    }
}