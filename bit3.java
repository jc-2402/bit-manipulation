//operation on bit manipulation
//1. get ith bit
//2. set ith bit
//3. clear ith bit
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
    public static void main(String args[]){
        System.out.println(getithbit(10,2));
        System.out.println(setithbit(10,2));
        System.out.println(clearithbit(10,1));
    }
}