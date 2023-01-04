package guided;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> nameList = new ArrayList<>(Arrays.asList(1, 2, 3));
        // write your code here
        for(Integer name: nameList) {
            System.out.println(name);
        }
    }
}
