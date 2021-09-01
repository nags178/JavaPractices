public class Example {
    static int factorial(int n) {
       int fact = 1;
       int i = 1;
       while(i <= n) {
          fact *= i;
          i++;
       }
       return fact;
    }
    public static void main(String args[]) {
      /*  int n = 4, r = 2, comb, per;
       per = factorial(n) / factorial(n-r);
       System.out.println("Permutation: " + per);
       comb = factorial(n) / (factorial(r) * factorial(n-r));
       System.out.println("Combination: " + comb); */
       int f =1, n=1,i, j;
       int count = 0;
       /* for( j=1;j<=5;j++){
         for( i=j; i>=1; i--){
            f = f*i;
            sum = sum + (1/f);
         }
      }
      System.out.println(sum);  */
      /* while(y<=3){
         for(int j=1; j<=y;j++ ){
            n = n *(j+(1/j));
            sum = sum + n;
         }
         y++;
      }
      System.out.println(sum);*/
      /* for(int a = 1; a <=10; a++){
         for(int b=1;b<=10;b++){
            for(int c = 1;c<=10;c++){
               if((a*a + b*b) == c*c){
                  count = count + 1;
               }
            }
         }
      }
      System.out.println(count); */
      int a=0, b=0, c=0, d=0, s = 0;
      /* a = a*b;
      b = a*b;
      c= b/c;
      d = a + b + c;
      System.out.println(d); */
     /*  while(b<=16){
         c = a * (a-b);
         c++;
         d = c % 10;
         d++;
         s = s + d;
         a++;
         b++;
      }
      System.out.println(s); */
      for(i = 1; i<=10; i++){
         a = (int)Math.pow(2, i) -1;
         count = 0;
         for(j=1;j<a;j++){
            if((a%j)==0){
               count++;
            }
         }
         if(count == 1){
            c = c + 1;
         }
      }
      System.out.println(c);

    } 
    
    // add comment to check my fetch functionality
 }
