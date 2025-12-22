import java.util.Scanner;

public class NumberToWords {

    static final String[] ONES = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    static final String[] TEENS = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    static final String[] TENS = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        int number = sc.nextInt();
        sc.close();

        if (number < 0 || number > 999) {
            System.out.println("Invalid number");
        } else {
            System.out.println(convert(number));
        }
    }

    static String convert(int num) {

        if (num == 0)
            return "zero";

        String result = "";

        if (num >= 100) {
            result += ONES[num / 100] + " hundred";
            num %= 100;
            if (num != 0)
                result += " and ";
        }

        if (num >= 20) {
            result += TENS[num / 10];
            if (num % 10 != 0)
                result += " " + ONES[num % 10];
        } else if (num >= 10) {
            result += TEENS[num - 10];
        } else if (num > 0) {
            result += ONES[num];
        }

        return result.trim();
    }
}