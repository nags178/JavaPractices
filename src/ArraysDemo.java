import java.util.Scanner;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numArray;  // int values only
        float[] decArray; // float values only
        String []StrArray = new String[5];  // string values only

        numArray = new int[10];  //instantiation an can store only 10 values
        int[] copyArray = new int[10];
        byte[] byteArray = new byte[5];  // byte values
                //   0 1  2  3 4
        int arr[] = {1,2,'C',4,5}; // declarartion, instatntiation and initialization
        char a ='a';
       

        String []strArray = {"6","b"};  // size = 2



      //  System.out.println(numArray.length);

       // System.out.println(arr[0]+" "+arr[1]+"  "+arr[2]+" "+arr[4]);

      //  Scanner scannerObj = new Scanner(System.in);

       // numArray = inputArray(new int[10], scannerObj);

       // int[] numArray1 = inputArray(numArray, scannerObj);
       
       // scannerObj.close();

       /* for(int i=0;i<=numArray.length-1;i++){
            copyArray[i] = numArray[i];
            System.out.println("My array elements-"+copyArray[i]);
        }

       /* for (int i : numArray1) {  //for-each
            System.out.println(i);  // i = numArray[i]
        }*/

       // int []multiArray[] = new int[2][3]; // instantiation

       // String[][] stringMulArr;

       // stringMulArr = new String[][]{{"1","2"},{"3","4"}};

      //  multiArray[0][0] = 1;
        //multiArray[0][1] = 2;
      //  multiArray[0][2] = 3;
        //multiArray[1][0] = 4;
        //multiArray[1][1] = 5;

     //   System.out.println(multiArray[1][1]);

        String[][] stringMulArr = {{"1","2","3","7"},{"4","5","6"},{"9","10"}};

        String[][] copyMulArr = stringMulArr.clone();
        copyMulArr[1][2] = "abc";
        System.out.println("In multi");
       // 
        
        for(int i=0;i<copyMulArr.length;i++){
            for(int j=0;j<copyMulArr[i].length;j++){
                System.out.print(copyMulArr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("In string mul array");

        for(int i=0;i<stringMulArr.length;i++){
            for(int j=0;j<stringMulArr[i].length;j++){
                System.out.print(stringMulArr[i][j]+" ");
            }
            System.out.println();
        }
        

       

      //  System.out.println(multiArray.getClass().getName());*/
        char[] charArray = {a, 'b','c','d','e','f','g'};  // size = 3
        char[] copyArr1 = {'z','y','x','p','q','r','s','t'};
       // System.arraycopy(charArray, 2, copyArr1, 3, 5);
        copyArr1 = charArray.clone();
        charArray[4] = 'z';
        System.out.println(charArray);
        System.out.println(copyArr1);
        System.out.println(charArray == copyArr1);
        


    }

    static int[] inputArray(int[] numArray, Scanner scannerObj){
        for(int i=0;i<numArray.length;i++){
            System.out.println("Enter "+(i+1)+" value:");
            numArray[i] = scannerObj.nextInt();
        }
        return numArray;
    }
}
