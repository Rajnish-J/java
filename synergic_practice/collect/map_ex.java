import java.security.KeyStore.Entry;
import java.util.*;

class map_ex{

    static HashMap<String, List<Student>> std_det = new HashMap<String, List<Student>>();

    public static void main(String[] args) {

        

        std_det.put("X", Arrays.asList(new Student(20, "Rajnish", "male", "abc"), new Student(20, "Rajnish", "male", "abc")));
        std_det.put("XII", Arrays.asList(new Student(11,"ABC","feMALE","ABCSCHOOL"), new Student(17,"EFG","MALE","EFGSCHOOL")));

        // ! keys set
        Set<String> keys = std_det.keySet();
        ArrayList<String> gen = new ArrayList<String>();
        
        for(java.util.Map.Entry<String, List<Student>> ele : std_det.entrySet()){
            gen = ele.getValue();
        }
        

    }

}