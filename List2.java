import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class List2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 3, 2, 5, 4};
        ArrayList<Integer> list = solution_my(arr);
        System.out.println(list);

    }

    private static int[] solition2(int[] arr){
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = set.pollFirst();
        }

        return result;
    }

    private static int[] solution(int[] arr){
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        Arrays.sort(result, Collections.reverseOrder());

        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    private static ArrayList<Integer> solution_my(int[] org){
        int[] arr = org.clone();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr){
            if(!list.contains(i)){
                list.add(i);
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
