//Given N space separated integers and an integer k, please perform the following operations
// * Store the integers in the array A
// * Count all the items of the array A strictly greater than 0 and store it as the variable pos
// * Count all the items of the array A strictly lesser than 0 and store it as the variable neg
// * Count all items of the A which are divisible by k and store it as the variable divk

import java.util.*;
class count {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
		int ele;
		int t = read.nextInt();
		for(int i=0; i<t; i++)
		{
    		int n = read.nextInt();
    		int k = read.nextInt();
    		ArrayList<Integer> a = new ArrayList<Integer>();
    		for(int j=0; j<n; j++){
    		    ele = read.nextInt();
    		    a.add(ele);
    		}
    		// Declare and initialise variables - pos, neg and divk
            // Note that we are reinitializing the variables to be 0 for each test case.
    		int pos = 0;
    		int neg = 0;
    		int divk = 0;
    		
    		int l = 0;
    		// Loop through all elements of the array
    		while(l < a.size()){
    		    // Count the negative elements of the array
                if (a.get(l) < 0){           
                    neg = neg + 1;
                }
                // Count the positive elements of the array
                else if (a.get(l) > 0){     
                    pos = pos + 1;
                }
                // Count if the given element is divisible by k
                if (a.get(l)%k == 0){        
                    divk = divk + 1;
                }
                l = l + 1;
    		}
    		System.out.println(pos + " " + neg + " " + divk);
		}
    }
}
