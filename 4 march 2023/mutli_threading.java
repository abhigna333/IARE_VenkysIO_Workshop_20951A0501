import java.lang.*;

public class mutli_threading extends Thread {
    public void run() {
        System.out.println("Thread running happening");
    }

    public String rev_recursion(String str, String res, int i) {
        if (i < 0) {
            System.out.println(res);
            return "";
        }

        res = res + str.charAt(i);
        i--;
        return rev_recursion(str, res, i);
    }

    public static void main(String[] args) {
        mutli_threading t1 = new mutli_threading();
        mutli_threading t2 = new mutli_threading();
        mutli_threading t3 = new mutli_threading();
        t1.start();
        t2.start();
        long start = System.currentTimeMillis();
        t3.rev_recursion("abhigna", "", 6);
        long end = System.currentTimeMillis();
        System.out.println("Time taken = " + (end - start) + " ms");
        System.out.println("t1: " + t1.getId());
        System.out.println("t2: " + t2.getId());
        System.out.println("t3: " + t3.getId());

    }
    
}
