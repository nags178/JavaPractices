// Java program to implement
// the above approach
class GFG{
	
    // Function to find the longest substring
    // between pair of repetitions of the
    // same character
    static int longestbetweenequalcharacters(String S, char ch)
    {
        
        // Length of the string
        int n = S.length();
    
        // Stores the maximum length and
        // length of current substring
        // satisfying given conditions
        int res = -1, diff = -1;
    
        // Traverse the string
        for(int i = 0; i < n - 1; i++)
        {
            
            // Search for repetition of S[i]
            for(int j = n - 1; j > i; j--)
            {
                
                // If repetition occurs
                if (ch == S.charAt(j))
                {
                    
                    // Store the length of
                    // the substring
                    diff = j - i - 1;
    
                    // Update maximum length of
                    // substring obtained
                    res = Math.max(diff, res);
                }
            }
        }
    
        // Return obtained maximum length
        return res;
    }
    
    // Driver code
    public static void main(String[] args)
    {
        
        String s = "my name is granar";
        char ch = 'm';
        
        
        System.out.println(
            longestbetweenequalcharacters(s,ch));
    }
    }
    
    // This code is contributed by code_hunt
    