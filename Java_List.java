/*


For this problem, we have  types of queries you can perform on a List:

Insert  at index :

Insert
x y
Delete the element at index :

Delete
x
Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

Input Format

The first line contains an integer,  (the initial number of elements in ).
The second line contains  space-separated integers describing .
The third line contains an integer,  (the number of queries).
The  subsequent lines describe the queries, and each query is described over two lines:

If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
Constraints



Each element in is a 32-bit integer.
Output Format

Print the updated list  as a single line of space-separated integers.

Sample Input

5
12 0 1 78 12
2
Insert
5 23
Delete
0
Sample Output

0 1 78 12 23
Explanation


 Insert 23 at index .

 Delete the element at index .

Having performed all  queries, we print  as a single line of space-separated integers.


*/








import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */



    Scanner sc = new Scanner(System.in);

    LinkedList<Integer> list = new LinkedList<>();

    int n = sc.nextInt();

    for(int i=0;i<n;i++)
    {
        int num = sc.nextInt();
        list.add(num);
    }

    int q = sc.nextInt();

    for(int i= 0 ;i<q;i++)
    {

        String input = sc.next();

        if(input.equals("Insert"))
        {
            int pos = sc.nextInt();
            int val = sc.nextInt();

            list.add(pos,val);
        }
        else if(input.equals("Delete"))
        {
            int pos = sc.nextInt();
            list.remove(pos);
        }

    }

    for(Integer obj : list)
    {
        System.out.print(obj + " ");
    }


    sc.close();


    }
}
