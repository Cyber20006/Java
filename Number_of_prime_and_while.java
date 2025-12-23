import java.util.Scanner;

public class Number_of_prime_and_while {

    
    static boolean isPrime(int x) {
        if (x < 2)
            return false;

        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    
    static boolean isPerfect(int x) {
        int sum = 0;

        for (int i = 1; i < x; i++) {
            if (x % i == 0)
                sum += i;
        }

        return sum == x && x != 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x;
        int primeCount = 0;
        int perfectCount = 0;

        
        n = sc.nextInt();

        
        for (int i = 0; i < n; i++) {
            x = sc.nextInt();

            if (isPrime(x))
                primeCount++;

            if (isPerfect(x))
                perfectCount++;
        }

        
        System.out.println("Prime count = " + primeCount);
        System.out.println("Perfect count = " + perfectCount);

        sc.close();
    }
}
