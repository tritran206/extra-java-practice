public class Recursion {

    // f(f(f(a))) --- a = 20
    // f(a) = 5 + a
    // f(20) = 5 + 20 = 25

    // f(f(f(20))) --- f(f(25))

    // f(25) = 5 + 25 + 30

    // f(f(f(20))) -- f(f(25)) --- f(30)

    // f(30) = 5 + 30 = 35

    // f(f(f(20))) --- f(f(25)) ---- f(30) ----- 35



    //Summation method
    //Summation(3) --- 3 + 2 + 1
    public static int Summation (int n) {
        //Base Case: WE ARE AT THE END
        if (n <= 0) {
            return 0;
        }
        //Recursive Case: KEEP GOING
        else {
            // 3 + Summation(2)
            // 3 + 2 + Summation(1)
            // 3 + 2 + 1 + Summation(0)
            // 3 + 2 + 1 +  0  = 6
            return n + Summation(n-1);
        }
    }


    // Factorial(5) or 5! ---> 5 * 4 * 3 * 2 * 1 ---> 5 * 4!
    // 4! --- 4 * 3 * 2 * 1
    public static int Factorial(int n) {
        // Base Case:
        if (n <= 1) { // mult identity
            return 1;
        }
        // Recursive Case
        else {
            // 4 * Factorial(3)
            // 4 * 3 * Factorial(2) or Factorial(3-1)
            // 4 * 3 * 2 * 1
            return n * Factorial(n-1);
        }
    }

    // 5^3 = 5 * 5 * 5
    public static int Exponentiation(int n, int p) {
        // Base Case:
        if (p <= 0) { // mult identity (how do i get the same number i gave back)
            return 1;
        }
        // Recursive Case:
        else {
            // 5 * Exponentiation(5, 2)
            // 5 * 4 * Exponentiation(5, 1)
            // 5 * Exponentiation(5, 0)
            // 5 * 4 * 3 * 2 * 1
            return n * Exponentiation(n, p-1);
        }

    }


    public static void main(String[] args) {
        System.out.println(Summation(3));
        System.out.println(Factorial(3));
        System.out.println(Exponentiation(5, 3));
    }

}
