public class PsuedoCodes {
    static int res;
    public static void main(String[] args) {
        int d = 0, k = 0, sum = 0, x = 135, y =135, s = 0;
        int count, c1, c2 = 0, b, k1, z;
        int c = 0, r=0, n=245;
        //1111111111111111111
        for(int a = 1; a<=9; a++){
            c = a * a * a;
            if((c%10) == a){
                d++;
            }
        }
        System.out.println("d = "+d);
        //222222222222222222
        for(int i = 101; i <= 110; i++){
            count = 0;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    count ++;
                }
            }
            if(count != 0){
                k = k + i;
            }
        }
        System.out.println("A = "+k);
        //3333333333333333333333333
        z = ops(++x, y++);
        System.out.println("x= "+x+" y= "+y+" z= "+z);

        //44444444444444
        while(n>1){
            r = (10*r) + (n % 10);
            n = n/10;
            
        }
        System.out.println("r ="+r);
        //5555555555555555555
        for(int n1 = 800; n1 >= 450; n1-- ){
            c1 = 0;
            for(int i =1; i <= n1; i++){
                if(n1 % i == 0){
                    c1++;
                }
            }
            if(c1 % 2 == 0)
            {

            }
            else{
                sum = sum + n1;
            }
        }
        System.out.println("sum="+sum);
        //666666666666666666666
        for(int a =2 ; a <=5; a++){
            res = func(a);
            s = s + res - a;
        }
        System.out.println("s ="+s);
        //77777777777777777777
        for(int a = 1000; a<=1100; a++){
            b = a;
            while(b >= 99){
                k1 = (b % 10);
                b = (b / 10);
                b = b - k1;
            }
            if(b % 11 == 0){
                c2++;
            }
        }
        System.out.println("count = "+c2);
        //888888888888888888888

    }

    static int ops(int x, int y){
        return x + y;
    }

    static int func(int a){
        for(int b = 1; b <= 3; b ++){
            res = (a * a * a)-(a * a);
        }
        return res;
    }
}
