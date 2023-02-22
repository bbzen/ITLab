package ThirdSolution;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int read = 0;
        Scanner scanner = new Scanner(System.in);
        while (0 <= read) {
            read = scanner.nextInt();
            System.out.println(new ConvertNumber(read).convertNumber());
        }
    }
}
