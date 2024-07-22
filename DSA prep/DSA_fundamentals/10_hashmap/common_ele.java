import java.util.*;

class common_ele {
    public static void main(String[] args) {
        int[] a = {5,8,9,6,3,2,10};
        int[] b = {9,7,1,5,2,14,20};

        common_ele(a,b);
    }
    public static void common_ele(int[] a, int[]b){
        HashMap<Integer, Integer> ip = new HashMap<>();
        
        for(int i = 0; i<a.length; i++){
            ip.put(a[i], 1);
        }

        for(int i = 0; i<b.length; i++){
            if (ip.containsKey(b[i])) {
                System.out.println(b[i]);
            }
        }
    }
}   