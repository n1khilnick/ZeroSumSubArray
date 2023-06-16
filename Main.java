import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = scn.nextInt();
        
        List<Integer> res = zeroSum(arr);

        System.out.println(res.size() == 0 ? "No Elements Found" :res);
    }

    public static List<Integer> zeroSum(int[] arr) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            if(arr[i] == 0) {
                res.add(arr[i]);
                return res;
            }
            if(sum == 0) {
                for(int j=0; j<=i; j++) {
                    res.add(arr[j]);
                }
                return res;
            }
            if(map.containsKey(sum)) {
                for(int j=map.get(sum)+1; j<=i; j++) {
                    res.add(arr[j]);
                }
                return res;
            }
            map.put(sum, i);
        }
        return res;
    }
}