import java.util.*;

class opt_of_arrList{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        //* Add
        //? To add one element to the list we use (ArrayList_name.add(value);)
        
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.print("After adding elements in the ArrayList: ");
        System.out.println(arr);System.out.println("------------------------------------------------------------------------------------------");

        //* add at index:
        //? To add the value in the particular index, when the value is added in the particular index place, all the values of index will move one index right side
        
        arr.add(0, 40);
        arr.add(2, 60);
        System.out.print("After add values in the respective indexes: ");
        System.out.println(arr);System.out.println("------------------------------------------------------------------------------------------");

        //* get
        //? Get method is used to fetch the particular data from the ArrayList
        
        System.out.println("Fetching the data's from the ArrayList with respect to index values: ");
        System.err.println(arr.get(2));
        System.out.println(arr.get(3));System.out.println("------------------------------------------------------------------------------------------");

        //* set
        //? set method is used to update an value in particular index
        
        System.out.print("After updating values in the ArrayList with repect to indexes: ");
        arr.set(2, 100);
        arr.set(4, 400);
        System.out.println(arr);System.out.println("------------------------------------------------------------------------------------------");

        //* remove
        //?
        
        System.out.print("After removing values from the ArrayList with respect to indexes: ");
        arr.remove(0);
        arr.remove(2);
        System.out.println(arr);System.out.println("------------------------------------------------------------------------------------------");
        
        //* size
        //? it returns the size of the ArrayList
        System.out.print("final Size of the ArrayList: " + arr);
    }
}