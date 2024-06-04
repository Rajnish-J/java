import java.util.Arrays;

class char_arr{
    public static void main(String[] args) {
        String s1 = "Virat";
        char[] ch = new char[s1.length()];

        for(int i = 0; i<s1.length(); i++){
            ch[i] = s1.charAt(i);
        }
        System.out.println(Arrays.toString(ch));
    }
}