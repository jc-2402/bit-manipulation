//operation on bit
//update ith bit
import java.util.*;
public class bit3{
    public static int getithbit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask)==0){
            return 0; // means ith position has 0
        }
        else{
            return 1; // means ith position has 1
        }
    }
    public static int setithbit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }
    public static int clearithbit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateithbit(int n, int i, int newbit){
        // if(newbit ==0){
        //     return clearithbit(n,i);
        // }
        // else {
        //     return setithbit(n,i);
        // }

        //or
        n = clearithbit(n,i);
        int bitmask = newbit<<i;
        return n| bitmask;
    }
    public static void main(String args[]){
        System.out.println(updateithbit(10,2,1));
    }
}