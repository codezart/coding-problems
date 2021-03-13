/**
* link to problem: https://www.hackerrank.com/challenges/sherlock-and-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
*
**/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /**
     *  code divided into two parts.
     *  1. Generate all substrings of a string.
     *  2. strings with equal length - check if they are anagrams of each other
     * @param s
     * @return n
     */
    static int sherlockAndAnagrams(String s) {
        // Generate all substrings
        HashMap<String, Integer> substrings = new HashMap();
        String temp = "";

        for (int length = 1; length <= s.length(); length++) {
            for (int i = 0; i <= s.length(); i++) {
                int j = i + length - 1;
                for (int k = i; k<= j; k++){
                    temp += s[k];
                }
                substrings.put(temp, temp.length());
                temp = "";
            }
        }

        // Now find strings with the same length.
        // Then when checking 2 substrings. put them in a set and check if they are a subsets of each other.
        for(int length = 1; length <= s.length(); length++){

        }
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = sherlockAndAnagrams(s);
            System.out.println(result);

        }
        scanner.close();
    }
}
