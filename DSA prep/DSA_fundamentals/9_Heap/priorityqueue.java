import java.util.*;

class pq{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        
        pq.add(10);
        pq.add(20);
        pq.add(30);
        pq.add(40);
        pq.add(50);
        pq.add(10);

        System.out.println(pq.remove()); //! removes Ten (10)
        System.out.println(pq.remove()); //! removes another Ten (10)
        System.out.println(pq.remove()); //! removes Twenty (20)

        System.out.println(pq.peek());

        System.out.println(pq);
        System.out.println(pq.size());
    }
}