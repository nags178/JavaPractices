public class StaticNestedClassNew {
    int i;
    private String name = "Techie";
    static int y;

    void display(){
        name = "Frogs";
        System.out.println("In display method "+name);
    }

    protected static class StaticInner{
        int k;
        static int l;

        void displayInner(){
            
            System.out.println("In inner non-static");
        }

        static void innerDisplay(){
            l = 200;
            System.out.println("In inner static");
        }

         StaticInner(){
            System.out.println("In inner constructor");
        }

        static class MostInnerStatic{
            int m;

             void mostInner(){
                 m = 100;
                System.out.println("In most inner"+y);

                class hi{
                    int i;

                    void display(){
                        System.out.println("hi method");
                    }
                }

                hi hObj = new hi();
                hObj.display();
            }
        }

        class MostInner{
            int l;
            void mostInnerDisplay(){
                System.out.println("In most inner non-static");
            }
        }

        public static void main(String[] args) {
            MostInnerStatic mostObj = new MostInnerStatic();
            mostObj.mostInner();
            StaticInner staticObj = new StaticInner();
            MostInner mostInnerObj = staticObj.new MostInner();
            mostInnerObj.mostInnerDisplay();

            MostInnerStatic mObj = new MostInnerStatic(){
                void hello(){
                    System.out.println("In hello");
                }
                
            };
            

        System.out.println(mObj.m);
            

        }
    }

    public static void main(String[] args) {
        StaticInner innerObj = new StaticInner();
        innerObj.displayInner();
        StaticInner.innerDisplay();

    }
}
