package productmall_object_type_array;

public class productdriver {
    public static void main(String[] args) {
        product[] person1 = {
            new product("Laptop", 53866.48, 1),
            new product("Watch", 2550.05, 1),
            new product("phone", 15000, 1),
            new product("Mouse", 450, 1),
            new product("Headphones", 1200, 2),
            new product("PS5", 50000, 1) 
        };

        double sum = 0;
        for(int i = 0; i<person1.length; i++){
            sum += person1[i].price * person1[i].qty;
        }
        System.out.println(sum);
    }    
}
