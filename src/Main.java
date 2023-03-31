
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер билета, состоящий из 6 цифр");
        int number = scanner.nextInt();
        int s1 = 0;
        int s2 = 0;
        for (int i = 1; i <= 6; i++) {
            int digit = number % 10;
            number /= 10;
            if (digit % 2 == 0) {
                s1 = s1 + digit;
            } else {
                s2 = s2 + digit;
            }
        }
            if (s1 == s2) {
                System.out.println("Ваш билет по питерской системе счастливый");
            } else {
                System.out.println("Ваш билет по питерской системе не счастливый");
            }
        }
}


