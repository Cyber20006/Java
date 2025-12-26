import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("عدد باینری را وارد کنید: ");
        String binary = sc.nextLine();

        int decimal = 0;
        int power = 0;


        for (int i = binary.length() - 1; i >= 0; i--) {
            int bit = binary.charAt(i) - '0';
            decimal += bit * Math.pow(2, power);
            power++;
        }

        System.out.println("عدد ده دهی: " + decimal);
    }
}
