import java.security.Signature;
import java.util.Scanner;

public class Main {


    public static int depth = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Перше число: ");int m = scan.nextInt();
        System.out.print("Друге число: ");int n = scan.nextInt();
        int q = Q(m, n, 1);
        System.out.println("Q = " + q);
        System.out.println("Глибина = " + depth);
    }
    static int Q(int m, int n, int level){
        if (level > depth){
            depth = level;
        }
        System.out.println("level = " + level);
        if (m == 0   && n == 0) {
            return 1;
        }
        if (m > 0 && n == 0) {
            return 0;
        }
        if (n > m) {
            return Q(m, m, level);
        }

        return Q(m, n - 1, level + 1) + Q(m - n, n, level + 1);
    }
}