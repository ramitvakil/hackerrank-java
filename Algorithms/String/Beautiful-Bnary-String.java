/**
https://www.hackerrank.com/challenges/beautiful-binary-string 

Alice has a binary string, , of length . She thinks a binary string is beautiful if and only if it doesn't contain the substring .

In one step, Alice can change a to a (or vice-versa). Count and print the minimum number of steps needed to make Alice see the string as beautiful.

Input Format

The first line contains an integer, (the length of binary string ).
The second line contains a single binary string, , of length .

Constraints

    Each character in .

Output Format

Print the minimum number of steps needed to make the string beautiful.

Sample Input 0

7
0101010

Sample Output 0

2

Sample Input 1

5
01100

Sample Output 1

0

Sample Input 2

10
0100101010

Sample Output 2

3

Explanation

Sample Case 0:

In this sample,

The figure below shows a way to get rid of each instance of :

[binary.png]

Because we were able to make the string beautiful by changing characters ( and ), we print .

Sample Case 1:

In this sample

The substring does not occur in , so the string is already beautiful and we print .
**/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        int count = 0;
        for(int i=0;i<n-2;i++){
            String x = B.substring(i, i+3);
            if(x.equals("010")){
                B = B.substring(0,i+2)+"1"+B.substring(i+3,B.length());
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}


