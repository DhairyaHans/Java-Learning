import java.util.Map;
import java.util.HashMap;

public class MapBasic {
    public static void main(String[] args) {
        System.out.println("Welcome, Maps in Java"); 
        
        Map<String, Integer> students = new HashMap<>();
        
        students.put("Alice", 23);
        students.put("Bob", 25);
        students.put("Charlie", 22);
        students.put("David", 24);
        students.put("Bob", 10);

        System.out.println(students);

        System.out.println(students.get("Bob"));
    }
}