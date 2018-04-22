package HW3;
import java.util.*;

public class SushiPicker {

    List<Double> picks = new ArrayList<Double>();

    public void select(double dishPrice) {
        System.out.println("dishPrice: " + dishPrice);
        System.out.println("before pick: " + picks);
        Double max;                      
        if(picks.size() == 0) {
            picks.add(dishPrice);            
        }
        else {  
                max = Collections.max(picks);                  
                if(  max < dishPrice  && !picks.contains(dishPrice)) {            
                        System.out.println("Selected: " + dishPrice);                
                        picks.add(dishPrice);                       
                    }                                 
                }  
        System.out.println("after pick: " + picks);              
    } 
    
    public void print() {
        System.out.println(picks.toString());
    }
}