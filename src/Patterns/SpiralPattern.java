package Patterns;

public class SpiralPattern {
    /*1. Create a 2D array of size n
    2. Store the boundary of the array in boundary variable. Initially it will be n-1 and thereafter it changes after every rotation.
    3. Store the size left for the spiral printing in variable sizeLeft. Initially it will be n-1 and thereafter it will decrease by 1 after every 2 rotations.
    4. Create a flag to determine 2 rotations, as after every 2 rotations, the sizeLeft will decrease.
    5. Create a char variable move to store the current movement of the spiral pattern. It can have ‘r’ for right, ‘l’ for left, ‘d’ for down, and ‘u’ for up.
    6. Repeat the below steps till ‘i’ is in range [1, n^2]:
    7. Assign the value of i to the spiral pattern.
    8. Determine the next movement of the pattern.
    9. Check for pattern to reach boundary. If reached, modify the sizes and rotate the spiral pattern.
    10. Print the Spiral Pattern stored in the 2D array. */

    public static void printSpiral(int size) 
    { 
  
        // Create row and col 
        // to traverse rows and columns 
        int row = 0, col = 0; 
  
        int boundary = size - 1; 
        int sizeLeft = size - 1; 
        int flag = 1; 
  
        // Variable to determine the movement 
        // r = right, l = left, d = down, u = upper 
        char move = 'r'; 
  
        // Array  for matrix 
        int matrix[][] = new int[size][size]; 
  
        for (int i = 1; i < size * size + 1; i++) { 
  
            // Assign the value 
            matrix[row][col] = i; 
           // System.out.print(i);
  
            // switch-case to determine the next index 
            switch (move) { 
  
            // If right, go right 
            case 'r': 
                col += 1; 
                break; 
  
            // if left, go left 
            case 'l': 
                col -= 1; 
                break; 
  
            // if up, go up 
            case 'u': 
                row -= 1; 
                break; 
  
            // if down, go down 
            case 'd': 
                row += 1; 
                break; 
            } 
  
            // Check if the matrix 
            // has reached array boundary 
            if (i == boundary) { 
  
                // Add the left size for the next boundary 
                boundary += sizeLeft; 
                System.out.println(boundary);
  
                // If 2 rotations has been made, 
                // decrease the size left by 1 
                if (flag != 2) { 
  
                    flag = 2; 
                } 
                else { 
  
                    flag = 1; 
                    sizeLeft -= 1; 
                } 
  
                // switch-case to rotate the movement 
                switch (move) { 
  
                // if right, rotate to down 
                case 'r': 
                    move = 'd'; 
                    break; 
  
                // if down, rotate to left 
                case 'd': 
                    move = 'l'; 
                    break; 
  
                // if left, rotate to up 
                case 'l': 
                    move = 'u'; 
                    break; 
  
                // if up, rotate to right 
                case 'u': 
                    move = 'r'; 
                    break; 
                } 
            } 
        } 
  
        // Print the matrix 
        for (row = 0; row < size; row++) { 
            for (col = 0; col < size; col++) { 
  
                int n = matrix[row][col]; 
                System.out.print((n < 10) 
                                     ? (n + "  ") 
                                     : (n + " ")); 
            } 
  
            System.out.println(); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        // Get the size of size 
        int size = 10; 
  
        // Print the Spiral Pattern 
        printSpiral(size); 
    } 
}
