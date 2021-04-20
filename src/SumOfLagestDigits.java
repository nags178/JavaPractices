import java.util.Scanner;

public class SumOfLagestDigits {

    int larSum = 0, secondSum = 0;
     void largestDigit(int number) {
        int max = 0, temp = 0, secondMax = 0;
        while (number != 0)
        {
            temp = number % 10;
            if (max == 0)
            {
                max = temp;
                secondMax = temp;
            }
            else if (temp > max)
            {
                int lastmax = max;
                max = temp;
                if (lastmax > secondMax)
                {
                    secondMax = lastmax;
                }
            }
            if ((temp > secondMax && temp < max) || secondMax >= max)
            {
                secondMax = temp;
            }
            number = number / 10;
        }
            larSum = larSum + max;
            secondSum = secondSum + secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        SumOfLagestDigits sumObj = new SumOfLagestDigits();
        if((n1>=1000 && n1<=9999) && (n2>=1000 && n2<=9999) && (n3>=1000 && n3<=9999)){
            sumObj.largestDigit(n1);
            sumObj.largestDigit(n2);
            sumObj.largestDigit(n3);
            int diff = sumObj.larSum - sumObj.secondSum;
            System.out.println(diff);
        }
        
    }
}
