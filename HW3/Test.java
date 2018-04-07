//  cd HW
//  javac C:\Users\Acer\Desktop\GWU_CS\CS_6212\HW\HW3\*.java
//  java -cp . hw3.Test
package hw3;
import hw3.SushiPicker;
import java.util.*;
import java.text.DecimalFormat;


public class Test { 

    public static void main(String[] args){
        SushiPicker sushiPicker = new SushiPicker();
        List<Double> dishes = new ArrayList();
        for(int i = 0; i < 20; i++) {
           double price =  Math.random() * 101;
           DecimalFormat twoDForm = new DecimalFormat("#.##");           
           dishes.add(Double.valueOf(twoDForm.format(price)));
        }

        System.out.println("Dishes: " + dishes);

        for (double price : dishes) {
           sushiPicker.select(price);
        }

        sushiPicker.print();
    }
}