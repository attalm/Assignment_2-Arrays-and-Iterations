import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

// * Author: Attal Mumin
// * Date: 2024-06-14
// * Program Name: PrimeNumbers
// * Description: Program to find prime numbers up to a user-defined upper bound using arrays and iterations.
        Scanner scanner = new Scanner(System.in);
        int upperBound;

        // This will get the valid upper bound from user (between 2 and 1000)
        do {
            System.out.print("Enter an upper bound (between 2 and 1000): ");
            upperBound = Integer.parseInt(scanner.nextLine());
        } while (upperBound < 2 || upperBound > 1000);

        // Create a boolean array to represent prime numbers
        boolean[] isPrime = new boolean[upperBound + 1];

        // Initialize all elements to true (assuming prime)
        for (int i = 2; i <= upperBound; i++) {
            isPrime[i] = true;
        }

        // This Applies the  Sieve of Eratosthenes algorithm
        for (int i = 2; i * i <= upperBound; i++) {
            if (isPrime[i]) {
                // This marks multiples of the Primes as Non-Primes
                for (int j = i * i; j <= upperBound; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        //This Prints the prime numbers
        System.out.println("Prime numbers up to " + upperBound + ":");
        int count = 0;
        for (int i = 2; i <= upperBound; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nTotal prime numbers: " + count);


        System.out.println("Press Enter to close...");
        scanner.nextLine(); // Wait for user to press enter
        scanner.close();
            }
        }

