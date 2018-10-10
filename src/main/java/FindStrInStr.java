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
