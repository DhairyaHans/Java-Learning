import java.util.Set;
import java.util.HashSet;

public class SetsBasic {
    public static void main(String[] args) {
        System.out.println("Welcome, Sets in Java"); 
        
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(3);


        for(int n: nums){
            System.out.println(n);
        }
        System.out.println(nums);
        
    }
}