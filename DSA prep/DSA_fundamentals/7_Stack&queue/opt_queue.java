import java.util.ArrayDeque;
import java.util.Queue;

class opt_queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();


        //! add elements
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q); //? [10, 20, 30]

        //! peek method
        System.out.println(q.peek()); //? 10

        //! reomval of first element
        q.remove();
        System.out.println(q); //? [20, 30]

        //! size 
        System.out.println(q.size()); //? 2
    }    
}