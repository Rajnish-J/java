import java.util.*;

class opt_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // ! adding element
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println(st); //? [10,20,30,40]

        // ! shows the last added element
        System.out.println(st.peek()); //? 50

        // ! remoing the element
        System.out.println(st.pop());
        // ! after printing that removes the last element
        System.out.println(st); //? [10, 20, 30]

        // ! size of the stack
        System.out.println(st.size()); //? 3
    }
}