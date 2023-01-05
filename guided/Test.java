package guided;
import java.util.*;

public class Test {
    public static int abs(int a, int b) {
        if (a - b < 0) {
            return -1 * (a - b);
        } else {
            return a - b;
        }
    }
    public static void getSortedArray(ArrayList<Integer> nums, ArrayList<Integer> sortedNums, 
    ArrayList<Integer> differences, int compare) {
        for (Integer element : nums) {
            int Element = element;
            differences.add(abs(Element,compare));
        }


        int min = Collections.min(differences);
        for (int i = 0; i < nums.size(); i ++) {
            if (abs(nums.get(i), compare) == min) {
                sortedNums.add(nums.get(i));
            }
        }
        Collections.sort(sortedNums);
    }

    public static void main(String[] args) {
            // write your code here
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> nums = new ArrayList<>();
            ArrayList<Integer> differences = new ArrayList<>();
            ArrayList<Integer> sortedNums = new ArrayList<>();
            while (scanner.hasNextInt()) {
              int temp = scanner.nextInt();
              if ( temp == 9999) {
                break;
              }
              // System.out.println(temp);
              nums.add(Integer.valueOf(temp));
            }
            int compare = nums.remove(nums.size() - 1);
            getSortedArray(nums,sortedNums,differences,compare);
            for (int i = 0; i < sortedNums.size(); i ++) {
                    System.out.print(sortedNums.get(i) + " ");
            }
        
        }
    }
    
