//  cd HW
//  javac C:\Users\Acer\Desktop\GWU_CS\CS_6212\HW\HW2\*.java
//  java -cp . hw2.Test
package hw2;
import hw2.TwoStacks;
public class Test {

    public static void main(String[] args) {
        // stack with array of 20 ints
        TwoStacks ts = new TwoStacks();

        System.out.println("In Test main");

        System.out.println("Initial "  + ts);

        for(int i = 1; i <= 10; i++) {
            ts.push1(i);
        }

        for(int i = 1; i <= 10; i++) {
            ts.push2(i);
        }

        System.out.println("Before pop "  + ts);

        for(int i = 0; i < 10; i++) {
            System.out.println(ts.pop1());
        }

        for(int i = 0; i < 10; i++) {
            ts.pop2();
        }

        System.out.println("After pop "  + ts);
    }
}