package hw3;
import hw3.TofuPicker;
import java.util.*;
import java.text.DecimalFormat;
import java.lang.*;


public class TestTofu { 

    public static void main(String[] args){
        TofuPicker tofuPicker = new TofuPicker(200);
        List<Integer> dishes = new ArrayList();
        Random rand = new Random();
        for(int i = 0; i < 20; i++) {
           double zeroTo99 = rand.nextInt(100);
           int volume =  (int)zeroTo99 + 1;                    
           dishes.add(volume);
        }

        System.out.println("Dishes: " + dishes);

        for (int value : dishes) {          
                tofuPicker.select(value);
        }
        tofuPicker.print();
    }
}