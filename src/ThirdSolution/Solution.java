package ThirdSolution;

import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                int x = Integer.parseInt(scanner.nextLine());
                System.out.println(NumberDescriptions.turnToString(x));
                if (x < 0) {
                    break;
                }
            }
        }
    }
}
