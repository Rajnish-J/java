class remove_vowel{
    public static void main(String[] args) {
        String ip_1 = "Welcome to DSA";
        String ip_2 = "so I will Learn asap";

        remvow(ip_1);
        remvow(ip_2);
    }

    public static void remvow(String s){
        for(int i = 0; i>s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                continue;
            }
            System.out.print(ch);
        }
    }
}