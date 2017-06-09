/**
Given a string, find out the lexicographically smallest and largest substring of length .

[Note: Lexicographic order is also known as alphabetic order dictionary order. So "ball" is smaller than "cat", "dog" is smaller than "dorm". Capital letter always comes before smaller letter, so "Happy" is smaller than "happy" and "Zoo" is smaller than "ball".]

Input Format

First line will consist a string containing english alphabets which has at most  characters. 2nd line will consist an integer .

Output Format

In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

Sample Input

welcometojava
3
Sample Output

ava
wel
Explanation

Here is the list of all substrings of length :

wel
elc
lco
com
ome
met
eto
toj
oja
jav
ava
Among them ava is the smallest and wel is the largest.
**/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	     String s = in.nextLine();
	        int k = in.nextInt();
	        in.close();
	        int l = s.length();
	        String largest= s.substring(0, k);
	        String smallest = s.substring(0, k);
	        ArrayList<String> sArr = new ArrayList<String>();
	        for(int i=0;i<(l-k+1);i++){
	            sArr.add(s.substring(i, k+i));
	        }
	        for(String p: sArr){
	        	if(p.compareTo(smallest)<0){
	        		smallest = p;
	        	}
	        	if(p.compareTo(largest)>0){
	        		largest = p;
	        	}
	        }
	        System.out.println(smallest);
	        System.out.println(largest);
    }
}
