package hw2;
import java.util.*;

//  each stack size limit is 10
public class TwoStacks {
    private int[] arr;

    private boolean isEmpty1 = true;
    private int top1;
    private int size1 = 10;

    private boolean isEmpty2 = true;
    private int top2;
    private int size2 = 10;

    public TwoStacks() {
        System.out.println("In Stack Constructor");
        this.arr = new int[20];

    }
    //pushes x to first stack
    public void push1(int x) {
        System.out.println("Pushing1 " + x);
        System.out.println("Old top1 " + this.top1);
        if(this.top1 == this.size1 -1) {
            //Option 1
            //throw new Error("Fail to add: " + x  + ". Stack is full, pop some items");
            //Option 2
            //grow the array
            int newSize = (this.size1 + this.size2) * 2;
            int[] copy = new int [ newSize ];
            System.out.println("Old array before copy " + Arrays.toString(this.arr));
            System.out.println("Resized array size before copy is " + copy.length);
            //args         src,  src_pos, dest, dest_pos, number_of_values
            System.arraycopy( this.arr, 0, copy, 0, this.size1 );  // copy first half
            System.out.println("copy after first half " + Arrays.toString(copy));
            System.arraycopy( this.arr, this.size1, copy, this.size1 * 2, this.size2 );  // copy second half
            System.out.println("copy after second half " + Arrays.toString(copy));
            

            this.arr = copy;
            this.size1 = size1 * 2;
            this.size2 = size2 * 2;
            this.top1++;
            this.arr[this.top1] = x;
            System.out.println("After resizing and copy and pushing  " + x + " " + this.toString());
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
        System.out.println("Old top2 " + this.top2);
        if(this.top2 == (this.size1 + this.size2) -1 ) {
            //Option 1
            //throw new Error("Fail to add: " + x  + ". Stack is full, pop some items");
            //Option 2
            //grow the array
            int newSize = (this.size1 + this.size2) * 2;
            int[] copy = new int [ newSize ];
            System.out.println("Old array before copy " + Arrays.toString(this.arr));
            System.out.println("Resized array size before copy is " + copy.length);
            //args         src,  src_pos, dest, dest_pos, number_of_values
            System.arraycopy( this.arr, 0, copy, 0, this.size1 );  // copy first half
            System.out.println("copy after first half " + Arrays.toString(copy));
            System.arraycopy( this.arr, this.size1, copy, this.size1 * 2, this.size2 );  // copy second half
            System.out.println("copy after second half " + Arrays.toString(copy));
            

            this.arr = copy;
            this.size1 = size1 * 2;
            this.size2 = size2 * 2;
            this.top2++;
            this.arr[this.size1 + this.top2] = x;
            System.out.println("After resizing and copy and pushing  " + x + " " + this.toString());
        }

        else {
           
            if(this.isEmpty2) {
                System.out.println("isEmpty2 " + this.isEmpty2);
                this.top2 = 0;       
                this.arr[this.size1 + this.top2] = x;            
            }
            
            else  {
                this.top2++;;
                this.arr[ this.size1 + this.top2] = x;
                
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
        System.out.println("Poping Top2: " + this.top2);
        if(this.isEmpty2) {
            throw new Error("Stack 2 is empty, push some items");
        }
        else {
            int x = this.arr[this.size1 + this.top2];
            this.arr[ this.size1 + this.top2] = 0;           
            if( this.size1 + this.top2 == this.size1) {
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