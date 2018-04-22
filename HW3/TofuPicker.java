package HW3;

import java.util.ArrayList;
import java.util.List;

public class TofuPicker {

    public TofuPicker(int capacity) {
        this.capacity = capacity;
        System.err.println("Capacity: " + this.capacity);
    }

    int capacity;
  
    List<Integer> picks = new ArrayList<Integer>();

    public void select(int dishValue) {
        System.out.println("dishValue: " + dishValue);
        System.out.println("before pick: " + picks);
        int sum =  picks.stream().mapToInt(i -> i.intValue()).sum();
        System.out.println("Sum: " + sum);                  
        if(picks.size() == 0) {
            picks.add(dishValue);            
        }
        else {                                  
                int newMax = sum + dishValue;
				if(  !picks.contains(dishValue) &&  newMax < capacity) {            
                        System.out.println("Selected: " + dishValue);                
                        picks.add(dishValue);                       
                 }                 
        }  
        System.out.println("after pick: " + picks);              
    } 
   
    public void print() {
        System.out.println(picks.toString());
        System.out.println("Sum: " + picks.stream().mapToInt(i -> i.intValue()).sum());
    }
}