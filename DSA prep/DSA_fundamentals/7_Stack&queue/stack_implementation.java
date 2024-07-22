//! stack implementation using LindkedList

import java.util.LinkedList;

class stack_implementation {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();

        l.addFirst(10);
        l.addFirst(20);

        System.out.println(l); //? [20, 10]

        System.out.println(l.removeFirst()); //? 20
    }
}