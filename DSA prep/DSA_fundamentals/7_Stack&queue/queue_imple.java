import java.util.LinkedList;

class queue_imple {
    public static void main(String[] args) {
        LinkedList l = new LinkedList<>();

        l.addLast(20);
        l.addLast(152);
        l.addLast(157);

        System.out.println(l); //? [20, 152, 157]

        System.out.println(l.removeLast()); //? 157

        System.out.println(l); //? [20, 152]
    }
}