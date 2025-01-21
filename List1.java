import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution{
    public static void main(String[] args) {
        int[] arr = new int[100000];

        // Bubble 정렬 시간 측정
        long startTime = System.currentTimeMillis();
        int[] bubble = bubbleSort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + "초"); // 0.762초

        // 정렬 API(sort()) 시간 측정
        startTime = System.currentTimeMillis();
        int [] sort = doSort(arr);
        endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) / 1000.0 + "초"); // 0.001초

        // 두 배열 정렬 잘 됐는지 확인
        System.out.println(Arrays.equals(bubble, sort)); //true
    }


    private static int[] bubbleSort(int[] org) {
        int[] arr = org.clone();
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] doSort(int[] org) {
        int[] arr = org.clone();
        Arrays.sort(arr);
        return arr;
    }

    public static ArrayList<Integer> solution_my(ArrayList<Integer> arr) {
        Collections.sort(arr);
        return arr;
    }

    private static int[] solution(int[] arr){
        // 원본 보존을 위한 복사
        int[] clone = arr.clone();

        // sort()는 원본 자체를 정렬시킴
        Arrays.sort(clone);
        return clone;
    }
}