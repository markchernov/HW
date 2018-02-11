package hw2;
import java.util.*;

//  each stack size limit is 10
public class TwoStacks {
    private int[] arr;

    private boolean isEmpty1 = true;
    private int top1 = 0;
    private int size1 = 10;

    private boolean isEmpty2 = true;
    private int top2 = 10;
    private int size2 = 10;

    public TwoStacks() {
        System.out.println("In Stack Constructor");
        this.arr = new int[20];

    }
    //pushes x to first stack
    public void push1(int x) {
        System.out.println("Pushing1 " + x);
        
        if(this.top1 == this.size1) {

            throw new Error("Fail to add: " + x  + ". Stack is full, pop some items");
        }

        else {            
            if(this.isEmpty1) {
                System.out.println("isEmpty1 " + this.isEmpty1);
                this.top1 = 0;       
                this.arr[this.top1] = x;               
            }
            
            else  {
                this.top1++;              
                this.arr[this.top1] = x;
                
            }
            this.isEmpty1 = false;
        }

    } 
    //pushes x to second stack
    public void push2(int x) {
        System.out.println("Pushing2 " + x);
        if(this.top2 == this.size1 + this.size2) {
            throw new Error("Fail to add: " + x  + ". Stack is full, pop some items");
        }

        else {
           
            if(this.isEmpty2) {
                System.out.println("isEmpty2 " + this.isEmpty2);
                this.top2 = 10;       
                this.arr[this.top2] = x;            
            }
            
            else  {
                this.top2++;
                this.arr[this.top2] = x;
                
            }
            this.isEmpty2 = false;
        }
    } 

    //pops an element from first stack and return the popped element
    public int pop1() {
        System.out.println("Poping Top1: " + this.top1);
        if(this.isEmpty1) {
            throw new Error("Stack 1 is empty, push some items");
        }
        else {
            int x = this.arr[this.top1]; 
            this.arr[this.top1] = 0;           
            if(this.top1 == 0) {
                this.isEmpty1 = true;
            }
            else {
                this.top1--; 
            }         
            return x;
        }
        
    }
    //pops an element from second stack and return the popped element
    public int pop2() {
        if(this.isEmpty2) {
            throw new Error("Stack 2 is empty, push some items");
        }
        else {
            int x = this.arr[this.top2];
            this.arr[this.top2] = 0;           
            if(this.top2 == 10) {
                this.isEmpty2 = true;
            }
            else {
                this.top2--;
            }
            return x;
        }
        
    }

    @Override
    public String toString() {
         return "TwoStacks array: " + Arrays.toString(this.arr);        
    };

}