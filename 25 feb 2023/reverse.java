import java.util.Scanner;
  
class reverse {

    static String reversed_recursion(String s, String res) {
        int n = s.length();
        res = s.charAt(0) + res;
        if (n == 1) {
            return res;
        }

        return reversed_recursion(s.substring(1, n - 1), res);
    }

    public static void main (String[] args) {
        
        String  nstr="";
        //char ch;

        Scanner sc= new Scanner(System.in); 
        System.out.print("Enter string ");
        String str= sc.nextLine();
        sc.close();
            
        System.out.print("Original Word: ");
        System.out.println(str); 
        
        // for (int i=0; i<str.length(); i++)
        // {
        // ch = str.charAt(i); 
        // nstr = ch + nstr; 
        // }
        // System.out.println("Reversed word: "+ nstr);

        nstr = reversed_recursion(str, "");
        System.out.println("Reversed word: " + nstr);
    }
}

// Reverse each substring - recursion and multithreading - paragraph i/p