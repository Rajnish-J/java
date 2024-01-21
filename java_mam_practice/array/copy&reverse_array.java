import java.util.*;
class copy_reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] num_1 = new int[size];
        int [] num_2 = new int[size];

        for(int i = 0; i<size; i++){
            num_1[i] = sc.nextInt();
        }

        for(int j = 0; j<size; j++){
            num_2[j] = num_1[j];
        }
        for(int k = size - 1; k>=0 ; k--){
            System.out.println(num_2[k]);
        }
    }
}
