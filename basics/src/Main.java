import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        Polindrome polindrome = new Polindrome();
        System.out.println(polindrome.checkIfPolindrome(n));
       // System.out.println("You have entered the number " +n);
        DivisorSum divisorSum = new DivisorSum();
        SimpleIfElse simpleIfElse = new SimpleIfElse();
       // System.out.println("The divisor sum for your inputted number " +n+ " is "  +divisorSum.divisor_sum(n));
        // System.out.println(simpleIfElse.checkIfElse(n));
        sc.close();


























        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       // System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 0; i <= 3; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            //System.out.println("i = " + i);
        }


    }
}