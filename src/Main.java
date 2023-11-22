import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] number = new int [] {-1 , 5, 7 , 8, 9};;
        int target = 17;
        int [] result = getTwoSum(number, target);
        System.out.println(result[0] + "" + result[1]);
    }

    public  static int[] getTwoSum(int[] number, int target){
        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for (int i = 0; i < number.length; i++ ){
            int delta = target - number[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[] {i,visitedNumbers.get(delta)};
            }
            visitedNumbers.put(number[i], i);
        }
        return new int[]{-1, -1};
    }

}