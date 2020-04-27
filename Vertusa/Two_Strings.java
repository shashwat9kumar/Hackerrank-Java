/*

Given two strings, determine if they share a common substring. A substring may be as small as one character.

For example, the words "a", "and", "art" share the common substring . The words "be" and "cat" do not share a substring.

Function Description

Complete the function twoStrings in the editor below. It should return a string, either YES or NO based on whether the strings share a common substring.

twoStrings has the following parameter(s):

s1, s2: two strings to analyze .
Input Format

The first line contains a single integer , the number of test cases.

The following  pairs of lines are as follows:

The first line contains string .
The second line contains string .
Constraints

 and  consist of characters in the range ascii[a-z].
Output Format

For each pair of strings, return YES or NO.

Sample Input

2
hello
world
hi
world
Sample Output

YES
NO
Explanation

We have  pairs to check:

, . The substrings  and  are common to both strings.
, .  and  share no common substrings.

*/




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int t=sc.nextInt();
        sc.nextLine();

        while(t-- > 0)
        {
            String val="NO";

            String str1=sc.nextLine();
            String str2=sc.nextLine();

            str1.toLowerCase();
            str1.toLowerCase();

            String str = "abcdefghijklmnopqrstuvwxyz";
            char arr[] =str.toCharArray();

            for(char ch : arr)
            {
                if(str1.indexOf(ch) > -1 && str2.indexOf(ch) > -1)
                {
                    val="YES";
                    break;
                }
            }
            System.out.println(val);
        }

        sc.close();
    }
}
