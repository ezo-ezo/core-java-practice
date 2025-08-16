package sts_practice;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n = 50; // You can change this value
        boolean[] isPrime = new boolean[n + 1];

        // Step 1: Assume all numbers are prime
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        // Step 2: Mark non-primes
        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Step 3: Print all primes
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
