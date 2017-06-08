/**
Create a list, , of  empty sequences, where each sequence is indexed from  to . The elements within each of the  sequences also use -indexing.
Create an integer, , and initialize it to .
The  types of queries that can be performed on your list of sequences () are described below:
Query: 1 x y
Find the sequence, , at index  in .
Append integer  to sequence .
Query: 2 x y
Find the sequence, , at index  in .
Find the value of element  in  (where  is the size of ) and assign it to .
Print the new value of  on a new line
Task 
Given , , and  queries, execute each query.

Note:  is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia.

Input Format

The first line contains two space-separated integers,  (the number of sequences) and  (the number of queries), respectively. 
Each of the  subsequent lines contains a query in the format defined above.

Constraints

It is guaranteed that query type  will never query an empty sequence or index.
Output Format

For each type  query, print the updated value of  on a new line.

Sample Input

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
Sample Output

7
3
Explanation

Initial Values: 
 
 
 = [ ] 
 = [ ]

Query 0: Append  to sequence . 
 
 = [5] 
 = [ ]

Query 1: Append  to sequence . 
 = [5] 
 = [7]

Query 2: Append  to sequence . 
 
 = [5, 3] 
 = [7]

Query 3: Assign the value at index  of sequence  to , print . 
 
 = [5, 3] 
 = [7]

7
Query 4: Assign the value at index  of sequence  to , print . 
 
 = [5, 3] 
 = [7]

3
**/

import java.util.*;

/**
 * @author Ramit Vakil
 *
 */
public class Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		HashMap<Long, long[]> seqList = new HashMap<Long, long[]>();
		for (long i = 0; i < N; i++) {
			long[] seq = new long[0];
			seqList.put(i, seq);
		}
		int Q = in.nextInt();
		long lastAnswer = 0;
		in.nextLine();
		for (int i = 0; i < Q; i++) {		
                String s = in.nextLine();
                String [] s_arr = s.split(" ");
				int one = Integer.parseInt(s_arr[0]);
				long x = Long.parseLong(s_arr[1]);
				long y = Long.parseLong(s_arr[2]);
				long seq = (x ^ lastAnswer) % N;
				//System.out.println("seq No: " + seq + " : seq length : " + seqList.get(seq).length +" : type : "+ one);
				long[] seq_index = seqList.get(seq);
				long ind = 0;
				if (one == 1) {
                    //q1
					long[] temp = new long[(seq_index.length + 1)];
					for(int j =0; j< seq_index.length;j++){
						temp[j] = seq_index[j];
					}
					temp[seq_index.length] = y;
					seqList.put(seq, temp);
				} else {
					// q2
					if(seq_index.length ==0){
						ind =0;
					}else{
						ind = y % seq_index.length;	
					}					
					lastAnswer = seq_index[(int) ind];
					System.out.println(lastAnswer);
				}
			}
		in.close();
	}

}
