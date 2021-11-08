import java.util.Scanner;

public class MyArrayDemo {
    public static void main(String[] args) {
        /* int []a;  // declaration

        //a = {1,2,3};
        a = new int[10]; // initializing or defining

        int oldArray[] = {1,2,3,4,5,6,7,8,9};
        
        int newArray[] = oldArray.clone();

        char charArr[] = {'a','b','c'};

        char newCharArr[] = charArr.clone();

        oldArray[1] = 20;

        for (int c : newArray) {
            System.out.println(c);
        }



        System.out.println(oldArray == newArray);

        String strArr[][] = new String[][]{{"Hi","Hello","Team"},{"Welcome", "Team","Good"}};

        String newStrArr[][] = strArr.clone();

        strArr[1][1] = "My Team";

        for(int i=0;i<newStrArr.length;i++){  // row traversing
            for(int j=0; j<3; j++){         // column traversing
                System.out.print(" "+newStrArr[i][j]);
            }
            System.out.println();
        }

       // System.out.println(strArr == newStrArr);


       System.arraycopy(oldArray, 4, newArray, 3, 5);

        for (int i : newArray) {
            System.out.println(i);
        }
        
        int x = 4;
        int[] b= new int[x]; // instantiating

        int c[] = {1,'2',3}; // declare, instantiate and initialize

        

        System.out.println(c[0]+"  "+c[1]);

        b[0] = 1; //assigning
        b[1] = 68;
        b[2] = 3;
        b[3] = 4;
        //b[5] = 7;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values:");
        for(int i=0;i<b.length;i++){
            b[i] = sc.nextInt();
        }

        System.out.println("Printing values:");
        for(int i=b.length - 1; i>=0;i--){
            System.out.println(b[i]);
        }

        System.out.println("Printing using for each:");

        int k[] = new int[5];

        char ch[] = new char[]{65,66,67};

       /* for (char z : ch) {
            System.out.println(z);
        }
        display(b,new char[]{1,2,3});  // [passing b array as an parameter amd b is an actual param

       char l[] =  myArrayReturn(new int[]{1,2,3});
       

       int[] []arr = new int[2][3];  // rows -  2 and columns - 2 

       arr[0][0] = 1;    // 1(0,0)   2(0,1)  
                         // 3(1,0)   4(1,1)
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

       // arr[2][1] = 5;

       System.out.println(arr[1][0]);
       // int a = 5;
       int [][]arr1 = new int[][]{{1,1,1},{2,2,2}}; // declaration, instantiation and definition

       System.out.println(arr1.length);

       for(int i=0;i<arr1.length;i++){  // row traversing
        for(int j=0; j<3; j++){         // column traversing
            System.out.print(" "+arr1[i][j]);
        }
        System.out.println();
       }

       int [][][][]x = new int[3][][][];

       int jaggedArr[][] = new int[][]{{1,2},{3,4,5},{6,7,8,9,10}}; // jagged array

      // jaggedArr[0] = new int[]{1,2};
     //  jaggedArr[1] = new int[]{3,4,5};
      // jaggedArr[2] = new int[]{6,7,8,9,10};

       for(int i=0;i<jaggedArr.length; i++){  // each row traverse
        for(int j=0; j<jaggedArr[i].length;j++){  // each column
            System.out.print(" "+jaggedArr[i][j]);
        }
        System.out.println();
       }

       float f[][][] = new float[4][][];

       double d[][] = new double[3][];

       String s[] = new String[5];

       Class c = a.getClass();
       System.out.println(c.getName());

       System.out.println(arr1.getClass().getName());

       System.out.println(f.getClass().getName());

       System.out.println(s.getClass().getName());

       System.out.println(d.getClass().getName());

*/

       int numArr1[][] = {{1,2},{4,5},{7,8}};

       int numArr2[][] = {{1,2},{4,5},{7,8}};

       int sumArr[][] = new int[numArr1.length][2];


       for(int i=0;i<numArr1.length;i++){  // row traversing
        for(int j=0; j<numArr1[0].length; j++){         // column traversing
            sumArr[i][j] = numArr1[i][j] * numArr2[i][j];
        }
        
       }

       for(int i=0;i<sumArr.length;i++){  // row traversing
        for(int j=0; j<sumArr[0].length; j++){         // column traversing
            System.out.print(" "+sumArr[i][j]);
        }
        System.out.println();
       }








    }

    static void display(int a[], char c[]){  // taking int array as a formal param
        for (int z : a) {
            System.out.println("display - "+z);
        }
    }


    static char[] myArrayReturn(int a[]){
        int c[] = new int[2];
        char ch[] = {1,2,3};
        return new char[]{'a','b','c'};
    }


    
}
