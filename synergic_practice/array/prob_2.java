public class prob_2 {  
    public static void main(String[] args) {  
        // Initialize array  
        int[] arr = new int[] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        
        // Array fr will store frequencies of element  
        int[] fr = new int[arr.length];  
        
        int visited = -1;  // Special marker to indicate an element has been counted

        // Outer loop to traverse through the array
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  // Initialize count to 1 for the current element
            
            // Inner loop to compare current element with the rest of the array
            for(int j = i + 1; j < arr.length; j++){  
                if(arr[i] == arr[j]){  
                    count++;  // Increment count if a match is found
                    
                    // Mark the matched element as visited
                    fr[j] = visited;  
                }  
            }  
            
            // Store count of current element in fr[] if not already visited
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        // Display the frequency of each element present in the array
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  // Print only the non-visited elements
                System.out.println("    " + arr[i] + "    |    " + fr[i]);  
        }  
        
        System.out.println("----------------------------------------");  
    }  
}  
