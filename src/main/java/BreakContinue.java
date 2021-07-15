<<<<<<< HEAD
public class BreakContinue {
    //break 응용하여 2단의 x5 까지만 출력
    public static void main(String[] args) {
        Loop1:
        for (int i = 2; i <= 2; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 6)
                    break Loop1;

                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
=======
public class BreakContinue {
    //break 응용하여 2단의 x5 까지만 출력
    public static void main(String[] args) {
        Loop1:
        for (int i = 2; i <= 2; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j == 6)
                    break Loop1;

                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println();
        }
    }
}
>>>>>>> 3b0f5c9c71071258487abc927b6da773d27ab1e3
