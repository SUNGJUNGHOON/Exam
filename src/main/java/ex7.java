import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        String[][] words = {
                {"extraterrestrial", "외계인"},        //  words [0] [0], word [0], [1]
                {"날마다 달마다 성장(成長)하고 발전(發展)한다", "일취월장"},        //  words [1] [0], word [1], [1]
                {"chair", "의자"},        //  words [2] [0], word [2], [1]
        };
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < words.length; i++) {
            System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

            String tmp = scanner.nextLine();

             if(tmp.equals(words[i][1])) {
                System.out.printf("정답입니다.%n%n");
            } else {
                System.out.printf("틀렸습니다. 정답은 %s 입니다. %n%n", words[i][1]);
            }
        } // for

    } //main 의 끝
}
