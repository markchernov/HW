package HW3;

public class TestFlippingStack { 

    public static void main(String[] args){

        FlippingStack flippingStack = new FlippingStack();
        for(int i = 0; i < 10; i++) {
            System.out.println(flippingStack.push(i));
        }
    }
}