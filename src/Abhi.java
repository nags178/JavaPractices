import Patterns.RepeatPattern;

class Abhi {
        static int rollNo;
       
        void display(){
          
          System.out.println("In display"+rollNo);
          return;
        }

       final int cars = 20;
        void change( int cars)
        {
          //cars = 10;
          this.cars = cars;
        }
        
        public static void main(String[] args) {
          
          Abhi abhiObj = new Abhi();
          abhiObj.rollNo = 10;
          abhiObj.change(30);
         // abhiObj.display();
          System.out.println(abhiObj.cars);
        }
}
