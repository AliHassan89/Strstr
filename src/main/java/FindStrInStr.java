/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

 */

package main.java;

public class FindStrInStr {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("b", "b"));
    }

    public static int strStr(String hayStack, String needle){
        if (hayStack == null || needle == null || hayStack.isEmpty() || needle.isEmpty())
            return -1;

        for (int i=0; i<=hayStack.length() - needle.length(); i++){
            int j;
            for (j=0; j<needle.length(); j++){
                if (hayStack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if (j == needle.length()){
                return i;
            }
        }

        return -1;
    }
}

/** time complaxity of this logic is less compare to above! 

    public int strStr(String haystack, String needle) {
        
        if(needle.length()==0 || needle == null ) return 0;
        if(needle.length()>haystack.length()) return -1;
        
        char[] hs = new char[haystack.length()];
        char[] nd = new char[needle.length()];
        hs = haystack.toCharArray();
        nd = needle.toCharArray();
        
        int mainIndex=0;
        int i=1;
        
        int[] indexData = new int[nd.length];
        indexData[0] = 0;
        
        while(i<nd.length){
        	
            if(nd[i] == nd[mainIndex]){
            	mainIndex++;
                indexData[i] = mainIndex;
                i++;
                
            }
            else{
                if(mainIndex!=0){
                	mainIndex = indexData[mainIndex-1];
                }
                else{
                    indexData[i]=0;
                    i++;
                }
            }
            
        }
        
        int cmpr=0;
        
        for(i=0;i<hs.length;i++){
            
            if(hs[i] == nd[cmpr]){
                cmpr++;
                if(cmpr == nd.length) return i - cmpr +1;
            }
            else if(hs[i] != nd[cmpr] && cmpr!=0){
                cmpr = indexData[cmpr-1];
                i--;
            }
        }
        return -1;
    }
    
 
    
  
    
      
    
    
    
    

*/
