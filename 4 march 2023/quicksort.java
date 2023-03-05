import java.lang.*;
import java.util.List;
import java.util.Scanner;
public class quicksort {

    public int partition (int left, int right, int[] lst) {
        int pivot = lst[right];  
        int i = (left - 1);  
      
        for (int j = left; j <= right - 1; j++)  
        {  
            if (lst[j] < pivot)  
            {  
                i++;  
                int t = lst[i];  
                lst[i] = lst[j];  
                lst[j] = t;  
            }  
        }  
        int t = lst[i+1];  
        lst[i+1] = lst[right];  
        lst[right] = t;  
        return (i + 1);    
    }

    public void Quicksort(int[] lst, int left, int right) {
        if (left < right) {
            int p = partition(left, right, lst);
            Quicksort(lst, left, p - 1);
            Quicksort(lst, p + 1, right);
        }
    }

    public void printlst(int[] lst, int n) {
        System.out.println("Result array:");
        for(int i = 0; i < n; i++) {
            System.out.print(lst[i] + " ");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        n = sc.nextInt();
        int[] lst = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i = 0; i < n; i++) {
            lst[i] = sc.nextInt();
        }
        sc.close();

        quicksort q = new quicksort();
        q.Quicksort(lst, 0, (n - 1));
        q.printlst(lst, n);
    }
}