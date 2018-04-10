package hw3;
import java.util.*;

public class FlippingStack {

    private List <Integer> stack = new ArrayList<>();
 
    public String push(int num) {

        this.stack.add(num);
        if(isPowerOf2(this.stack)) {
            flip(this.stack);
        }
        return this.stack.toString();
    }

    private boolean isPowerOf2( List<Integer> stack) {

        if (stack.size() == 0 || stack.size() == 1 || stack.size() % 2 != 0 ) return false;
        else return true;
    }

    private List<Integer> flip(List <Integer> stack) {

        List <Integer> invertedList = new ArrayList();
        for (int i = stack.size() - 1; i >= 0; i--) {
            invertedList.add(stack.get(i));
        }
        this.stack = invertedList;
        return invertedList;
    }
} 