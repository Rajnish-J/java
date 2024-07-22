import java.util.*;

class maxFreqChar {
    public static void main(String[] args) {
        String ip = "aabdbabbdaccd";
        maxFreq(ip);
    }
    public static void maxFreq(String st){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i<st.length(); i++){
            char ch = st.charAt(i);
            
            if(hm.containsKey(ch) == true){
                int cfreq = hm.get(ch);
                hm.put(ch,cfreq+1);
            }
            else{
                hm.put(ch, 1);
            }
        }

        int maxval = 0;
        char maxchar = 'a';

        for(char c: hm.keySet()){
            if(hm.get(c) > maxval){
                maxval = hm.get(c);
                maxchar = c;
            }
        }
        System.out.println("char: " + maxchar + ", " + "value: " + maxval);
    }
}