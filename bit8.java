// count set bits in a num .. set means no. of 1
import java.util.*;
public class bit8{
    public static void main(String args[]){
        System.out.println(countsetbit(16)); // 16 = 1000 so no. of set =1
    }
    public static int countsetbit(int n){
        int count =0;
        while(n>0){
            if ((n&1) ==1){
                count ++;
            }
            n = n>>1;
        }
        return count;
    }
}