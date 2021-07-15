public class WhileBreak {
    // while 및 boolean 응용, break
    public static void main(String[] args) {
        boolean isFinish = true;
        int count = 1;
        while (true) {
            if(count == 5) {
                break;
            }
            System.out.println("숫자" + count);
            count++;

        }
        System.out.println("끝");
    }
}