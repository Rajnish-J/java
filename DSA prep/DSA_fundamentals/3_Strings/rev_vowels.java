import java.util.*;

class rev_vowels {
    public static void main(String[] args) {
        Reverse_vow("welcometoscaler");
    }

    public static void Reverse_vow(String st){
        char[] ch = st.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        
        while (i < j) {
            while(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u'){
                i++;
            }

            while(ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u'){
                j--;
            }

            if(i>=j){
                break;
            }

            char ch_1 = ch[i];
            ch[i] = ch[j];
            ch[j] = ch_1;

            i++;
            j--;
        }
        for(char c : ch){
            System.out.print(c);
        }
    }
}
