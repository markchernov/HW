//  cd HW
//  javac C:\Users\Acer\Desktop\GWU_CS\CS_6212\HW\HW3\*.java
//  java -cp . hw3.TestSushi
package HW3;
import HW3.SushiPicker;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


public class TestSushi { 

    public static void main(String[] args){
        SushiPicker sushiPicker = new SushiPicker();
        List<Double> dishes = new ArrayList<Double>();
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