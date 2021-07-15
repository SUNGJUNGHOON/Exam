public class Continue {
    // 현 상황에서 789만 표시되게
    public static void main(String[] args) {
        for (int i = 7; i < 10; i++) {
            if ( (i >= 10)) {
                continue;
            }
            System.out.println("안녕" +i);

        }
    }
}
