//  cd HW
//  javac C:\Users\Acer\Desktop\GWU_CS\CS_6212\HW\HW2\*.java
//  java -cp . hw2.Test
package HW2;
import HW2.TwoStacks;

public class Test {

    public static void main(String[] args) {
        // stack with array of 20 ints
        TwoStacks ts = new TwoStacks();

        System.out.println("In Test main");

        System.out.println("Initial "  + ts);
        //push1 10
        for(int i = 1; i <= 10; i++) {
            ts.push1(i);
        }
        //pop1 5
        for(int i = 0; i < 5; i++) {
            System.out.println(ts.pop1());
        }
        // push2 10
        for(int i = 1; i <= 10; i++) {
            ts.push2(i);
        }

        // at this point array should look like this [1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        // push1 15 forcing the resize
        for(int i = 1; i <= 10; i++) {
            ts.push1(i);
        }

        // at this point array should look like this [1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        System.out.println("Before pop1 "  + ts);

        for(int i = 0; i < 10; i++) {
            System.out.println(ts.pop1());
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(ts.pop2());
        }
        // at this point array should look like this [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        System.out.println("After pop "  + ts);
    }
}