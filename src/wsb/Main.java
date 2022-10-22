package wsb;

import wsb.fib.Fibonacci;
import wsb.utils.FibonacciFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("!!!");
        System.out.println("Hej! Podaj tryb liczenia (r|p) i indeks liczby w ciągu Fibonacciego, np. r7. Wyjście - q");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            FibonacciFactory factory = new FibonacciFactory(line);

            if (factory.mode == null) {
                System.out.println("Niepopradddwne wejście! Spróbuj ponownie");
                continue;
            }

            if (factory.mode.equals(FibonacciFactory.QUIT_MODE)) {
                break;
            }

            Fibonacci fibonacci = factory.findProperFibonacci();
            System.out.println("WYNIK: " + fibonacci.findElement(factory.index));
        }
    }
}
