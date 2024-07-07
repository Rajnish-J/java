package assingment;

class a1{
    public static void main(String[] args) {
        int start = 100, end = 1;
        while (start >= end) {
            if(start %2 != 0){
                System.out.println(start);
            }
            start --;
        }
    }
}