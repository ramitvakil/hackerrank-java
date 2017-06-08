/**
There are  strings. Each string's length is no more than  characters. There are also  queries. For each query, you are given a string, and you need to find out how many times this string occurred previously.

Input Format

The first line contains , the number of strings.
The next  lines each contain a string.
The nd line contains , the number of queries.
The following  lines each contain a query string.

Constraints

 
 
    

Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab
Sample Output

2
1
0
Explanation

Here, "aba" occurs twice, in the first and third string. The string "xzxb" occurs once in the fourth string, and "ab" does not occur at all.
**/

 Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        for(int i=0; i<N;i++){
            String s = in.nextLine();
            if(h.containsKey(s)){
                h.put(s,h.get(s)+1);
            }else{
                h.put(s,1);
            }
        }
        int q = in.nextInt();
        in.nextLine();
        for(int i=0;i<q;i++){
           String x = in.nextLine();
            if(h.containsKey(x)){
                System.out.println(h.get(x));
            }else{
                System.out.println(0);
            }
        }
        in.close();
