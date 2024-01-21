import java.util.*;
//Harsh was recently gifted a book consisting of N pages. Each page contains exactly M words printed on it. 
//As he was bored, he decided to count the number of words in the book.

class counting_words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0){
		    int N=sc.nextInt();
		    int M=sc.nextInt();
		    System.out.println((N)*M);
		    T--;
		    }
    }
}
