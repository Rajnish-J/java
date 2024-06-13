class sub_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        // start Inded : si, End Index : ei

        for(int si = 0; si<arr.length;si++){
            for(int ei = si; ei < arr.length; ei++){
                //printing loop
                for(int i = si; i<=ei; i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
