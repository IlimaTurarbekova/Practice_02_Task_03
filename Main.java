import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num / 1000 + num / 100 % 10 + num / 10 % 10 + num % 10;
        System.out.printf("Сумма всех цифр числа %d равна %d", num, result);
    }
}
