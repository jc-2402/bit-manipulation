//even or odd in bit
import java.util.*;
public class bit2{
    public static void evenoddbit(int n){
        int bitmask =1;
        if((n & bitmask ) == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String args[]){
        evenoddbit(3);
        evenoddbit(11);
        evenoddbit(14);
    }
}