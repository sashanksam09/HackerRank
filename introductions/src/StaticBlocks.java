import java.util.Scanner;

/**
 * Created by sashank on 10/27/16.
 */
public class StaticBlocks {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag;

    static {
        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("Breadth and height must be positive");
            }
            flag = true;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
