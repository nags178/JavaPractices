import Patterns.RepeatPattern;
import Patterns.TestPattern;

public class ProtectedDemo extends TestPattern{
    public static void main(String[] args) {
        TestPattern testObj = new TestPattern();
        System.out.println(testObj.a+"  "+testObj.b);
    }
}
