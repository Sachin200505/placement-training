import java.util.*;

class Solution {
    public int countPrimes(int n) {
        // If n <= 2, then there are no primes less than n
        if (n <= 2) {
            return 0;
        }

        // Create a boolean array to mark primes
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);  // Assume all numbers are prime
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;  // Mark all multiples of i as non-prime
                }
            }
        }

        // Count how many are still marked as true (i.e., prime)
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }
}
