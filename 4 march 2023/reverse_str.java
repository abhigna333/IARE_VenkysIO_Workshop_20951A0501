import java.util.Scanner;


public class reverse_str {
    public static String rev_recurion(String str, String res, int i) {
        if (i < 0) {
            return res;
        }

        res = res + str.charAt(i);
        i--;
        return rev_recurion(str, res, i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        sc.close();
        int n = str.length();
        String res = "";
        System.out.println("Result: " + rev_recurion(str, res, n - 1));
    }
}
