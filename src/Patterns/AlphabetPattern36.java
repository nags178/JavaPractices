package Patterns;

import java.util.Scanner;

public class AlphabetPattern36 {
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows needed to in the pattern ");

        int rows = scanner.nextInt();
        scanner.close();
        System.out.println("## Printing the pattern ##");

        int alphabet = 65;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < rows; j++)
            {
                if (j % 2 == 0)
                    System.out.print((char) (alphabet + (rows * (j)) + i) + " ");
                else
                    System.out.print((char) (alphabet + (rows * (j + 1)) - i - 1) + " ");
            }
            System.out.print("\n");
        }
    }
}
