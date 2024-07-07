class alphabets{
    public static void main(String[] args) {
        // A - Z
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print(ch + " ");
        }
        System.out.println();

        // Z - A
        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch + " ");
        }
    }
}