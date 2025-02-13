import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListBasic{
    public static void main(String[] args) {
        System.out.println("Welcome, ArrayLists in Java"); 
        
        // Collection<Integer> nums = new ArrayList<Integer>();

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(1);
        nums.add(3);
        nums.add(2);
        nums.add(10);

        // Works only with List Interface
        System.out.println(nums.get(2));

        // for(int n: nums){
        //     System.out.println(n);
        // }
        // System.out.println(nums);
        
    }
}