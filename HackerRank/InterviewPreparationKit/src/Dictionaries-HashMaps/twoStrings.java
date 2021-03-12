/**
* link to problem: https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
*
**/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    static boolean check = false;
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        // instantiate a Set
        Set<Character> s1set = new HashSet<>();
        Set<Character> s2set = new HashSet<>();

        // insert the two strings into a set of characters
        for (char s : s1.toCharArray())
            s1set.add(s);
        for (char s : s2.toCharArray())
            s2set.add(s);

        // iterate through a set and check if a character is a subset of the other set.
        for (char s : s1set) {
            check = s2set.contains(s);
            if (check){
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();


            String result = twoStrings(s1, s2);

            System.out.println(result);
        }

        scanner.close();
    }
}
