import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        

        int myArray1[] = {1,2,3,4,5};
        
       // System.out.println(myArray1.length);

        Scanner scannerObj = new Scanner(System.in);
       // for(int i=0;i<myArray.length;i++)
       // {
      //      myArray[i] = scannerObj.nextInt();
       // }
        
        //System.out.println("My entered values :");
       
       // display(sendArray(myArray1));
        //display(myArray1);
       // for(int i:myArray){
       //     System.out.println(i);
       // }
       // scannerObj.close();

       int multiArr[][] = new int[2][]; // Declaration

      /* multiArr[0][0] = 1;
       multiArr[0][1] = 2;
       multiArr[0][2] = 3;
       multiArr[1][0] = 4;
       multiArr[1][1] = 5;
       multiArr[1][2] = 6;
       for(int i = 0; i<2;i++){
        for(int j=0;j<3;j++){
            multiArr[i][j] = scannerObj.nextInt();
        } 
        }

       // 1 2 3
       // 4 5 6
        multiArr[0] = new int[3];
        multiArr[1] = new int[5];
        
        for(int i=0;i<multiArr.length;i++)
        {
            for(int j=0;j<multiArr[i].length;j++){
                multiArr[i][j] = scannerObj.nextInt();
            }
        }*/




       int myNewArray[][] = {{1,2,3},{4,5,6},{7,8,9}};

       int clonedIntArray[][] = myNewArray.clone();

       clonedIntArray[0][0] = 10;
       myNewArray[2][2] = 50;
        System.out.println("Cloned array:");
      // displayMulti(clonedIntArray);
       System.out.println("Old array:");
     //  displayMulti(myNewArray);
      // displayMulti(multiArr);

      // System.out.println("Normal array");

     //  displayMulti(myNewArray);

       //Class c = ;

       //String s = ;

      // System.out.println("My array class name is "+myNewArray.getClass().getName());
       // System.out.println();

       char[] sourceArray = {'a','b','c','d','e','f','g', 'h'};
       char[] destArray = {'1','2','3','4','5','6','7','8','9'};

       System.arraycopy(sourceArray, 3, destArray, 1, 5);

    //   for(int i=0;i<destArray.length;i++){
    //    System.out.println(destArray[i]);
   // }

        char[] clonedArray = sourceArray.clone();

        clonedArray[0] = 'z';
     /*   System.out.println("My cloned one dimensional array: ");
        for(int i=0;i<clonedArray.length;i++){
                System.out.println(clonedArray[i]);
         }

         System.out.println("My original one d array:");
         for(int i=0;i<sourceArray.length;i++){
            System.out.println(sourceArray[i]);
     }*/

     int c[] = new int[2];
     
     //c[-1] = 1;

  //   int a[] = new int[100];
   //  int b[] = new int[10];
     
     int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};
     int b[] = {10,11,12,13,14,15};

   // System.out.println("Before b length: "+b.length);
    c = b;
  //  b = a;

   //  System.out.println("After b length "+b.length);

     b[3] = 100;
     a[4] = 123;
    // display(c);
   //  display(a);
  //   display(b);

  //System.out.println(new int[]{1,2,3,4,5}[1]);

  int z[] = new int[]{1,2,3,4,5};
 // System.out.println(Arrays.equals(b,c));

  System.out.println(Arrays.equals(myNewArray, clonedIntArray));
  
  int [][][]x = new int[4][][];
  int [][][][]y = new int[5][][][];

    }

    static void displayMulti(int methodArray[][]){
        for(int i = 0; i<methodArray.length;i++){
            for(int j=0;j<methodArray[i].length;j++){
                System.out.print(methodArray[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void display(int methodArray[]){
        System.out.println("My Array values are:");
        for(int i=0;i<methodArray.length;i++){
            System.out.println(methodArray[i]);
        }
    }

    static int[] sendArray(int[] otherArray ){
        return otherArray;
    }
}
