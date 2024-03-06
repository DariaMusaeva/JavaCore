import java.util.Scanner;

public class Factorial {

    public int factorial(int f) { //рекурсивный метод
        Scanner scanner = new Scanner(System.in);
        if (f <= 1) return f;
        else {
            return f * factorial(f -1);
        }
    }

    public int factorial1() {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.println("Введите число");
        int quantity = scanner.nextInt();
        for (int i = 1; i <= quantity; i++) {
            result = result * i;
        }
        return result;
    }

    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        else if (n == 1){
            return 1;
        }
        else if (n == 0){
            return 0;
        }
        return 0;
    }
}

