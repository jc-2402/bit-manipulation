//check if a no. is power of 2 or not
import java.util.*;
public class bit7{
    public static void main(String args[]){
        System.out.println(checkpowerof2(16));
        System.out.println(checkpowerof2(15));
    }
    public static boolean checkpowerof2(int n){
        return (n & (n-1)) == 0;
    }
}